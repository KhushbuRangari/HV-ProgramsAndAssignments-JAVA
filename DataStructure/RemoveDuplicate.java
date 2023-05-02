import java.util.Arrays;

class Node {
    Node next;
    int data;
}

public class RemoveDuplicate {
    Node head;
    int size;

    void RemoveDuplicate() {
        this.head = null;
        this.size = 0;
    }

    public void createNode(int item) {
        Node n = new Node();
        n.data = item;
        Node current = this.head;

        if (this.head == null) {
            this.head = n;
            this.head.next = null;
            this.size += 1;

        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = n;
            n.next = null;
            this.size += 1;

        }

    }

    public void printList() {
        Node currNode = this.head;
        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }

    public void duplicate() {
        Node curr = this.head;
        Node index = null; 
        while(curr  != null)
        {
            index  = curr.next;
            while(index!= null)
            {
                if(index.data==curr.data){
                    curr.next=index.next;
                    index=curr.next;
                }
                else{
                    index= index.next;
                }

            }
            curr =curr.next;
        }
    }

    public static void main(String[] args) {

        RemoveDuplicate ll = new RemoveDuplicate();

        ll.createNode(1);
        ll.createNode(9);
        ll.createNode(1);
        ll.createNode(2);
        ll.createNode(9);
        System.out.println("Lnkliist one :");
        ll.printList();
        System.out.println("*********");
        ll.duplicate();
         ll.printList();

    }
}
