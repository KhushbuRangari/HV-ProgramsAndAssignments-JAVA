import java.io.File;
import java.io.FileInputStream;

public class ReadFilePractice {
    public static void main(String[] args) {
        

        try {
            String fileName = "sample2.txt";
            File obj2 = new File (fileName);
            FileInputStream obj3 = new FileInputStream(obj2);
        
            int i;
            String data = " ";
            while (
                (i = obj3.read())!= -1
            )
             {
                data += ((char)i);
                System.out.print((char)i);
        
            }
            obj3.close();
            System.out.print(data);
        
        }
        catch (Exception e) {
            System.out.println("An exception occured.");
            }
            
    }
}
