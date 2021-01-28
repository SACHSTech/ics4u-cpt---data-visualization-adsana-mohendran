package CPT;
import java.io.*;
import java.util.ArrayList;


public class Statistic {
    // finding average and min/max values to use in menu
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

    // constructor receives records object
    public Statistic(){
    }
        
        /**
        *  find average of the price index value for products
        * @param intCount COunter variable
        * @param dblTotal  total value
        * @param dblAverage average of those values
        * @return dblAverage returning the average of price index values
        * @author Adsana
        */

        public double AverageOfValues(ArrayList<PI> recordList){
           
            int intCount = 0;
            double dblTotal = 0;
            double dblAverage = 0;
            for (intCount = 0; intCount < recordList.size(); intCount++){
                dblTotal += recordList.get(intCount).getvalue();
            }
                dblAverage = dblTotal/ recordList.size();
                    return dblAverage;
         }

         // find average of the price index value for products to be used in menu
          public double AverageOfValues(){
             ArrayList<PI> recordList = records.getRecordList();
    
            int intCount = 0;
            double dblTotal = 0;
            double dblAverage = 0;
            for (intCount = 0; intCount < recordList.size(); intCount++){
                dblTotal += recordList.get(intCount).getvalue();
            }
                dblAverage = dblTotal/ recordList.size();
                    return dblAverage;
           }
        
            /**
            * finding max and min of values
            * @param dblMin  minimum element
            * @param dblMax maximum element
            * @param dblMinIndex minimum element index
            * @param dblMaxIndex maximum element index
            * @param intCount  counter variable
            * @return return 0 for any exceptions
            * @author Adsana
            */

            public double MinAndMaxValues(){
            ArrayList<PI> recordList = records.getRecordList();
        
                //declare min and max value as the first element of the list
                double dblMin = 0;
                double dblMax = 0;
                dblMin = recordList.get(0).getvalue();
                dblMax = recordList.get(0).getvalue();
                
                //declare min and max elements index as 0 (i.e. first element)
                double dblMinIndex = 0;
                double dblMaxIndex = 0;
                
                //Iterate through ArrayList
                int intCount =0;
                for(intCount = 1; intCount < recordList.size(); intCount++ ){
    
                //If current value is less than min value, it is new minimum value
                if( recordList.get(intCount).getvalue() < dblMin ){
                    dblMin = recordList.get(intCount).getvalue();
                    dblMinIndex = intCount;
                }
        
                //If current value is greater than max value, is new maximum value
                if( recordList.get(intCount).getvalue() > dblMax ){
                    dblMax = recordList.get(intCount).getvalue();
                    dblMaxIndex = intCount;
                }
    
            }
        
                System.out.println("Min Value is: "  + dblMin + ", Found at index: " + dblMinIndex);
        
                System.out.println("Max Value is: " + dblMax  + ", Found at index: " + dblMaxIndex);
                return 0;
    }
}

    
