import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class ReadFileClassroom {
    public static void main(String[] args) {
         
        int headerlines=1;

        try{
            File file = new File("ReadFileClassroom.txt");
            List<String> lines =Files.readAllLines(file.toPath(),StandardCharsets.UTF_8);
            int rowcount=1;

            String sr ="Hi this is new line Added";
            while((lines)!=null){
                for(String line :lines){
                    if(rowcount<=headerlines){
                        rowcount +=rowcount;
                        System.out.println(line);
                        byte[] byteInpt = sr.getBytes();
                        FileOutputStream fos = new FileOutputStream(file,true);
                        fos.write(byteInpt);
                        fos.close();
                    }
                }
            }

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
