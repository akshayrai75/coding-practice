package easy;

import easy.nodes.ListNode;

public class RemoveDuplicatesFromLL {
    /**
     * <b>Remove Duplicates from Sorted List</b><br>
     * Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
     * Return the linked list sorted as well.<br>
     * @Example-1: Input: head = [1,1,2]<br>
     * Output: [1,2]<br>
     * @Example-2: Input: head = [1,1,2,3,3]<br>
     * Output: [1,2,3]<br>
     * */
    public static ListNode deleteDuplicates(ListNode head) {
        // This is two pointer approach and beats 100% in TC and 53.44% in SC
        if (head==null) return null;

        ListNode node1 = head, node2 = node1.next;

        while (node2 != null) {
            if (node2.val == node1.val) node2 = node2.next;
            else {
                node1.next = node2;
                node1 = node2;
                node2 = node2.next;
            }
        }
        node1.next = node2;
        return head;
    }
}
