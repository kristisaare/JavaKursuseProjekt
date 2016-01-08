package finance;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by kristi on 31/12/15.
 * Determines what happens on button press
 */
public class ActionHandler implements EventHandler<ActionEvent> {

    Finance finance = new Finance(); //Creates new instance of Finance to run calc.
    TextField priceTextField;
    TextField quantityTextField;
    ChoiceBox countryChoice;
    StockChart stockChart;
    Label resultsLabel;

    public static Money convertPrice(TextField askForPrice) {

        String askPriceResult = askForPrice.getText(); //Makes user's text input into String
        double askPriceEuros = Double.parseDouble(askPriceResult); // Converts user input to Double (price in euros)
        int stockPriceCents = (int) (askPriceEuros * 100); // Converts double to int (price in cents)
        Money amount = new Money(askPriceEuros);
        return amount;

    }
    public static int convertQuantity(TextField askForQuantity){

        String askQuantityResult = askForQuantity.getText();
        double askQuantity = Double.parseDouble(askQuantityResult);
        int stockQuantity = (int) askQuantity;
        return stockQuantity;
    }

    public ActionHandler(TextField _priceTextField,
                         TextField _quantityTextField,
                         ChoiceBox _countryChoice,
                         StockChart _stockChart,
                         Label _resultsLabel){
        priceTextField = _priceTextField;
        quantityTextField = _quantityTextField;
        countryChoice = _countryChoice;
        stockChart = _stockChart;
        resultsLabel = _resultsLabel;
    }


    @Override
    public void handle(ActionEvent event) {
        System.out.println("Hurraa! "+ countryChoice.getValue());

        Money stockPrice = ActionHandler.convertPrice(priceTextField);
        int stockPriceCents = stockPrice.getAmountCents();
        int stockQuantity = ActionHandler.convertQuantity(quantityTextField);

        String country = (String) countryChoice.getValue();

        HashMap<String, Money> results;

        switch (country){ //Activates country appropriate calculations
            case "EST":
                results = finance.calculateEST(stockPriceCents, stockQuantity);
                break;
            case "FIN/SWE":
                results = finance.calculateFINSWE(stockPriceCents, stockQuantity);
                break;
            case "USA":
                results = finance.calculateUSA(stockPriceCents, stockQuantity);
                break;
            default:
                return; 
        }

        stockChart.displayResults(results);
        Money lowestFee = finance.findLowestFee(results);
        System.out.println(lowestFee.getAmountAsDouble());
        double feePercent = finance.feeImpactPercent(lowestFee, stockPrice, stockQuantity);
        System.out.println(feePercent);
        boolean feeIsReasonable = feePercent<=Finance.reasonableFeePercent;

        displayResultsText(results, lowestFee, feePercent, feeIsReasonable);

    }

    public void displayResultsText(HashMap<String, Money> results,
                                   Money lowestFee,
                                   double feePercent,
                                   boolean feeIsReasonable){
        ArrayList cheapestBanks = new ArrayList();
        for (HashMap.Entry<String, Money> valuePair : results.entrySet()){
            if (lowestFee.getAmountCents()==valuePair.getValue().getAmountCents()){
                cheapestBanks.add(valuePair.getKey());
            }
        }

        String feedback = new String("Minimum purchase fee is " +lowestFee.getAmountAsDouble()+" euro(s). \n" +
                "Cheapest bank for you is "+ String.join(" or ", cheapestBanks)+" . \n" +
                "The fee makes up "+feePercent+"% of the purchase price. \n");

        String feedbackPositive = new String("This is a reasonably big purchase.");
        String feedbackNegative = new String("You should consider making a bigger purchase.");

        if (feeIsReasonable){
            feedback = feedback + feedbackPositive;
        } else {
            feedback = feedback + feedbackNegative;
        }
        System.out.println(feedback);
        resultsLabel.setText(feedback);
    }

}
