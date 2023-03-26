import java.io.BufferedReader;
// import java.io.File;
import java.io.FileReader;
// import java.io.Reader;
// import java.util.Scanner;

public class readStudentUsingString {
    public static void main(String[] args) {
        String d = ",";
        String student;
        int sum=0;
        int headerlines =1;
        int rowcount=1;
        try {

            FileReader file = new FileReader("StudentCSV.csv");

            BufferedReader buffer = new BufferedReader(file);

            // Apply Loop
            while ((student = buffer.readLine()) != null) {
                // System.out.println(student);
                // The previous one would have printed in a wrong manner
                String[] newStudent = student.split(d);
               // System.out.println( newStudent[1]+" "+newStudent[2]);
               if(rowcount<=headerlines){
                rowcount +=rowcount;
                continue;
             }
                for (int i = 2; i < newStudent.length; i++) {
                   
                    sum=sum+ Integer.parseInt(newStudent[i]);
                }
                System.out.println(newStudent[1]+" Total of all the subjects is --> "+sum);
            }
            buffer.close();

        } catch (Exception e) {
            System.out.println("An error has occured" + e.getMessage());
            // TODO: handle exception
        }

    }
}
