import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadStudentWithScanner {
    public static void main(String[] args) throws FileNotFoundException {
        int rowcount  =1;
        int headerlines =1;
       try{
        File file = new File("StudentCSV.csv");
        Scanner sc =new Scanner(file);
        sc.useDelimiter(",");
        while(sc.hasNext()){
            
            
        }
        sc.close();

       }
       catch(Exception e){
        System.out.println(e);
       }
    }
}
