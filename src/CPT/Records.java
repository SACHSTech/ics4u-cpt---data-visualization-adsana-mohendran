package CPT;

import java.io.*;
import java.util.*;


public class Records{
    // store Price Index records
    // creating methods to print, sort, and search

    private ArrayList<PI> recordList = new ArrayList<PI>();
    public ArrayList<PI> getRecordList() {
        return recordList;
    }

    public Records(){

    }
    // read records
    public void readRecords() {
      
        // reading csv file
        try{
            BufferedReader br = new BufferedReader(new FileReader("src/CPT/PriceIndex2.csv"));
           String line = "";
           line = br.readLine();
            while((line = br.readLine()) != null){
                String[] records = line.split(",");
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
    /**
    * search and print the first record that comes up
    * @param date  date from csv file
    * @return returns null to show reference doesn't point to anything
    * @author Adsana
    */
    public PI searchDate(String date){
        for (PI pi:recordList){
            if (pi.getdate().equals(date)){
                return pi;
            }
        }
            return null;
    }
    /**
    * search the record with given date and product name
    * @param date  date from csv file
    * @param term  different product names 
    * @return returns results of the date and the product it refers to
    * @author Adsana
    */
     
    public ArrayList<PI> searchDate2(String date, String term){
        ArrayList<PI> results = new ArrayList<PI>();
        term = term.toLowerCase();
        for (PI pi:recordList){
            if (pi.getdate().equals(date)){
                if (pi.getproducts().toLowerCase().contains(term)){
                    results.add(pi);
                }
                
            }
        }
            return results;
    }
    // search and print all matching records
    public void searchDateAll(String date){
        for (PI pi:recordList){
            if (pi.getdate().equals(date)){
                System.out.println(pi); 
            }
        }
    }    
    /**
    * search and print all matching records
    * @param geo  geography from csv file
    * @return returns results of the geo searched
    * @author Adsana
    */
    public ArrayList<PI> searchGeos(String geo){
        ArrayList<PI> results = new ArrayList<PI>();
        for (PI pi:recordList){
            if (pi.getgeo().equals(geo)){
                    results.add(pi);
            }       
        }
            return results;
    }
    /**
    * search and print all matching records
    * @param products  products from csv file
    * @return returns results of the products searched
    * @author Adsana
    */
    public ArrayList<PI> searchProducts(String products){
        ArrayList<PI> results = new ArrayList<PI>();
        for (PI pi:recordList){
            if (pi.getproducts().equals(products)){
                    results.add(pi);
            } 
        }
            return results;
    }
    
    /**
    * search and print the first record that comes up
    * @param geo  geo from csv file
    * @return returns null to show reference doesn't point to anything
    * @author Adsana
    */
    public PI searchGeo(String geo){
        for (PI pi:recordList){
            if (pi.getgeo().equals(geo)){
                   return pi;
                } 
        }
            return null;
    }
   
    /**
    * search and print the first record that comes up
    * @param value index values from csv file
    * @return returns null to show reference doesn't point to anything
    * @author Adsana
    */
    public PI searchValue(Double value){
        for (PI pi:recordList){
            if (pi.getvalue() == (value)){
                   return pi;
            }   
        }
            return null;
    }
    /**
    * search and print the first record that comes up
    * @param products products from csv file
    * @return returns null to show reference doesn't point to anything
    * @author Adsana
    */
    public PI searchProduct(String products){
        for (PI pi:recordList){
            if (pi.getproducts().equals(products)){
                    return pi;
            }
        }
            return null;
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
           // System.out.println("Please enter a date");
            //date = key.readLine();
           // PI pi = records.searchDate(date);
          //  if (pi != null){
               // System.out.println(pi);
           // }
           // else {
            //    System.out.println("Can't find date");
          //  }

    }
}
