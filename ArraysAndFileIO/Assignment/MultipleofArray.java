import java.util.Arrays;

public class MultipleofArray {
    public static void main(String[] args) {
        int[] arrNum={5, 3, 4, 2, 0, 8};
        int[] multi=new int[arrNum.length];
        int num=1;
        
        for (int i = 0; i < multi.length; i++) {
            multi[i]=1;
        }
        for (int i = 0; i < arrNum.length; i++) {
            
                multi[i] = num * arrNum[i];
                num=multi[i];
        }
        System.out.println(Arrays.toString(multi));
    }
}
