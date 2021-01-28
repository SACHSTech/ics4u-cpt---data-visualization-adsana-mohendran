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
        

            // finding max and min of values
            public double MinAndMaxValues(){
            ArrayList<PI> recordList = records.getRecordList();
        
        //declare min and max value as the first element of the list
         double dblMin = 0;
         double dblMax = 0;
        dblMin = recordList.get(0);
        dblMax = recordList.get(0);
        
        //declare min and max elements index as 0 (i.e. first element)
        double dblMinIndex = 0;
        double dblMaxIndex = 0;
        
        //Iterate through ArrayList
        int intCount =0;
        for(intCount = 1; intCount < recordList.size(); intCount++ ){
    
             /*
              * If current value is less than min value, it 
              * is new minimum value
              */
            
            if( recordList.get(intCount) < dblMin ){
                dblMin = recordList.get(intCount);
                dblMinIndex = intCount;
            }
            
            
             /*
              * If current value is greater than max value, it 
              * is new maximum value.
              */
            
            if( recordList.get(intCount) > dblMax ){
                dblMax = recordList.get(intCount);
                dblMaxIndex = intCount;
            }
 
        }
        
        System.out.println(" Min Value is: "  + dblMin + ", Found at index: " + dblMinIndex);
 
        System.out.println("ArrayList Max Value is: " + dblMax  + ", Found at index: " + dblMaxIndex);
        
    }
}
}
    
