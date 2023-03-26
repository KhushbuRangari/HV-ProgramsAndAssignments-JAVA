import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadScanner {
    public static void main(String[] args) throws FileNotFoundException {
        
        File fo =new File("test2.txt");
        Scanner sc = new Scanner(fo);
        while(sc.hasNext()){
            System.out.println(sc.nextLine());
        }
        sc.close();

    }
}
