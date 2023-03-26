
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class TennisScoreCSV {
    public static void main(String[] args) {
        int sum=0;
        int[] s={0,0};
        int rowcount=0;
        String team ="";
       try{
        File file = new File("tennisCSV.csv");
        List<String> lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
   
        for(String line : lines){
            String[] arr = line.split(",",-1);
            sum=Integer.parseInt(arr[0].trim())+Integer.parseInt(arr[1].trim())+Integer.parseInt(arr[2].trim())+Integer.parseInt(arr[3].trim())+Integer.parseInt(arr[4].trim());
            System.out.println(line +" : "+sum);
             s[rowcount++]=sum;  
         
        }
        if(s[0]>s[1]){
            System.out.println("Winner is Player - A with points : "+s[0]);
        }
        else{
            System.out.println("Winner is Player - B with points : "+s[1]);
        }

       }catch(Exception e){
        System.out.println(e);
       }
    }
}
