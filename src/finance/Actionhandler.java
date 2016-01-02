package finance;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

/**
 * Created by kristi on 31/12/15.
 * Determines what happens on button press
 */
public class ActionHandler implements EventHandler<ActionEvent> {

    Finance finance = new Finance(); //Creates new instance of Finance to run calc.
    TextField priceTextField;
    TextField quantityTextField;
    ChoiceBox countryChoice;

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

    public ActionHandler(TextField _priceTextField, TextField _quantityTextField, ChoiceBox _countryChoice){
        priceTextField = _priceTextField;
        quantityTextField = _quantityTextField;
        countryChoice = _countryChoice;
    }


    @Override
    public void handle(ActionEvent event) {
        System.out.println("Hurraa!"+ countryChoice.getValue());

        Money stockPrice = ActionHandler.convertPrice(priceTextField);
        int stockPriceCents = stockPrice.getAmountCents();
        int stockQuantity = ActionHandler.convertQuantity(quantityTextField);

        String country = (String) countryChoice.getValue();

        switch (country){
            case "EST":
                finance.calculateEST(stockPriceCents, stockQuantity);
                break;
            case "FIN/SWE":
                finance.calculateFINSWE(stockPriceCents, stockQuantity);
                break;
            case "USA":
                finance.calculateUSA(stockPriceCents, stockQuantity);
                break;
            default:
                //TODO Panic
        }


        /*finance.calculateEST(stockPriceCents, stockQuantity); //Runs calculations EST
        finance.calculateFINSWE(stockPriceCents, stockQuantity); //Runs calculations FINSWE
        finance.calculateUSA(stockPriceCents, stockQuantity); //Runs calculations USA*/

    }
}
