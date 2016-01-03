package finance;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;

import java.util.HashMap;

/**
 * Created by kristi on 03/01/16.
 */
public class StockChart extends VBox { //Chart testing

    public StockChart() {
        super();//May not be necessary

    }

    public void displayResults(HashMap<String, Money> results){
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();

        final BarChart<String,Number> barChart = new BarChart<>(xAxis,yAxis);

        clearResults(); //Clears previous chart for new calculations

        xAxis.setLabel("Bank name");
        yAxis.setLabel("Fee size");

        XYChart.Series feeSeries = new XYChart.Series();
        feeSeries.setName("Stock price comparison");

        for (HashMap.Entry<String, Money> valuePair : results.entrySet())  {
            feeSeries.getData().add(new XYChart.Data(valuePair.getKey(), valuePair.getValue().getAmountAsDouble()));
        }

        barChart.getData().add(feeSeries);

        getChildren().add(barChart);

    }

    public void clearResults(){
        getChildren().clear();
    }


}