import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileHandlingBreakoutR {
    public static void main(String[] args) {
        
        try{

            File fo = new File("BRText.txt");
            Scanner sc = new Scanner(fo);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }sc.close();

            String text = "Contents to be appended: Certificate Program in Full Stack Development with Cloud for Web and Mobile 1-month Bootcamp on Programming Fundamentals, Offers MERN Stack and Java Spring Boot as specializations\n";
            byte[] byteInpt = text.getBytes();
            FileOutputStream fos = new FileOutputStream(fo,true);
            fos.write(byteInpt);
            fos.close();

        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
