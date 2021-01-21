package CPT;

import java.io.*;


public class DataFile{
    public static void main(String[] args) throws IOException{
        // reading csv file

        String line = "";
        
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/adsan/Desktop/ICS4U1/PriceIndex.csv"));
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
