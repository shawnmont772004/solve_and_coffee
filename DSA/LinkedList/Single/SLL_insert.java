package DSA.LinkedList.Single;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }

}

public class SLL_insert {
    Node head;

    public void insertFront(int key) {
        Node newNode = new Node(key);

        newNode.next = head;
        head = newNode;
    }

    public void insertEnd(int key) {
        Node newNode = new Node(key);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList l = new SinglyLinkedList();
        while (true) {
            System.out.println("Enter the choice:");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the front element:");
                    int key = sc.nextInt();
                    l.insertFront(key);
                    break;
                case 2:
                    System.out.println("Enter the end element:");
                    int key1 = sc.nextInt();
                    l.insertEnd(key1);
                    break;
                case 3:
                    System.out.println("Display:");
                    l.display();
                    break;
                case 4:
                    System.out.println("Exit");
                    sc.close();

            }

        }
    }
}
