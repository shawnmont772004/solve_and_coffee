package DSA.LinkedList.Double;

import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    Node head;

    // Insert at the front
    public void insertFront(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            head.prev = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    // Insert at the end
    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    // Delete from the front
    public void deleteFront() {
        if (head != null) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        } else {
            System.out.println("List is empty.");
        }
    }

    // Delete from the end
    public void deleteEnd() {
        if (head == null) {
            System.out.println("List is empty.");
        } else if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.prev.next = null;
        }
    }

    // Insert at a specific position
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            insertFront(data);
        } else {
            Node temp = head;
            for (int i = 0; i < position - 1; i++) {
                if (temp == null) {
                    System.out.println("Position out of bounds.");
                    return;
                }
                temp = temp.next;
            }
            newNode.next = temp.next;
            if (temp.next != null) {
                temp.next.prev = newNode;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    // Delete from a specific position
    public void deleteFromPosition(int position) {
        if (position == 0) {
            deleteFront();
        } else {
            Node temp = head;
            for (int i = 0; i < position; i++) {
                if (temp == null) {
                    System.out.println("Position out of bounds.");
                    return;
                }
                temp = temp.next;
            }
            if (temp != null && temp.prev != null) {
                temp.prev.next = temp.next;
                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                }
            } else {
                System.out.println("Position out of bounds.");
            }
        }
    }

    // Delete a specific element
    public void deleteElement(int data) {
        Node temp = head;
        while (temp != null && temp.data != data) {
            temp = temp.next;
        }
        if (temp != null) {
            if (temp.prev != null) {
                temp.prev.next = temp.next;
            } else {
                head = temp.next;
            }
            if (temp.next != null) {
                temp.next.prev = temp.prev;
            }
        } else {
            System.out.println("Element not found.");
        }
    }

    // Display the list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Display the list in reverse
    public void displayReverse() {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    // Peek at the front element
    public void peek() {
        if (head != null) {
            System.out.println("Front element: " + head.data);
        } else {
            System.out.println("List is empty.");
        }
    }

    // Peek at the end element
    public void peekReverse() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        System.out.println("End element: " + temp.data);
    }
}

public class DoublyLinkedList {
    public static void DoublyLinkedList(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Insert front");
            System.out.println("2. Insert end");
            System.out.println("3. Delete front");
            System.out.println("4. Delete end");
            System.out.println("5. Insert at position");
            System.out.println("6. Delete from position");
            System.out.println("7. Delete element");
            System.out.println("8. Display");
            System.out.println("9. Display reverse");
            System.out.println("10. Peek");
            System.out.println("11. Peek reverse");
            System.out.println("12. Exit");
            int choice = scanner.nextInt();
            int data, position;
            switch (choice) {
                case 1:
                    System.out.println("Enter data:");
                    data = scanner.nextInt();
                    list.insertFront(data);
                    break;
                case 2:
                    System.out.println("Enter data:");
                    data = scanner.nextInt();
                    list.insertEnd(data);
                    break;
                case 3:
                    list.deleteFront();
                    break;
                case 4:
                    list.deleteEnd();
                    break;
                case 5:
                    System.out.println("Enter data and position:");
                    data = scanner.nextInt();
                    position = scanner.nextInt();
                    list.insertAtPosition(data, position);
                    break;
                case 6:
                    System.out.println("Enter position:");
                    position = scanner.nextInt();
                    list.deleteFromPosition(position);
                    break;
                case 7:
                    System.out.println("Enter data:");
                    data = scanner.nextInt();
                    list.deleteElement(data);
                    break;
                case 8:
                    list.display();
                    break;
                case 9:
                    list.displayReverse();
                    break;
                case 10:
                    list.peek();
                    break;
                case 11:
                    list.peekReverse();
                    break;
                case 12:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
