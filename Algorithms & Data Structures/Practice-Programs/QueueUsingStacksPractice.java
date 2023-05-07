/* By Khushbu  */
import java.util.Stack;

class QueueUsingStacksPractice {
    Stack<Integer> s1 = new Stack<Integer>();

    Stack<Integer> s2 = new Stack<Integer>();

    public void push(int value) {
        s1.push(value);
    }

    public void pop() {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
       
           
        }

        Integer val = (Integer) s2.pop();
       System.out.println("removed element is "+val);

       while(!s2.isEmpty())
       {
           s1.push(s2.pop());
       }

    }

    public static void main(String[] args) {
        QueueUsingStacksPractice q = new QueueUsingStacksPractice();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.push(6);

        System.out.println(q.s1);
        q.pop();
        System.out.println(q.s1);

        q.pop();
        q.push(7);
        System.out.println(q.s1);

        q.pop();
        System.out.println(q.s1);

    }
}