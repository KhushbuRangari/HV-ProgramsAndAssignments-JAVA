import java.util.LinkedList;
import java.util.Queue;

public class StackusingQueues {
    Queue<Integer> q1 = new LinkedList<>();

    Queue<Integer> q2 = new LinkedList<>();
    int size;

    public void push(int value) {
       
      q1.add(value);
      size++;
    }

    public int pop() {
        while(q1.size()!=1)
        {
           
            q2.add(q1.remove());
        }
        int top = q1.remove();
        size--;
       Queue<Integer> temp =q1;
       q1=q2;
       q2=temp;
        return top;
    }

    public void print()
    {
        while(q1.size()!=0)
        {
            System.out.println(pop());
        }
    }
    public static void main(String[] args) {
        StackusingQueues s= new StackusingQueues();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

       System.out.println("the removed element is "+s.pop());
       
       s.push(6);

       System.out.println("the removed element is "+s.pop());
       System.out.println();
       s.print();
     
       
}
}
