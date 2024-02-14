//package LinkedList1.Additional;
/* Q4. Reverse Link List II
Solved
feature icon
Get your doubts resolved blazing fast with Chat GPT Help
Check Chat GPT
feature icon
Using hints is now penalty free
Use Hint
Problem Description
Reverse a linked list A from position B to C.

NOTE: Do it in-place and in one-pass.



Problem Constraints
1 <= |A| <= 106

1 <= B <= C <= |A|



Input Format
The first argument contains a pointer to the head of the given linked list, A.

The second arugment contains an integer, B.

The third argument contains an integer C.



Output Format
Return a pointer to the head of the modified linked list.



Example Input
Input 1:

 A = 1 -> 2 -> 3 -> 4 -> 5
 B = 2
 C = 4

Input 2:

 A = 1 -> 2 -> 3 -> 4 -> 5
 B = 1
 C = 5


Example Output
Output 1:

 1 -> 4 -> 3 -> 2 -> 5
Output 2:

 5 -> 4 -> 3 -> 2 -> 1


Example Explanation
Explanation 1:

 In the first example, we want to reverse the highlighted part of the given linked list : 1 -> 2 -> 3 -> 4 -> 5 
 Thus, the output is 1 -> 4 -> 3 -> 2 -> 5 
Explanation 2:

 In the second example, we want to reverse the highlighted part of the given linked list : 1 -> 4 -> 3 -> 2 -> 5  
 Thus, the output is 5 -> 4 -> 3 -> 2 -> 1 

 */

//import LinkedList1.Additional.ListNode;
   class ListNode {
     public int val;
     public ListNode next;
     ListNode(int x) { val = x; next = null; }
 } 

public class ReverseLinkedListII {
    static void printLL(ListNode head){
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
    }
    static ListNode reverse(ListNode head){
        ListNode curr = head,prev=null;
        while(curr!=null){
            ListNode n = curr.next;
            curr.next=prev;
            prev = curr;
            curr=n;
        }
        return prev;
    }
    static ListNode reverseLinkedList(ListNode A,int B,int C){
        ListNode curr=A;
        ListNode first=null,from=null,to=null,last=null;
        int count=0;
        while(curr!=null){
            count++;
            if(count<B){
                first=curr;
            }
            if(count == B){
                from=curr;
            }
            if(count==C){
                to=curr;
                last=to.next;
                break;
            }
            curr = curr.next;
        }
            to.next=null;
            ListNode r = reverse(from);
            if(first!=null){
                first.next=r;
            }
            else{
                A=to;
            }
            from.next=last;
        
        return A;
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
        ListNode res =reverseLinkedList(head,2,4);
       // PrintLinkedList pl = new PrintLinkedList(res);
       
        printLL(res);


    }


}
