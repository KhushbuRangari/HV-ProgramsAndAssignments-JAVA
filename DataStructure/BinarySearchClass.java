public class BinarySearchClass {

    //Simple Method

        public static int binarySearch(int start, int end ,int[] arr,int target){
            while(start<= end)
            {
                int mid = (start+end)/2;
                if(target==arr[mid]){
                    return mid;
                }
                else if(arr[mid]>target){
                    end=mid-1;

                }
                else if (arr[mid]<target){
                    start = mid +1;
                }
                
            }
            
           return -1;
        }


        //Recursion method
        public static int binarySearchRecu(int start, int end ,int[] arr,int target){
            int mid = (start+end)/2;
            while(start<end){
                if(target==arr[mid]){
                    return mid;
                }
                if(target<arr[mid]){
                    binarySearchRecu(start,mid,arr,target);
                }
                else{
                    return binarySearchRecu(start, mid-1, arr, target);
                }
            }
            return -1;
        }

    public static void main(String[] args) {
        
    int[]  arr = {1,2,3,4,5,6,7};
    int target =6;
   // System.out.println(binarySearch(0, arr.length, arr, target));

   System.out.println(binarySearchRecu(0, arr.length, arr, target));

        
    }
}
