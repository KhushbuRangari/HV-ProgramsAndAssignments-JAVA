

public class BubbleSort {
    // in bubble sort we first sort the max value and keep it in the last/end

    static void bubbleSort(int arr[]){
        //loop over array elements
        for(int i = 0; i < arr.length; i++){
            // for second iteration when I is 1, the j will also iterate frome 0 to 3 that measne length-1-i
            for(int j=0; j<arr.length-i-1; j++){
                // compare two adjacent elements arr[i] with arr[j]
                if(arr[j]>arr[j+1]){

                    //swaping here
                    int temp= 0;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }




    public static void main(String[] args) {
        int arr[]={4, 5, 8, 2, 9, 4};
        bubbleSort(arr);
        //System.out.println(Arrays.toString(arr));
        for(int i= 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
