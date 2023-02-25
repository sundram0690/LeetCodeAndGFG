package LeetCode;

/*
Problem 2
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.

 */
public class AddTwoNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode();
        ListNode node = head;
        int carry = 0;

        while(l1 != null || l2 != null) {
            int v1 = (l1 != null) ? l1.val : 0;
            int v2 = (l2 != null) ? l2.val : 0;

            int sum = v1 + v2 + carry;
            node.val = sum%10;
            carry = sum / 10;
            System.out.println("Adding node : " + node.val);

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            if (l1 != null || l2 != null) {
                node.next = new ListNode();
                node = node.next;
            }

        }
        if(carry > 0){
            node.next = new ListNode(carry);
        }else {
            node = null;
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
