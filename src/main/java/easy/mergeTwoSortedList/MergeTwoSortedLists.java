package easy.mergeTwoSortedList;

public class MergeTwoSortedLists {

    public static ListNode mergeTwoListsV2(ListNode list1, ListNode list2) {
        if (list1==null && list2==null) return null;
        else if (list1==null) return list2;
        else if (list2 == null) return list1;

        ListNode head = list1.val < list2.val ? list1 : list2;
        ListNode start = head;
        ListNode altHead = list1.equals(head) ? list2 : list1;

        while (head.next != null || altHead.next != null) {
            ListNode temp;
            System.out.println(
                    "HEAD: " + head + ": " + head.val + " -> " + (head.next != null ? head.next.val : "NULL")
            );
            System.out.println(
                    "ALT_HEAD: " + altHead + ": " + altHead.val + " -> " + (altHead.next != null ? altHead.next.val : "NULL")
            );
            System.out.println();

            if (head.next != null) {
                if (head.val == altHead.val) {
                    temp = head.next;
                    head.next = altHead;
                    head = altHead;
                    altHead = temp;
                } else if (head.val < altHead.val && head.next.val > altHead.val) {
                    temp = head.next;
                    head.next = altHead;
                    head = altHead;
                    altHead = temp;
                } else {
                    head = head.next;
                }
            } else {
                head.next = altHead;
                break;
            }
        } //While
        System.out.println(
                "HEAD: " + head + ": " + head.val + " -> " + (head.next != null ? head.next.val : "NULL")
        );
        System.out.println(
                "ALT_HEAD: " + altHead + ": " + altHead.val + " -> " + (altHead.next != null ? altHead.next.val : "NULL")
        );
        head.next = altHead;
        return start;
    }
}
