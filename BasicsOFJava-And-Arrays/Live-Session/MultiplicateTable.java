
import java.util.Scanner;

public class MultiplicateTable {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        System.out.println("***********Multiplication**************");
        System.out.println("Please enter the number :");
        int num = sc.nextInt();

        int table=1;

            for (int i = 0; i <=10; i++) {
                table= num*i;
                System.out.println(num+" X "+i+" = "+table);
            }
      
    }
}
