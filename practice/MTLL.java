class ListNode {
    int data;
    ListNode next;

    ListNode(int x) {
        data = x;
    }
    ListNode() {
    }

}

public class MTLL {
    public ListNode mergeLL(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);

        ListNode temp = dummy;

        while (l1 != null && l2 != null) {

            if (l1.data <= l2.data) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
        }

        if (l1 != null) {
            temp.next = l1;
        } else {
            temp = l2;
        }

        return temp.next;

    }

    

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);
        l1.next.next.next = new ListNode(7);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);
        l2.next.next.next = new ListNode(8);

        MTLL l = new MTLL();
        ListNode ml = l.mergeLL(l1, l2);

        System.out.print("The merged linked list is:");
        printlist(ml);

    }

    public static void printlist(ListNode l) {
        while (l != null) {
            System.out.print(l.data+" ");
            l = l.next;
        }
    }
}
