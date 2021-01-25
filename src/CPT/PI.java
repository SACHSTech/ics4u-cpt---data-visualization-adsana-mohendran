package CPT;

import java.io.*;


public class PI{
    public static void main(String[] args){

        private int intdate;
        private String strgeo;
        private String strproducts;
        private double dblvalue;

        // BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        public PI(int Date, String Geo, String Products, double Value){
                this.intdate = Date;
                this.strgeo = Geo;
                this.strproducts = Products;
                this.dblvalue = Value;
        }
        
        public int getdate(){
            return this.intdate;
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
        
        try{
            // create a reader

            Reader reader = Files.newBufferedReader(Paths.get("src/CPT/PriceIndex.csv"));

            // columns name

            String[] columns = {"date", "geo","products","value"};

            // create a mapping strategy

            ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
            strategy.setType(PI.class);
            strategy.setColumnMapping(columns);

            // create csv bean reader
            CsvToBean csvToBean = new CsvToBeanBuilder(reader)
                    .withMappingStrategy(strategy)
                    .withSkipLines(1)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            // iterate through indexes

            for (PI pi: (Iterable<PI>) csvToBean){
                System.out.println("Date: " + PI.getDate());
                System.out.println("Geo: " + PI.getGeo());
                System.out.println("Products: " + PI.getProducts());
                System.out.println("Value: " + PI.getValue());
            }

            // close the reader
            reader.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }

            }

        }
            



    }
}
