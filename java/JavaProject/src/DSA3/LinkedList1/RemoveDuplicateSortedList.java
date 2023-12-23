//package LinkedList1;
/* Q1. Remove Duplicates from Sorted List
Solved
feature icon
Get your doubts resolved blazing fast with Chat GPT Help
Check Chat GPT
feature icon
Using hints is now penalty free
Use Hint
Problem Description
Given a sorted linked list, delete all duplicates such that each element appears only once.



Problem Constraints
0 <= length of linked list <= 106



Input Format
First argument is the head pointer of the linked list.



Output Format
Return the head pointer of the linked list after removing all duplicates.



Example Input
Input 1:

 1->1->2
Input 2:

 1->1->2->3->3


Example Output
Output 1:

 1->2
Output 2:

 1->2->3


Example Explanation
Explanation 1:

 Each element appear only once in 1->2.
 */

 
public class RemoveDuplicateSortedList {

    static void printLL(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }

    }
    static ListNode removeDuplicateSortedList(ListNode A){
        ListNode temp = A;
        while(temp != null && temp.next != null){
            if(temp.val == temp.next.val ){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode ln1=new ListNode(1);
        ListNode ln2=new ListNode(1);
        ListNode ln3=new ListNode(4);
        head.next = ln1;
        ln1.next=ln2;
        ln2.next=ln3;
        ListNode res = removeDuplicateSortedList(head);
        printLL(res);


    }
}
