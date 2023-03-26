import java.util.Scanner;

public class SubString {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        

        String str = "Mangalyaan";
        System.out.print("Enter starting index :");
        int indexOne=sc.nextInt();
        System.out.print("Enter ending index :");
        int indexTwo = sc.nextInt();

        System.out.print(" subString of "+str+" from "+ indexOne +" to "+ indexTwo+" is :" );
        for (int i = indexOne; i <= indexTwo; i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println("");
    }
}
