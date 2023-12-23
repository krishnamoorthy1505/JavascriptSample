//package LinkedList1;
class ListNode {
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        //next = null;
    }
    
}

public class PrintLinkedList {
        static void printLL(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }

    }
        public static void main(String[] args) {
        ListNode head=new ListNode(10);
        ListNode ln1=new ListNode(20);
        ListNode ln2=new ListNode(30);
        ListNode ln3=new ListNode(40);
        head.next = ln1;
        ln1.next=ln2;
        ln2.next=ln3;
        printLL(head);

    }
    
}
