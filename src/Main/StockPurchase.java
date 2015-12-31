package Main;


import finance.ActionHandler;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
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
        primaryStage.setTitle("Stock purchase calculations");

        TextField askForPrice = new TextField();
        askForPrice.setPromptText("Enter stock price (example: 12.34)");

        TextField askForQuantity = new TextField();
        askForQuantity.setPromptText("Enter number of stocks (example: 76)");


        Insets margin = new Insets(0, 70, 0, 70); //Gives textbox margins

        button = new Button();
        button.setText("Calculate");

        VBox window = new VBox(); //Vertical box for all fields/buttons
        window.setSpacing(5);
        window.setAlignment(Pos.CENTER);

        ChoiceBox choiceBox = new ChoiceBox(FXCollections.observableArrayList("EST", "FIN/SWE", "USA")); //Country choices
        choiceBox.setTooltip(new Tooltip("Select country"));

        window.getChildren().add(askForPrice); //Builds the window that asks for stuff
        window.getChildren().add(askForQuantity);
        window.setMargin(askForPrice, margin);
        window.setMargin(askForQuantity, margin);
        window.getChildren().add(choiceBox);
        window.getChildren().add(button);

        Scene scene = new Scene(window, 400, 400); //Window properties
        primaryStage.setScene(scene);
        primaryStage.show();

        ActionHandler actionHandler = new ActionHandler(askForPrice, askForQuantity, choiceBox);
        button.setOnAction(actionHandler);//Makes the button do the stuff told in the ActionHandler class
    }



}
