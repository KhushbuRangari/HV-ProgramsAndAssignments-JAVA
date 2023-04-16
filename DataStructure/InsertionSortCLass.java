public class InsertionSortCLass {

        public static void insertionSort(int[] arr)
        {
            for (int i = 1; i < arr.length; i++) {
                int current = arr[i];   
                int j=i-1;                 //assuming ist place is sorted     
                while(j>=0 && arr[j]>current)  
                {
                    arr[j+1]=arr[j];
                    j=j-1;

                }
                arr[j+1]=current;
            }
        }
    public static void main(String[] args) {
        int[] arr = {20,10,30,5,7};
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
