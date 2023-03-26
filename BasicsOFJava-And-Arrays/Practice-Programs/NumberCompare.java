import java.util.Arrays;
import java.util.Scanner;

public class NumberCompare {

    static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
        int[] arr=new int[3];
      
        System.out.println("Enter three numbers : ");
           for (int i = 0; i < 3; i++) {
                int num = sc.nextInt();
                arr[i]=num;
           }
           System.out.println("Three numbers are :"+Arrays.toString(arr));
           if (arr[0] <= arr[1] && arr[0] <= arr[2])
                System.out.println( arr[0] + " is the smallest number.");
            else if (arr[1] <= arr[0] && arr[1] <= arr[2])
                System.out.println( arr[1] + " is the smallest number.");
            else
                System.out.println( arr[2] + " is the smallest number.");

            if (arr[0] >= arr[1] && arr[0] >= arr[2])
                System.out.println( arr[0] + " is the largest number.");
            else if (arr[1] >= arr[0] && arr[1] >= arr[2])
                System.out.println( arr[1] + " is the largest number.");
            else
                System.out.println( arr[2] + " is the largest number.");

                System.out.println("Average of all three numbers is :"+(arr[0]+arr[1]+arr[2])/3);
    }
}
