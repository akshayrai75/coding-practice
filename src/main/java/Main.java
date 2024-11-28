import easy.mergeTwoSortedList.ListNode;
import easy.mergeTwoSortedList.MergeTwoSortedLists;

public class Main {
    public static void main(String[] args) {
        System.out.println("TEST 1: ");
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode ans1 = MergeTwoSortedLists.mergeTwoListsV2(list1, list2);

        while (ans1.next != null) {
            System.out.print(ans1.val + " ");
            ans1 = ans1.next;
        }
        System.out.println(ans1.val);
/////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("TEST 2: ");
        ListNode ans2 = MergeTwoSortedLists.mergeTwoListsV2(null, null);

        while (ans2.next != null) {
            System.out.print(ans2.val + " ");
            ans2 = ans2.next;
        }
        System.out.println(ans2.val);
/////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("TEST 3: ");
        ListNode ans3 = MergeTwoSortedLists.mergeTwoListsV2(new ListNode(), new ListNode());

        while (ans3.next != null) {
            System.out.print(ans3.val + " ");
            ans3 = ans3.next;
        }
        System.out.println(ans3.val);
/////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("TEST 4: ");
        ListNode list3 = new ListNode(0);

        ListNode ans4 = MergeTwoSortedLists.mergeTwoListsV2(null, list3);

        while (ans4.next != null) {
            System.out.print(ans4.val + " ");
            ans4 = ans4.next;
        }
        System.out.println(ans4.val);
/////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("TEST 5: ");
        ListNode list4 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list5 = new ListNode(6, new ListNode(7, new ListNode(8)));

        ListNode ans5 = MergeTwoSortedLists.mergeTwoListsV2(list4, list5);

        while (ans5.next != null) {
            System.out.print(ans5.val + " ");
            ans5 = ans5.next;
        }
        System.out.println(ans5.val);
/////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("TEST 6: ");
        ListNode list6 = new ListNode(1, new ListNode(3, new ListNode(5)));
        ListNode list7 = new ListNode(2, new ListNode(4, new ListNode(6)));

        ListNode ans6 = MergeTwoSortedLists.mergeTwoListsV2(list6, list7);

        while (ans6.next != null) {
            System.out.print(ans6.val + " ");
            ans6 = ans6.next;
        }
        System.out.println(ans6.val);
/////////////////////////////////////////////////////////////////////////////////////////////////
    }
}