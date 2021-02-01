package CPT;

import java.io.*;
import java.util.*;

public class PI{
    // creating objects and printing out records from csv file
        private String strdate;
        private String strgeo;
        private String strproducts;
        private double dblvalue;

        public PI(String Date, String Geo, String Products, double Value){
                this.strdate = Date;
                this.strgeo = Geo;
                this.strproducts = Products;
                this.dblvalue = Value;
        }
        // getter methods
        public String getdate(){
            return this.strdate;
        }

        public String getgeo(){
            return this.strgeo;
        }

        public String getproducts(){
            return this.strproducts;
        }

        public double getvalue(){
            return this.dblvalue;
        }
        public String toString(){
            return this.strdate + " " + this.strgeo + " " + this.strproducts + " " +  this.dblvalue ;
        }
        public static void main(String[] args){

            // store PI records
            ArrayList<PI> recordList = new ArrayList<PI>();
            try{
                BufferedReader br = new BufferedReader(new FileReader("src/CPT/PriceIndex2.csv"));
                String line = "";
                line = br.readLine();
                while((line = br.readLine()) != null){
                    String[] records = line.split(",");
                    System.out.println("Date: " + records[0] + ", Geo: " + records[1] + ", Products/Products Group:  " + records[2] + ", Value: " + records[3]);
                    PI pi = new PI(records[0],records[1],records[2], Double.parseDouble(records[3]));

                    recordList.add(pi);
                }
                br.close();
            }catch (FileNotFoundException e){
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
            }

            System.out.println(recordList);
    }
}
