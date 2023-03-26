import java.util.Scanner;

public class PrimeNo {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       
        System.out.println("\nEnter Number : ");
            int num = sc.nextInt();

            int count = 0;
 
            for (int i = 1; i <= num; i++)
            {
     
                if (num % i == 0)
     
                    count++;
            }
     
            if (count == 2)
     
                System.out.println(num + " is a prime number.");
     
            else
     
                System.out.println(num + " is not prime number.");
    }
}
