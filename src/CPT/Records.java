package CPT;

import java.io.*;



public class Records{
    public static void main(String[] args) throws IOException{
    
     BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
        // reading csv file


        try{
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/adsan/Desktop/ICS4U1/PriceIndex.csv"));
           String line = "";
            while((line = br.readLine()) != null){
                String[] records = line.split(",");
                System.out.println("Date: " + records[0] + ", Geo: " + records[1] + ", Products/Products Group:  " + records[2] + ", Value: " + records[3]);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

      
    }
}
