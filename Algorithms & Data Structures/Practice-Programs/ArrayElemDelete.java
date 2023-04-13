import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayElemDelete {

    public void  removeX(String arr[], int n) {
        if (arr == null || n < 0 || n > arr.length) {
          System.out.println(arr);
        }
        String[] arrNew = new String[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == n) {
                continue; // skip the element to be deleted
            }
            arrNew[k++] = arr[i]; // adding all the other elements
        }
        System.out.print("\nUpdated Array :");
        for (int i = 0; i < arrNew.length; i++) {
            System.out.print(arrNew[i]+" ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        ArrayElemDelete ob = new ArrayElemDelete();
        String[] arr = { "24", "31", "15", "20" };
        System.out.println("\n Array is "+Arrays.toString(arr));
        ob.removeX(arr, 03) ;
    }
}
