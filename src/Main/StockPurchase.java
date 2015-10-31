package Main;


import java.util.Scanner;
import finance.FinanceClass;
import finance.Validations;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import static javafx.scene.paint.Color.DARKRED;


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
        askForPrice.setText("Enter stock price (example: 12.34)");

        TextField askForQuantity = new TextField();
        askForQuantity.setText("Enter number of stocks (example: 76)");

        button = new Button();
        button.setText("Calculate");

        VBox window = new VBox(); //Vertical box for all fields/buttons
        window.setSpacing(5);
        window.setAlignment(Pos.CENTER);

        window.getChildren().add(askForPrice); //Builds the window
        window.getChildren().add(askForQuantity);
        window.getChildren().add(button);

        Scene scene = new Scene(window, 400, 400); //Window properties
        primaryStage.setScene(scene);
        primaryStage.show();
        
//From here on the event management for button is broken
        button.setOnAction(event -> {
            public void (ActionEvent){
                System.out.println(stockPriceCents + " ja " + stockQuantity);
            }
        }); //User clicks button and event x happens
    }
    public static void (ActionEvent convert) {

        String askPriceResult = askForPrice.getText(); //Makes user's text input into String
        String askQuantityResult = askForQuantity.getText();

        double askPriceEuros = Double.parseDouble(askPriceResult); // Converts user input to Double (price in euros)
        double askQuantity = Double.parseDouble(askQuantityResult);

        int stockPriceCents = (int) askPriceEuros * 100; // Converts double to int (price in cents)
        int stockQuantity = (int) askQuantity;

    }





        //Scanner user = new Scanner(System.in);
        //System.out.println("Kui palju maksab aktsia, mida osta soovid?");
        //int stockPrice = (int) (user.nextDouble()*100); // Cast price to int in cents, only works with . not ,.

        //System.out.println("Mitu aktsiat soovid osta?");
        //int stockAmount = user.nextInt();

        //System.out.println("Aktsia hind on täna " + stockPrice + " senti." );
        //System.out.println("Soovid osta " + stockAmount + " aktsiat.");
    }
}
