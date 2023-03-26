import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;
public class NumberCSV {
   public static void main(String[] args) throws Exception {
      
      // specify the header lines in the csv file to skip
      int headerlines=2;
      int sum=0;
      
      // Read the csv file
      File file = new File("icecreame_csv");
      
      // Read all lines
      List<String> lines = Files.readAllLines(file.toPath(),StandardCharsets.UTF_8);
      
      // variable to hold int values after conversion
      int a;
      //current row number
      int rowcount=1;
      for (String line : lines) {
         
         //skip the number of header lines in csv file
         if (rowcount<=headerlines){
            rowcount=rowcount+1;
            continue;
         }
         String[] array = line.split(",", -1);
      
         //read the numbers from the second column after skipping the header lines
         a= Integer.parseInt(array[1]);
         System.out.println("Icecream Sales (in INR) for the month of "+ array[0] + " is "+ a);
        
         //Adding the numbers from the second column of CSV file
         sum =sum +a;
      }
      
      // printing the sum
      System.out.println("Total sum (in INR) for icecream sale in the given year is :" + sum);
   }
}