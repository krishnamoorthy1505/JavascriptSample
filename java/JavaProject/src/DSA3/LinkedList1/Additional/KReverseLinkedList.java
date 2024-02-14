package LinkedList1.Additional;
//package LinkedList1;
/* Q3. K reverse linked list
Solved
feature icon
Get your doubts resolved blazing fast with Chat GPT Help
Check Chat GPT
feature icon
Using hints is now penalty free
Use Hint
Problem Description
Given a singly linked list A and an integer B, reverse the nodes of the list B at a time and return the modified linked list.



Problem Constraints
1 <= |A| <= 103

B always divides A



Input Format
The first argument of input contains a pointer to the head of the linked list.

The second arugment of input contains the integer, B.



Output Format
Return a pointer to the head of the modified linked list.



Example Input
Input 1:

 A = [1, 2, 3, 4, 5, 6]
 B = 2
Input 2:

 A = [1, 2, 3, 4, 5, 6]
 B = 3


Example Output
Output 1:

 [2, 1, 4, 3, 6, 5]
Output 2:

 [3, 2, 1, 6, 5, 4]


Example Explanation
Explanation 1:

 For the first example, the list can be reversed in groups of 2.
    [[1, 2], [3, 4], [5, 6]]
 After reversing the K-linked list
    [[2, 1], [4, 3], [6, 5]]
Explanation 2:

 For the second example, the list can be reversed in groups of 3.
    [[1, 2, 3], [4, 5, 6]]
 After reversing the K-linked list
    [[3, 2, 1], [6, 5, 4]]

 */
public class KReverseLinkedList {
    static void printLL(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }

    }

    static ListNode kthReverseLinkedList(ListNode A ,int B){
        ListNode curr=A,prev=null,next=null;
        int count=0;
        while(curr!=null && count<B){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr= next;
            count++;

        }
        if(next!=null){
            A.next = kthReverseLinkedList(next, B);
        }

        return prev;
    }
        public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode ln1=new ListNode(2);
        ListNode ln2=new ListNode(3);
        ListNode ln3=new ListNode(4);
        ListNode ln4=new ListNode(5);

        head.next = ln1;
        ln1.next=ln2;
        ln2.next=ln3;
        ln3.next=ln4;
        ListNode res = kthReverseLinkedList(head,2);
       // PrintLinkedList pl = new PrintLinkedList(res);
        printLL(res);


    }

}
