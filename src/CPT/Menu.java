package CPT;

import java.io.*;
import java.util.ArrayList;
public class Menu {

    public static void main(String[] args) throws IOException{
        // get list into this class
        private Records records;
        record = new records();
         ArrayList<PI> list = records.getList();
        
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
        // print out options
        int intOption;
        System.out.println("Select 1 to print records");
        System.out.println("Select 2 to search for records");
        System.out.println("Select 3 to sort records");
        System.out.println("Select an option");
        intOption = Integer.parseInt(key.readLine());

        // different cases

        switch(intOption){
            case 1:
            // to print records
            break;

            case 2:
            // to search records
            break;

            case 3:
            // to sort records
            break;
        }

        if (intOption >= 4){
            System.out.println("Invalid Menu Option");
        }



        




}
