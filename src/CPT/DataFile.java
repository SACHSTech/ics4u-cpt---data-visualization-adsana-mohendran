package CPT;

import java.io.*;

public class DataFile{
    public static void main(String[] args) throws IOException{
    
        try{
            BufferedReader br = new BufferedReader(new FileReader("PriceIndex.csv"));
            String strPriceIndex;
            while((strPriceIndex = br.readLine()) != null){
                System.out.println(strPriceIndex);
            }
        } catch (IOException e){
            
        }

    }
}
