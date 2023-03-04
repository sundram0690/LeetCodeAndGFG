package LeetCode;

public class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode list_result = new ListNode();
        ListNode head = list_result;
        while(list1 != null || list2 != null){
            int val1 = list1 != null ? list1.val : Integer.MAX_VALUE;
            int val2 = list2 != null ? list2.val : Integer.MAX_VALUE;


            if(val1 < val2){
                head.next = new ListNode(val1);
                list1 = list1.next;
                head = head.next;
            }else{
                head.next = new ListNode(val2);
                list2 = list2.next;
                head = head.next;
            }
        }

        return list_result.next;
    }
}
