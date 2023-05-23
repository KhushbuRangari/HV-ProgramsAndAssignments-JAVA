import java.util.Scanner;

public class ValidParanthesis {

    Node head;
    int size;
    


    class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }

        public Node() {
        }

        
    }

   
    public  ValidParanthesis() {
        this.size = 0;
        this.head = null;
    }

    public void push(Object data) {
        Node newNode = new Node(data);
        
        // if (this.head == null) {
        //     System.out.println("Stack is empty");
        // }

        newNode.next = this.head;
        this.head = newNode;
        this.size++;
    }

    public Object pop()
    {
        Node curr = this.head;
      if (this.head == null) {
            System.out.println("Stack is empty");
        }
        else{
            this.head=curr.next;
           
        }
        return curr.data;
    }
    public void print() {
        Node curr = this.head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

 
    public static boolean isValid(ValidParanthesis s1, ValidParanthesis s2)
    {

        if(s1.pop()==s2.pop())
        {
          return true;
        }
        else{
          return false;
        }
        
    }


    public static void main(String[] args) {
        ValidParanthesis s = new ValidParanthesis();

        ValidParanthesis s1 = new ValidParanthesis();
        s.push("    (");
        s.push("    [");
        s.push("    )");
        s1.push("    )");
        s1.push("    ]");
        s1.push("    }");

       

    //   s.print();

    System.out.println(isValid(s, s1));
      
        
    }

}