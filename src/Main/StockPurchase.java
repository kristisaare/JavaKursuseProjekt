package Main;


import java.util.Scanner;
import finance.FinanceClass;
import finance.Validations;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;


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
        askForPrice.setText("Enter stock price (for example 12.34)");

        TextField askForQuantity = new TextField();
        askForQuantity.setText("Enter number of stocks (for example 76)");

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

        //double stockPrice = askForPrice.getText();//Figure out how to convert this
        //int stockAmount = askForQuantity.getText(); // Figure out how to convert this





        //Scanner user = new Scanner(System.in);
        //System.out.println("Kui palju maksab aktsia, mida osta soovid?");
        //int stockPrice = (int) (user.nextDouble()*100); // Cast price to int in cents, only works with . not ,.

        //System.out.println("Mitu aktsiat soovid osta?");
        //int stockAmount = user.nextInt();

        //System.out.println("Aktsia hind on täna " + stockPrice + " senti." );
        //System.out.println("Soovid osta " + stockAmount + " aktsiat.");
    }
}
