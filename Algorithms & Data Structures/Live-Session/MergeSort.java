import java.util.Arrays;

public class MergeSort {
    static void merge(int arr[], int start, int end, int mid){
        // first divide the array to mstart merge
        //int mid = (start+end)/2;
        
        int leftLength, rightLength;
        // x = mid - 1; (end value)
        // y = mid + 1; (start value)
        leftLength = mid - start +1;
        rightLength = end - mid;

        int arr1[]= new int[leftLength];
        int arr2[] = new int[rightLength];

        for(int i = 0; i < leftLength; i++){
            arr1[i] = arr[start + i];

        }
        for(int i = 0; i<rightLength; i++){
            arr2[i] =arr[mid+1+i];
        }
        int left = 0;
        int right = 0;
        int result = start;

        while(left< leftLength && right<rightLength){
            if(arr1[left]<=arr2[right]){
                arr[result] = arr1[left];
                left ++;

            }else{
                arr[result] = arr2[right];
                right ++;
            }
            result ++;
            
        }
        while(left < leftLength){
            arr[result] = arr1[left];
            left ++;
            result ++;
        }
        while(right < rightLength){
            arr[result] = arr2[right];
            right ++;
            result ++;
        }

    }
    static void mergeSort( int arr[], int start, int end){
        if(start < end){

            int mid = (start+end)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, start, end, mid);
        }
    }






    public static void main(String[] args) {
        int arr[] = {3, 4, 2, 6, 12, 14};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
