import java.util.Arrays;

public class ReverseArray {
    static void reverse(int[] arr,int start,int end)
    {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            
             temp=arr[start];
             if(start<end)
             {
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
             }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arr));
        reverse(arr, 0, 5);
        System.out.println("reversed array  is :");

        System.out.println(Arrays.toString(arr));
    }
}
