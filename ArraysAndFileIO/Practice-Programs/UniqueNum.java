
import java.util.Scanner;
import java.util.Arrays;

public class UniqueNum {

 
    public static void main(String[] args) {
      
       int t=-1;
       int [] arrNum = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};  
       int[] arrNum2 = new int[arrNum.length]; 

       for(int i = 0; i < arrNum.length; i++){  
        int count = 1;  
        for(int j = i+1; j < arrNum.length; j++){  
            if(arrNum[i] == arrNum[j]){  
                count++;  
                arrNum2[j] = t;  //To avoid counting same element again  
            }  
        }  
        if(arrNum2[i] != t)  
            arrNum2[i] = count;  
    }  
    System.out.println(" Element | Frequency");  
    System.out.println("------------------------------");  
    for(int i = 0; i < arrNum2.length; i++){  
        if(arrNum2[i] != t)  
            System.out.println("    " + arrNum[i] + "    |    " + arrNum2[i]);  
    }  
 }
    
}

