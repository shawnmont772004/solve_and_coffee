package DSA.LinkedList.Double;

import java.util.Scanner;

class DoublyLinkedList {
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;

    public DoublyLinkedList() {
        this.head = null;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;

        if (position == 0) {
            head = temp.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        for (int i = 0; temp != null && i < position; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position does not exist.");
            return;
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }

        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
    }

    public void displayForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void displayBackward() {
        Node current = head;
        if (current == null) return;

        while (current.next != null) {
            current = current.next;
        }

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();

        while (true) {
            System.out.println("\nDoubly Linked List Operations:");
            System.out.println("1. Insert at end");
            System.out.println("2. Delete at position");
            System.out.println("3. Display list forward");
            System.out.println("4. Display list backward");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int value = scanner.nextInt();
                    list.insertAtEnd(value);
                    break;
                case 2:
                    System.out.print("Enter position to delete: ");
                    int position = scanner.nextInt();
                    list.deleteAtPosition(position);
                    break;
                case 3:
                    list.displayForward();
                    break;
                case 4:
                    list.displayBackward();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

