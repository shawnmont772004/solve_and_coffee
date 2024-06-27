package DSA.Queue;

import java.util.Scanner;

public class Dequeue {
    private int maxSize;
    private int front;
    private int rear;
    private int nitems;
    private int[] queueArray;

    public Dequeue(int size) {
        maxSize = size;
        front = 0;
        rear = -1;
        nitems = 0;
        queueArray = new int[size];

    }

    public void insert(int key) {
        if (isFull()) {
            System.out.println("The queue is full");
        } else {
            if (rear == maxSize - 1) {
                rear = -1;
            }
            queueArray[++rear] = key;
            nitems++;
        }
    }

    public int delete() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return -1;
        } else {
            if (front == maxSize) {
                front = 0;
            }
            int deletedelement = queueArray[front++];
            nitems--;
            return deletedelement;

        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            for (int i = 0; i < nitems; i++) {
                int index = (front + i) % maxSize;
                System.out.print(queueArray[index] + " ");
            }
            System.out.println();
        }
    }

    public boolean isFull() {
        if (nitems == maxSize) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (nitems == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the queue size:");
        int size = sc.nextInt();

        Dequeue q = new Dequeue(size);

        while (true) {
            System.out.println("Enter the choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element:");
                    int key = sc.nextInt();
                    q.insert(key);
                    break;
                case 2:
                    q.delete();
                    break;
                case 3:
                    q.display();
                    break;
            }

        }

    }
}
