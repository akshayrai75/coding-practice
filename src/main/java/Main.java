import easy.ClaculateSqrt;
import easy.ClimbingStairs;
import easy.RemoveDuplicatesFromLL;
import easy.mergeTwoSortedList.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode test1 = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNode test2 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        ListNode test3 = null;

        test1 = RemoveDuplicatesFromLL.deleteDuplicates(test1);
        test2 = RemoveDuplicatesFromLL.deleteDuplicates(test2);
        test3 = RemoveDuplicatesFromLL.deleteDuplicates(null);

        while (test1 != null) {
            System.out.print(test1.val + " ");
            test1 = test1.next;
        }
        System.out.println();
        while (test2 != null) {
            System.out.print(test2.val + " ");
            test2 = test2.next;
        }
        System.out.println();
        while (test3 != null) {
            System.out.print(test3.val + " ");
            test3 = test3.next;
        }
    }
}