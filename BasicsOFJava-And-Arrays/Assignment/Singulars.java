//Question 3:  Find the count of singulars in array?

public class Singulars {
    public static void main(String[] args) {
        
        int[] arrNum =  {10, 20, 20, 10, 10, 30, 50, 10, 20,10,10,10,10};
        int flag =-1;
        int sockCount=0;
        int singulars=0;
        int[] temp = new int[arrNum.length];
        for (int i = 0; i < arrNum.length; i++) {
            int count=1;
            for (int j = i+1; j < arrNum.length; j++) {
                if(arrNum[i]==arrNum[j])
                {
                    count++;
                    temp[j]=flag;
                }
            }
            if(temp[i]!=flag){
                temp[i]=count;
            }
        }
        
    for (int i = 0; i < temp.length; i++) {
        if(temp[i]!=flag){
            System.out.println("Socks id- " + arrNum[i] + "  : total count " + temp[i]);
           // System.out.println(temp[i]/2);
            if((temp[i]/2)==2){
                sockCount=0;
                singulars=singulars+sockCount;
            }
            else if((temp[i]/2)==1){
                sockCount=1;
                singulars=singulars+sockCount;
            }
            else if((temp[i]/2)==0){
                sockCount=1;
                singulars=singulars+sockCount;
            }

        }
    }
    System.out.println("Count of singular socks = "+singulars);
    
    }
}
