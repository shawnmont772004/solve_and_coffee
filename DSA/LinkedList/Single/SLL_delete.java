package DSA.LinkedList.Single;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

public class SLL_delete {

    public void display(Node head) {
        if (head == null) {
            System.out.println("The list is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println();

        }
    }

    public Node delete_front(Node head) {
        if (head == null) {
            System.out.println("The list is empty!");
            return null;
        } else {

            return head.next;
        }
    }

}

    public Node delete_end(Node head) {
        if (head == null) {
            System.out.println("The list is empty!");
            return null;
        } else {

            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            return head;

        }
    }

    public static void main(String[] args) {
        SLL_delete s = new SLL_delete();

        Node head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        head.next.next.next.next.next = new Node(0);

        s.display(head);

        head = s.delete_front(head);

        s.display(head);

        head = s.delete_end(head);

    }

}
