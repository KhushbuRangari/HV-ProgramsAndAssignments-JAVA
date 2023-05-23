public class LinekedListBasic {
    Node head;
    class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
        
    }

    void push(int newData)
    {
        Node newnode = new Node(newData);
        newnode.next=head;
        head= newnode;
    }

    private static void printLinkedList(LinekedListBasic ll) {
        while(ll.head!=null){
            System.out.println(ll.head.data);
            ll.head=ll.head.next;
        }
    }   

    public static void main(String[] args) {
        LinekedListBasic ll= new LinekedListBasic();
        ll.head= ll.new Node(1);

      
      // Node n =ll.new Node(1);
       Node second = ll.new Node(2);

       Node third = ll.new Node(3);
       ll.head.next=second;
       second.next=third;
    
       ll.push(5);

        ll.push(7);
        printLinkedList(ll);
      
   }
}
