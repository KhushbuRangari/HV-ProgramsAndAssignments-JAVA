import java.util.Arrays;

public class QuickSort {

    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i=low-1;
        for (int j = low; j < high; j++) {
            if(arr[j]<pivot)
            {
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
    }

    

    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quicksort(arr, low, pivot-1);
            quicksort(arr, pivot+1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 8, 9, 3, 6, 10, 5, 12, 13, 4 };
        int low =0;
        int high = arr.length-1;

        System.out.print("\nArray is :");
        System.out.println(Arrays.toString(arr));

        quicksort(arr,low,high);


        System.out.print("Sorted Array is :");
        System.out.println(Arrays.toString(arr));


    }
}
