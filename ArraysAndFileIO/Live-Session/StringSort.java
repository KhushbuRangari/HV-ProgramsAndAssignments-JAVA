import java.util.Arrays;

public class StringSort {
    public static void main(String[] args) {
        
        String[] str = {"Indore","Khushbu","I","Mumbai","City","Goa"};
        int[] strLen=new int[str.length];
        String temp="";

        for (int i = 0; i < str.length; i++) {
            for (int j = i+1; j < str.length; j++) {
                
                if(str[i].length()>(str[j].length())){
                    temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
        System.out.println("\n-------Sorted Array-------");
        for (int i = 0; i < str.length; i++) {
            strLen[i]=str[i].length();
        }
        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(strLen));
    }
}
