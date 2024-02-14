
/* Q5. Longest Palindromic List
Unsolved
feature icon
Get your doubts resolved blazing fast with Chat GPT Help
Check Chat GPT
feature icon
Using hints is now penalty free
Use Hint
Problem Description
Given a linked list of integers. Find and return the length of the longest palindrome list that exists in that linked list.

A palindrome list is a list that reads the same backward and forward.

Expected memory complexity : O(1)



Problem Constraints
1 <= length of the linked list <= 2000

1 <= Node value <= 100



Input Format
The only argument given is head pointer of the linked list.



Output Format
Return the length of the longest palindrome list.



Example Input
Input 1:

 2 -> 3 -> 3 -> 3
Input 2:

 2 -> 1 -> 2 -> 1 ->  2 -> 2 -> 1 -> 3 -> 2 -> 2


Example Output
Output 1:

 3
Output 2:

 5


Example Explanation
Explanation 1:

 3 -> 3 -> 3 is largest palindromic sublist
Explanation 2:

 2 -> 1 -> 2 -> 1 -> 2 is largest palindromic sublist.

 */
//package LinkedList1.Additional;
class ListNode {
     public int val;
     public ListNode next;
     ListNode(int x) { val = x; next = null; }
 } 


public class LongestPalindrome {
    static void printLL(ListNode head){
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
    }
    
    static int count(ListNode A,ListNode B){
        int count=0;
        while(A != null && B !=null){
            if(A.val!=B.val){
                break;
            }
            else{
                count++;
                A=A.next;
                B=B.next;
            }
        }
        return count;
    }
    static int longestPalindrome(ListNode A){
        ListNode curr=A,prev=null;
        int ans=0;
        while(curr!=null){
            //reverse linked list till curr
            ListNode n = curr.next;
            curr.next=prev;
            //find the largest linked list of even size
            ans = Math.max(ans,2*count(curr,n));
            //find the linked list of oaa size
            ans = Math.max(ans,2*count(prev,n)+1);
            //update prev and aurr
            prev=curr;
            curr=n;
        }
        return ans;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode ln1=new ListNode(2);
        ListNode ln2=new ListNode(2);
        ListNode ln3=new ListNode(1);
       // ListNode ln4=new ListNode(5);

        head.next = ln1;
        ln1.next=ln2;
        ln2.next=ln3;
        //ln3.next=ln4;
        printLL(head);
        int ans = longestPalindrome(head);
        System.out.println(ans);
        
    }
}
