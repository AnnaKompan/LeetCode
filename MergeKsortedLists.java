import java.util.PriorityQueue;
import java.util.Queue;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
            Queue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
            for (ListNode ln : lists) {
                if (ln != null) {
                    pq.add(ln);
                }
            }
            ListNode head = new ListNode(-1);
            ListNode current = head;

            while (!pq.isEmpty()) {
                ListNode smallestNode = pq.poll();
                current.next = smallestNode;
                current = current.next;

                if (smallestNode.next != null) {
                    pq.add(smallestNode.next);
                }
            }
        return head.next;
    }
}

public class MergeKsortedLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode l3 = new ListNode(2, new ListNode(6));

        ListNode[] lists = new ListNode[] { l1, l2, l3 };

        Solution solution = new Solution();
        ListNode merged = solution.mergeKLists(lists);

        printList(merged);
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null)
                System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }
}
