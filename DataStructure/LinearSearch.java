/*
       * create an array
       * traverse the array
       * store value in var to be searched
       * check value in array
       * if yes display
       * else
       * search
       * 
       */

public class LinearSearch {

    public static int serachArray(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++)
        {

            if (arr[i] == value) {

                return i;

            }

        }
        return -1;

    }

    public static void main(String[] args) {

        // LinearSearch ls = new LinearSearch();
        int[] array = { 21, 4, 56, 4, 3, 13 };
        int index = LinearSearch.serachArray(array, 56);

        System.out.println(index);

    }

}