package Charan.LeetCode;

 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
class Solution {
    public ListNode AddTwoNumbers(ListNode l1, ListNode l2) {
        int n1=0;
        int n2=0;
        while(l1!= null){
            n1 = n1*10+ l1.val;
            l1 = l1.next;
        }
        while(l2!= null){
            n2 = n2*10+ l2.val;
            l2 = l2.next;
        }
        ListNode result = null; // initialize to null to remove the extra node
        int sum = n1+n2;
        sum = reverseNumber(sum);
        if (sum == 0) {
            return new ListNode(0);
        }
        while(sum > 0){ // use sum > 0 instead of len > 0
            ListNode node = new ListNode(sum % 10);
            node.next = result;
            result = node;
            sum = sum / 10;
        }
        return result;
    }

    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

}