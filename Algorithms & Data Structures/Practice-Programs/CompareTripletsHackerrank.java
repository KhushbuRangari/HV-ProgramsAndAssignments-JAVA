/*https://www.hackerrank.com/challenges/compare-the-triplets/problem?isFullScreen=true*/

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>(3);
        a.add(17);
        a.add(28);
        a.add(30);



        List<Integer> b = new ArrayList<>(3);
        b.add(99);
        b.add(16);
        b.add(8);
       
        List<Integer> res = new  ArrayList(2);
        int alice =0;
        int bob =0;
        for(int i =0;i<3;i++)
        {
           if(a.get(i)==b.get(i))
           {
                alice=alice +0;
                bob = bob+0;
           }
            else if(a.get(i)>b.get(i)){
               alice = alice+1;
             
            }
            else if(a.get(i)<b.get(i)){
               bob = bob+1;
              
            }
        }
        res.add(alice); 
        res.add(bob); 
      System.out.println(res);
    }
        
    }
