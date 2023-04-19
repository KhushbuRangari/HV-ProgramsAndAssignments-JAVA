import java.util.Arrays;
import java.util.Scanner;

public class NthSmallestArray {
    
    public static void main(String[] args) {
        int[] arr = {15, 22, 51, 28, 13, 24, 5, 12};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = sc.nextInt();
        System.out.print("\n\nThe Original array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr);
        System.out.println("\nThe nth Smallest element is :"+arr[n-1]);
        sc.close();
    }
}
