package Main;


import finance.ActionHandler;
import finance.StockChart;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
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

        Label label1 = new Label("Enter stock price");
        Label label2 = new Label("Enter stock amount");

        TextField askForPrice = new TextField();
        askForPrice.setPromptText("example: 12.34");

        TextField askForQuantity = new TextField();
        askForQuantity.setPromptText("example: 76");

        StockChart stockChart = new StockChart();


        Insets margin = new Insets(2, 70, 0, 70); //Gives textbox margins

        button = new Button();
        button.setText("Calculate");

        VBox window = new VBox(); //Vertical box for all fields/buttons
        window.setSpacing(5);
        window.setAlignment(Pos.CENTER);

        ChoiceBox choiceBox = new ChoiceBox(FXCollections.observableArrayList("EST", "FIN/SWE", "USA")); //Country choices
        choiceBox.setTooltip(new Tooltip("Select country"));

        window.getChildren().add(label1); //Builds the window that asks for stuff
        window.getChildren().add(askForPrice);
        window.getChildren().add(label2);
        window.getChildren().add(askForQuantity);
        VBox.setMargin(askForPrice, margin);
        VBox.setMargin(askForQuantity, margin);
        window.getChildren().add(choiceBox);
        window.getChildren().add(button);
        window.getChildren().add(stockChart); //????

        Scene scene = new Scene(window, 400, 600); //Window properties
        primaryStage.setScene(scene);
        primaryStage.show();

        ActionHandler actionHandler = new ActionHandler(askForPrice, askForQuantity, choiceBox, stockChart);
        button.setOnAction(actionHandler);//Makes the button do the stuff told in the ActionHandler class


    }


}
