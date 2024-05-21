class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MergeTwoSortedLL {

    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        if (l1 != null) {
            curr.next = l1;
        } else {
            curr.next = l2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        MergeTwoSortedLL m = new MergeTwoSortedLL();

        // Creating the first linked list: 1 -> 5 -> 6
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(5);
        l1.next.next = new ListNode(6);

        // Creating the second linked list: 2 -> 3 -> 4
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode mergedList = m.merge(l1, l2);
        System.out.print("The merged sorted linked list is: ");
        printList(mergedList);
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
