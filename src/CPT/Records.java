package CPT;

import java.io.*;


public class Records{
    public static void main(String[] args) throws IOException{
     
        // reading csv file


        try{
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/adsan/Desktop/ICS4U1/PriceIndex.csv"));
           String line = "";
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

      
    }
}
