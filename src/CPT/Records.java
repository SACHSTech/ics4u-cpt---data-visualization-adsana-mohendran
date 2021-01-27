package CPT;

import java.io.*;
import java.util.*;


public class Records{
    // store PI records
    private ArrayList<PI> recordList = new ArrayList<PI>();
    public ArrayList<PI> getRecordList() {
        return recordList;
    }

    public Records()
    {}
    // read records

    public void readRecords()
    {
      
        // reading csv file


        try{
            BufferedReader br = new BufferedReader(new FileReader("src/CPT/PriceIndex2.csv"));
           String line = "";
           line = br.readLine();
            while((line = br.readLine()) != null){
                String[] records = line.split(",");
               // System.out.println("Date: " + records[0] + ", Geo: " + records[1] + ", Products/Products Group:  " + records[2] + ", Value: " + records[3]);
                PI pi = new PI(records[0],records[1],records[2], Double.parseDouble(records[3]));

                recordList.add(pi);
            }
            br.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    // print records
    public void printRecords(){
        for (PI pi:recordList){
            System.out.println(pi);
        }
    }
    // search records
    public PI searchDate(String date){
        for (PI pi:recordList){
            if (pi.getdate().equals(date)){
                return pi;
            }
        }
            return null;
    }
    // search records
    public void searchDateAll(String date){
        for (PI pi:recordList){
            if (pi.getdate().equals(date)){
                System.out.println(pi);
                
            }
        }
            
    }
    // sort records by date
    public void sortRecordsByDate(){
        
        int n = recordList.size(); 
        int intCount;
        int intCount2;
        
        for (intCount = 0; intCount < n-1; intCount++) { 
            // Find the minimum element in unsorted array 
            int min = intCount; 
            for (intCount2 = intCount+1; intCount2 < n; intCount2++) 
                if (recordList.get(intCount2).getdate().compareTo( recordList.get(min).getdate()) < 0) 
                    min = intCount2; 
  
            // Swap the found minimum element with the first 
            // element 
            PI temp = recordList.get(min); 
            recordList.set(min, recordList.get(intCount)); 
            recordList.set(intCount, temp); 
        } 
        /*
            int n = recordList.size(); 
            for (int i = 0; i < n-1; i++){
                for (int j = 0; j < n-i-1; j++){ 
                    if (recordList.get(j).getdate().compareTo( recordList.get(j+1).getdate()) > 0)
                    { 
                        // swap records
                        PI temp = recordList.get(j); 
                        recordList.set(j, recordList.get(j+1)); 
                        recordList.set(j+1,temp); 
                    } 
                }
            }
            */
        } 
    
    public static void main(String[] args) throws IOException{
         BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    Records records = new Records();
    records.readRecords();
    //records.printRecords();
    records.sortRecordsByDate();
    records.printRecords();
String date = null;
// search for date
System.out.println("Please enter a date");
date = key.readLine();
// records.searchDateAll(date);
System.out.println("Please enter a date");
date = key.readLine();
PI pi = records.searchDate(date);
if (pi != null){
    System.out.println(pi);
}
else {
    System.out.println("Can't find date");
}





/*
     BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
        // reading csv file


        try{
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/adsan/Desktop/ICS4U1/PriceIndex.csv"));
           String line = "";
            while((line = br.readLine()) != null){
                String[] records = line.split(",");
                System.out.println("Date: " + records[0] + ", Geo: " + records[1] + ", Products/Products Group:  " + records[2] + ", Value: " + records[3]);
                PI pi = new PI(records[0],records[1],records[2], Double.parseDouble(records[3]));

                recordList.add(pi);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

      */
    }
}
