import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class StudentCSV {
    public static void main(String[] args) {

        try {

            int header = 1;
            int rowcount = 1;

            String data;
            File file = new File("StudentCSV.csv");
            InputStream inputFS = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(inputFS));

            while ((data = br.readLine()) != null) {
                int sum = 0;
                if (rowcount <= header) {
                    rowcount += 1;
                    continue;
                }
                String[] arr = data.split(",", -1);
                for (int i = 2; i < arr.length; i++) {
                    sum = sum + Integer.parseInt(arr[i]);
                }
                System.out.println(arr[1] + " total marks : " + sum);
            }
            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
