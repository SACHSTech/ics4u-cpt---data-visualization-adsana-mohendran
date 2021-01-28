package CPT;

import java.io.*;
import java.util.ArrayList;
public class Menu {

    public static void main(String[] args) throws IOException{
        // get list into this class
         Records records;
        records  = new Records();
        records.readRecords();
        ArrayList<PI> recordList = records.getRecordList();
       //  ArrayList<PI> recordList = records.getList();
        String date = "";
        String geo = "";
        String product = "";
        double value = 0;
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
        Statistic statistics = new Statistic(records);
        double dblAverage = 0;
        // print out options
        int intOption = 0;
        int intChoice = 0;
        PI pi = null;
        do{

        
        System.out.println("Select 1 to print records");
        System.out.println("Select 2 to search for records");
        System.out.println("Select 3 to sort records");
        System.out.println("Select 4 to find average");
        System.out.println("Select 5 for indivudual record");
        System.out.println("Select 6 for records by index");
        System.out.println("Select an option");
        intOption = Integer.parseInt(key.readLine());

        // different cases

        switch(intOption){
            case 0:
            System.out.println("Goodbye");
            break;
            case 1:
            // to print records
            records.printRecords();
            break;

            case 2:
            // to search records
            System.out.println("Please enter a date");
            date = key.readLine();
            records.searchDateAll(date);
           
            break;

            case 3:
            // to sort records
            records.sortRecordsByDate();
            records.printRecords();
            break;

            case 4:
            // print staitisitcs
            dblAverage = statistics.AverageOfValues();
            System.out.println("The average is: " +dblAverage);
            break;

            case 5:
            // search individual record
            System.out.println("1. Search date 2. Search Geo 3. Search Product 4. Search Value");
            intChoice = Integer.parseInt(key.readLine());
            if (intChoice == 1){
                System.out.println("Please enter a date");
            date = key.readLine();
           pi = records.searchDate(date);
           if (pi != null){
               System.out.println(pi);
           }
           else{
               System.out.println(date + " not found");
           }
            }
            if (intChoice == 2){
                System.out.println("Please enter the geo");
            geo = key.readLine();
           pi = records.searchGeo(geo);
           if (pi != null){
               System.out.println(pi);
           }
           else{
               System.out.println(geo + " not found");
           }
            }
            if (intChoice == 3){
                System.out.println("Please enter the product");
            product = key.readLine();
           pi = records.searchProduct(product);
           if (pi != null){
               System.out.println(pi);
           }
           else{
               System.out.println(product + " not found");
           }
            }
            if (intChoice == 4){
                System.out.println("Please enter a value");
            value = key.readLine();
           pi = records.searchValue(value);
           if (pi != null){
               System.out.println(pi);
           }
           else{
               System.out.println(value + " not found");
           }
            }
            break;

            case 6:
            System.out.println("Please enter record number");
            intChoice = Integer.parseInt(key.readLine());
            if (intChoice > 0 && intChoice < recordList.size())
            {
                pi = recordList.get(intChoice);
                if (pi != null){
                    System.out.println(pi);
                }
                else{
                    System.out.println("Record not available");
                }
            }
            else{
                System.out.println("Record number out of bounds");
            }
            break;
        default:

        
            System.out.println("Invalid Menu Option");
        } // end switch
        // pause 
        System.out.println("Enter key to continue");
        key.readLine();
    } while(intOption != 0);
}
}
