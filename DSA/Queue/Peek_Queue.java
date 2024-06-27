package DSA.Queue;

import java.util.Scanner;

public class Peek_Queue {

    private int maxSize;
    private int nitems;
    private int front;
    private int rear;
    private int[] qarray;

    public Peek_Queue(int size) {
        qarray = new int[size];
        maxSize = size;
        nitems = 0;
        front = 0;
        rear = -1;
    }

    public void enqueue(int key) {
        if (nitems == maxSize) {
            System.out.println("Queue is full");
        } else {
            if (rear == maxSize - 1) {
                rear = -1;
            }
            qarray[++rear] = key;
            nitems++;
        }
    }

    public int dequeue() {
        if (nitems == 0) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int deqelem = qarray[front++];
            if (front == maxSize) {
                front = 0;
            }
            nitems--;
            return deqelem;

        }
    }

    public void peek() {
        if (nitems == 0) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(qarray[front]);
        }
    }

    public void display() {
        if (nitems == 0) {
            System.out.println("Queue is empty");
        } else {
            for (int i = 0; i < nitems; i++) {
                int index = (front + i) % maxSize;
                System.out.print(qarray[index] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        Peek_Queue p = new Peek_Queue(size);

        while (true) {
            System.out.println("Enter the choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element");
                    int key = sc.nextInt();
                    p.enqueue(key);
                    break;
                case 2:
                    p.dequeue();
                    break;

                case 3:
                    p.peek();
                    break;

                case 4:
                    p.display();
                    break;
            }
        }

    }
}
