package CPT;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import java.util.ArrayList;
 
 
public class MyLineGraph extends Application {
    // get list into this class
    //Records records;
   // records  = new Records();
   // records.readRecords();
   // ArrayList<PI> recordList = records.getRecordList();
    // graph internet service, 
    
    @Override public void start(Stage stage) {
        Records records;
        records  = new Records();
        records.readRecords();
        Statistic statistic = new Statistic();
        String[] date = {"2020-07", "2020-08", "2020-09", "2020-10", "2020-11"};
        ArrayList<PI> foodRecords1 = records.searchDate2("2020-07","Food");
        ArrayList<PI> foodRecords2 = records.searchDate2("2020-08","Food");
        ArrayList<PI> foodRecords3 = records.searchDate2("2020-09","Food");
        ArrayList<PI> foodRecords4 = records.searchDate2("2020-10","Food");
        ArrayList<PI> foodRecords5 = records.searchDate2("2020-11","Food");
        double[] foods = new double[5];
        foods[0] = statistic.AverageOfValues(foodRecords1);
        System.out.println("Foods" + foods[0]);
        foods[1] = statistic.AverageOfValues(foodRecords2);
        foods[2] = statistic.AverageOfValues(foodRecords3);
        foods[3] = statistic.AverageOfValues(foodRecords4);
        foods[4] = statistic.AverageOfValues(foodRecords5);
        // homeowners series
        ArrayList<PI> homeownersRecords1 = records.searchDate2("2020-07","homeowners");
        ArrayList<PI> homeownersRecords2 = records.searchDate2("2020-08","homeowners");
        ArrayList<PI> homeownersRecords3 = records.searchDate2("2020-09","homeowners");
        ArrayList<PI> homeownersRecords4 = records.searchDate2("2020-10","homeowners");
        ArrayList<PI> homeownersRecords5 = records.searchDate2("2020-11","homeowners");
        double[] homeowners = new double[5];
        homeowners[0] = statistic.AverageOfValues(homeownersRecords1);
        System.out.println("Homeowners" + homeowners[0]);
        homeowners[1] = statistic.AverageOfValues(homeownersRecords2);
        homeowners[2] = statistic.AverageOfValues(homeownersRecords3);
        homeowners[3] = statistic.AverageOfValues(homeownersRecords4);
        homeowners[4] = statistic.AverageOfValues(homeownersRecords5);
        stage.setTitle("Line Chart");
        //defining the axes
        final NumberAxis xAxis = new NumberAxis(0,6,1);
        final NumberAxis yAxis = new NumberAxis(100,250,150);
        xAxis.setLabel("Date");
        //creating the chart
        final LineChart<Number,Number> lineChart = 
                new LineChart<Number,Number>(xAxis,yAxis);
                
        lineChart.setTitle("Comparing Services");
        //defining a series
        XYChart.Series foodseries = new XYChart.Series();
        foodseries.setName("Food");
        //populating the series with data
        foodseries.getData().add(new XYChart.Data(1, foods[0]));
        foodseries.getData().add(new XYChart.Data(2, foods[1]));
        foodseries.getData().add(new XYChart.Data(3, foods[2]));
        foodseries.getData().add(new XYChart.Data(4, foods[3]));
        foodseries.getData().add(new XYChart.Data(5, foods[4]));

        XYChart.Series homeownersseries = new XYChart.Series();
        homeownersseries.setName("Homeowners");
        homeownersseries.getData().add(new XYChart.Data(1, homeowners[0]));
        homeownersseries.getData().add(new XYChart.Data(2, homeowners[1]));
        homeownersseries.getData().add(new XYChart.Data(3, homeowners[2]));
        homeownersseries.getData().add(new XYChart.Data(4, homeowners[3]));
        homeownersseries.getData().add(new XYChart.Data(5, homeowners[4]));
       // series.getData().add(new XYChart.Data(6, 36));
       // series.getData().add(new XYChart.Data(7, 22));
       // series.getData().add(new XYChart.Data(8, 45));
      //  series.getData().add(new XYChart.Data(9, 43));
      //  series.getData().add(new XYChart.Data(10, 17));
      //  series.getData().add(new XYChart.Data(11, 29));
      //  series.getData().add(new XYChart.Data(12, 25));
        
        Scene scene  = new Scene(lineChart,800,600);
        lineChart.getData().add(foodseries);
        lineChart.getData().add(homeownersseries);
       
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}