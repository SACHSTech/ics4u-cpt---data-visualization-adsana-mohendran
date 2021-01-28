package CPT;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.stage.Stage;
import java.util.ArrayList;
 
 
/**
 * A chart that displays rectangular bars with heights indicating data values
 * for categories. Used for displaying information when at least one axis has
 * discontinuous or discrete data.
 */


 // graph food, shelter, electricity
 // x axis dates
 // y axis price index value 
public class BarChart extends Application {
    // get list into this class
         Records records;
        records  = new Records();
        records.readRecords();
        ArrayList<PI> recordList = records.getRecordList();
    private BarChart chart;
    private CategoryAxis xAxis;
    private NumberAxis yAxis;
 
    public Parent createContent() {
        String[] date = {"2020-07", "2020-08", "2020-09", "2020-10", "2020-11"};
        xAxis = new CategoryAxis();
        xAxis.setCategories(FXCollections.<String>observableArrayList(date));
        yAxis = new NumberAxis("Index Value", 0.0d, 100.0d, 200.0d);
        ObservableList<BarChart.Series> barChartData =
            FXCollections.observableArrayList(
              new BarChart.Series("Food", FXCollections.observableArrayList(
                new BarChart.Data(date[0], 155.8d),
                new BarChart.Data(date[1], 154.5d),
                new BarChart.Data(date[2], 153.3d),
                new BarChart.Data(date[3], 154.2d),
                new BarChart.Data(date[4], 155.0d))),
              new BarChart.Series("Shelter", FXCollections.observableArrayList(
                new BarChart.Data(date[0], 146.4d),
                new BarChart.Data(date[1], 146.8d),
                new BarChart.Data(date[2], 147.3d),
                new BarChart.Data(date[3], 148.3d),
                new BarChart.Data(date[4], 148.8d))),
              new BarChart.Series("Electricity", FXCollections.observableArrayList(
                new BarChart.Data(date[0], 147.1d),
                new BarChart.Data(date[1], 147.1d),
                new BarChart.Data(date[2], 148.2d),
                new BarChart.Data(date[3], 146.5d),
                new BarChart.Data(years[4], 146.8)))
            );
        chart = new BarChart(xAxis, yAxis, barChartData, 25.0d);
        return chart;
    }
 
    @Override public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(createContent()));
        primaryStage.show();
    }
 
    /**
     * Java main for when running without JavaFX launcher
     */
    public static void main(String[] args) {
        launch(args);
    }
}