//package DSA3;

import java.util.Scanner;

class ListNode{
    ListNode next;
    int val;
    ListNode(int val){
        this.val = val;
    }
}

public class DeleteNodeLL {
    static void printLL(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }

    }
    static ListNode deleteNode(ListNode head,int idx){
        if(idx == 0){
            ListNode nh = head.next;
            head.next=null;
            return nh;
        }
        else{
            //get node at idx-1
            ListNode t1=head;
            for(int k=0;k<idx-1;k++){
                t1=t1.next;
            }
            ListNode t2 = t1.next;
            t1.next = t2.next;
            t2.next = null;
        }
        //0
        //return head;
        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        ListNode n1 = new ListNode(20);
        ListNode n2 = new ListNode(30);
        ListNode n3 = new ListNode(40);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        printLL(head);
        Scanner sc = new Scanner(System.in);
        int idx = sc.nextInt();
        ListNode del=deleteNode(head,idx);
        System.out.println();
        printLL(del);




    }
}
