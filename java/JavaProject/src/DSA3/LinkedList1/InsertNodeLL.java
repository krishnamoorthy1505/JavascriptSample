//package DSA3;

import java.util.Scanner;

class Node1{
    int val;
    Node1 next;
    Node1(int val){
        this.val=val;
    }
}

public class InsertNodeLL {
    static void printLL(Node1 head){
        Node1 temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }

    }
    static Node1 insert(Node1 head,int val,int idx){
        Node1 nn = new Node1(val);
        if(idx == 0){
            nn.next = head;
            return nn;
            
        }
        else{
            Node1 t1 = head;
            //get node at idx-1
            for(int k=0;k<idx-1;k++){
                t1 = t1.next;
            }
            Node1 t2 = t1.next;

            //connection
            t1.next=nn;
            nn.next=t2;


        }
        return head;
    }
    public static void main(String[] args) {
        Node1 head = new Node1(10);
        Node1 n1 = new Node1( 20);
        Node1 n2 = new Node1( 30);
        Node1 n3 = new Node1( 40);
        head.next=n1;
        n1.next=n2;
        n2.next=n3;
        printLL(head);
        System.out.println();
        //Node1 nn=new Node1(25);

        //insert node
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int idx = sc.nextInt();
        Node1 in = insert(head,val,idx);
        printLL(in);


    }
    
}
