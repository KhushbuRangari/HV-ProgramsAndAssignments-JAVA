public class SortArray {
    public static void main(String[] args) {
        int[] arr = { 4, 6, 1, 7, 2, 9, 3 };
        int temp = 0;

        System.out.print("\nArray  = ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " " );
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("\nSorted Array  = ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
}
