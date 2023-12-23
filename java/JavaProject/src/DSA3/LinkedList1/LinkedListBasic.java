//import org.w3c.dom.Node;

class Node1{
    int val;
    Node1 next;
    Node1(int val){
        this.val=val;
    }
}
public class LinkedListBasic {
    
    static void printAll(Node1 head){
        Node1 temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            System.out.print(temp.next+" ");
            temp=temp.next;
            //System.out.print(temp+" ");
        }
    }
        static int sizeLL(Node1 head){
            Node1 temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
            
        }

    
    public static void main(String[] args) {
        Node1 head = new Node1(10);
        System.out.println(head.val);
        Node1 n1= new Node1(20);
        Node1 n2= new Node1(30);
        Node1 n3= new Node1(40);
        Node1 n4= new Node1(50);
        head.next=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        printAll(head);
        System.out.println();
        System.out.println(sizeLL(head));
        
    }
}
    
    

