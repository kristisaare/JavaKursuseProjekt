package Main;


import finance.Finance;
import finance.Money;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.Scene;



/**
 * Created by kristi on 11/10/15.
 */
public class StockPurchase extends Application {

    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Calculations");

        TextField askForPrice = new TextField();
        askForPrice.setPromptText("Enter stock price (example: 12.34)");

        TextField askForQuantity = new TextField();
        askForQuantity.setPromptText("Enter number of stocks (example: 76)");

        Finance finance = new Finance(); //Creates new instance of Finance to run calc.

        Insets margin = new Insets(0, 70, 0, 70); //Gives textbox margins

        button = new Button();
        button.setText("Calculate");

        VBox window = new VBox(); //Vertical box for all fields/buttons
        window.setSpacing(5);
        window.setAlignment(Pos.CENTER);

        window.getChildren().add(askForPrice); //Builds the window that asks for stuff
        window.getChildren().add(askForQuantity);
        window.setMargin(askForPrice, margin);
        window.setMargin(askForQuantity, margin);
        window.getChildren().add(button);

        Scene scene = new Scene(window, 400, 400); //Window properties
        primaryStage.setScene(scene);
        primaryStage.show();

        button.setOnAction((event) -> {
            Money stockPrice = StockPurchase.convertPrice(askForPrice);
            int stockPriceCents = stockPrice.getAmountCents();
            int stockQuantity = StockPurchase.convertQuantity(askForQuantity);
            finance.calculateEST(stockPriceCents, stockQuantity); //Runs calculations

            System.out.println("The stock costs " + stockPriceCents + " cents and you wish to buy " + stockQuantity + ".");
        });

    }
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

}
