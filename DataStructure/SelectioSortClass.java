import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class SelectioSortClass {

    public static void selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) 
        {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) 
            {
                if(arr[j]<arr[minIndex])
                {
                    minIndex=j;
                    
                }
               
            }
            int temp= arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
               
        }  
     }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
