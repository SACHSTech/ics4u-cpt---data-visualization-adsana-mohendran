package CPT;

import java.io.BufferedReader;

public class PriceIndex {
     
    public static void main(String[] args) throws IOException{

        String strInput = "";
        String strRecord[];
        int intDate[];
        String strGeo[];
        String strProducts[];
        double dblValue[];
        
        int intRecCount = 0;

        // read csv file

        BufferedReader readFile = new BufferedReader(new FileReader("PriceIndex.csv"));
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
        // count record
        while((strInput = readFile.readLine())!= null){
            intRecCount++;
        }
        readFile.close();

        // creating a size for the array to store records
        strRecord = new String[intRecCount];
        intDate = new int[intRecCount-1];
        strGeo = new String[intRecCount];
        strProducts = new String[intRecCount-1];
        dblValue = new double[intRecCount-1];

        // open file 
        readFile = new BufferedReader(new FileReader("PriceIndex.csv"));

        // input info
        int intCount = 0;
        for (intCount = 0; intCount < strRecord.length; intCount++){
            strRecord[intCount] = readFile.readLine();
        }

        // input data per record
        for (intCount = 1; intCount < strRecord.length; intCount++){
            StringTokenizer strToken = new StringTokenizer (strRecord[intCount], ",");
             
             while (strToken.hasMoreElements()){
                 intDate[intCount-1] = Integer.parseInt(strToken.nextElement().toString());
                 strGeo[intCount-1] = strToken.nextElement().toString();
                 strProducts[intCount-1] = strToken.nextElement().toString();
                 dblValue[intCount-1] = Double.parseDouble(strToken.nextElement().toString());
             }
        }
        



    }

}

