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


 // graph food, homeowners, services
 // x axis dates
 // y axis price index value 
public class BarGraph extends Application {
    // get list into this class
         Records records;
       
        ArrayList<PI> recordList;
    private BarChart chart;
    private CategoryAxis xAxis;
    private NumberAxis yAxis;
 
    public BarGraph (){
      records  = new Records();
      records.readRecords();
      recordList = records.getRecordList();
    }
    public Parent createContent() {
      
        String[] date = {"2020-07", "2020-08", "2020-09", "2020-10", "2020-11"};
        ArrayList<PI> foodRecords1 = records.searchDate2("2020-07","Food");
        ArrayList<PI> foodRecords2 = records.searchDate2("2020-08","Food");
        ArrayList<PI> foodRecords3 = records.searchDate2("2020-09","Food");
        ArrayList<PI> foodRecords4 = records.searchDate2("2020-10","Food");
        ArrayList<PI> foodRecords5 = records.searchDate2("2020-11","Food");
        ArrayList<PI> foodRecords6 = records.searchDate2("2020-07","Homeowners");
        ArrayList<PI> foodRecords7 = records.searchDate2("2020-08","Homeowners");
        ArrayList<PI> foodRecords8 = records.searchDate2("2020-09","Homeowners");
        ArrayList<PI> foodRecords9 = records.searchDate2("2020-10","Homeowners");
        ArrayList<PI> foodRecords10 = records.searchDate2("2020-11","Homeowners");
        ArrayList<PI> foodRecords11 = records.searchDate2("2020-07","Services");
        ArrayList<PI> foodRecords12 = records.searchDate2("2020-08","Services");
        ArrayList<PI> foodRecords13 = records.searchDate2("2020-09","Services");
        ArrayList<PI> foodRecords14 = records.searchDate2("2020-10","Services");
        ArrayList<PI> foodRecords15 = records.searchDate2("2020-11","Services");
        System.out.println("Food Records" + foodRecords1.size());
        System.out.println("Food Records" + foodRecords2.size());
        System.out.println("Food Records" + foodRecords3.size());
        System.out.println("Food Records" + foodRecords4.size());
        System.out.println("Food Records" + foodRecords5.size());
        System.out.println("Homeowners Records" + foodRecords6.size());
        System.out.println("Homeowners Records" + foodRecords7.size());
        System.out.println("Homeowners Records" + foodRecords8.size());
        System.out.println("Homeowners Records" + foodRecords9.size());
        System.out.println("Homeowners Records" + foodRecords10.size());
        System.out.println("Services Records" + foodRecords11.size());
        System.out.println("Services Records" + foodRecords12.size());
        System.out.println("Services Records" + foodRecords13.size());
        System.out.println("Services Records" + foodRecords14.size());
        System.out.println("Services Records" + foodRecords15.size());
        xAxis = new CategoryAxis();
        xAxis.setCategories(FXCollections.<String>observableArrayList(date));
        yAxis = new NumberAxis("Index Value", 0.0d, 200.0d, 400.0d);
        ObservableList<BarChart.Series> barChartData =
            FXCollections.observableArrayList(
              new BarChart.Series("Food", FXCollections.observableArrayList(
                new BarChart.Data(date[0], foodRecords1.get(0).getvalue()),
                new BarChart.Data(date[1], foodRecords2.get(0).getvalue()),
                new BarChart.Data(date[2], foodRecords3.get(0).getvalue()),
                new BarChart.Data(date[3], foodRecords4.get(0).getvalue()),
                new BarChart.Data(date[4], foodRecords5.get(0).getvalue()))),
              new BarChart.Series("Homeowners", FXCollections.observableArrayList(
                new BarChart.Data(date[0], foodRecords6.get(1).getvalue()),
                new BarChart.Data(date[1], foodRecords7.get(1).getvalue()),
                new BarChart.Data(date[2], foodRecords8.get(1).getvalue()),
                new BarChart.Data(date[3], foodRecords9.get(1).getvalue()),
                new BarChart.Data(date[4], foodRecords10.get(1).getvalue()))),
              new BarChart.Series("Services", FXCollections.observableArrayList(
                new BarChart.Data(date[0], foodRecords11.get(2).getvalue()),
                new BarChart.Data(date[1], foodRecords12.get(2).getvalue()),
                new BarChart.Data(date[2], foodRecords13.get(2).getvalue()),
                new BarChart.Data(date[3], foodRecords14.get(2).getvalue()),
                new BarChart.Data(date[4], foodRecords15.get(2).getvalue())))
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