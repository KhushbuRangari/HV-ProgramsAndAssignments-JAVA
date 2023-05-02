import java.util.Arrays;

class Node {
    int data;
    Node next;
}

public class MergeNSortTwoLLAssig {
    Node head;
    int size;

    public void MergeNSortTwoLLAssig() {
        this.size = 0;
        this.head = null;
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

    public void merge(MergeNSortTwoLLAssig ll, MergeNSortTwoLLAssig ll2) {
        Node curNode1 = ll.head;
        Node curNode2 = ll2.head;

        if (ll.head != null && ll2.head != null) {
            while (curNode1.next != null) {
                curNode1 = curNode1.next;
            }
            curNode1.next = curNode2;
            this.size =ll.size+ll2.size;
        }
    }

    public void printList() {
        Node currNode = this.head;
        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }

    public int[] printmergedList() {
        Node currNode = this.head;
        int i=0;
        int[] arr = new int[this.size];
        while (currNode != null) {
           

            arr[i] = currNode.data;
            i++;
           // System.out.println(currNode.data);
                currNode = currNode.next;

              
        }
        return arr;
    }

    public void sortList()
    {
        Node curr = this.head;
        Node index =null;
        int temp;
        while(curr.next!=null)
        {
            index = curr.next;
           while(index!=null)
           {
            if(curr.data>index.data){
                temp=curr.data;
                curr.data=index.data;
                index.data=temp;
            }
            index=index.next;
           }
           curr=curr.next;
        }

     }

    public static void main(String[] args) {

        MergeNSortTwoLLAssig ll = new MergeNSortTwoLLAssig();

        ll.createNode(100);
        ll.createNode(90);
        ll.createNode(10);
        ll.createNode(60);
        ll.createNode(10);
        System.out.println("Lnkliist one :");
         ll.printList();

        MergeNSortTwoLLAssig ll2 = new MergeNSortTwoLLAssig();

        ll2.createNode(20);
        ll2.createNode(40);
        ll2.createNode(30);
        System.out.println("Lnkliist two :");
         ll2.printList();

        ll.merge(ll, ll2);
        System.out.println("***Merged linklist***");
        ll.printList();

        System.out.println("\nThe Sorted List is :");
        ll.sortList();
        ll.printList();
   
    }
}
