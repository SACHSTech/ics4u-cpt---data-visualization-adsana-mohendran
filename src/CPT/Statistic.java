package CPT;
import java.io.*;
import java.util.ArrayList;


public class Statistic {
    Records records;
    public static void main(String[] args) throws IOException{
        // get list into this class
         Records records;
        records = new Records();
        
        
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    }
    // constructor receives records object
    public Statistic(Records records){
        this.records = records;
    }
        // find average of the price index value for products
        public double AverageOfValues(){
            ArrayList<PI> recordList = records.getRecordList();
            //double dblSum = 0;
            int intCount = 0;
            double dblTotal = 0;
            double dblAverage = 0;
            for (intCount = 0; intCount < recordList.size(); intCount++){
                dblTotal += recordList.get(intCount).getvalue();
            }
                dblAverage = dblTotal/ recordList.size();
               // System.out.println("The average is: " + dblAverage);
                    return dblAverage;
            }
}
    
