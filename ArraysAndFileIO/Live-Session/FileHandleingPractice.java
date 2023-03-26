import java.io.File;
import java.io.FileOutputStream;

public class FileHandleingPractice {
    public static void main(String[] args) {
        try {
            String fName = "test2.txt";
            File fo = new File(fName);

            if (fo.createNewFile())
                System.out.println("true");
            else
                System.out.println("fasle");
            String text = "java needs practice\n";
            byte[] byteInpt = text.getBytes();
            FileOutputStream fos = new FileOutputStream(fo,true);
            fos.write(byteInpt);
            fos.close();
        
        }
     
        catch (Exception e) {
            System.out.println("Exception occurred" + e);
        }

    }
}
