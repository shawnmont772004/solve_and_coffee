package DSA.Queue;

import java.util.Scanner;

public class Enqueue {

    int maxSize = 4;
    int front = 0;
    int rear = -1;
    int nitems = 0;
    int[] queueArray = new int[maxSize];

    public void insert(int key) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        } else {
            if (rear == maxSize - 1) {
                rear = -1;
            }
            queueArray[++rear] = key;
            nitems++;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
        } else {
            for (int i = 0; i < nitems; i++) {
                int index = (front + i) % maxSize;
                System.out.print(queueArray[index] + " ");
                System.out.println();
            }
        }
    }

    public boolean isFull() {
        return (nitems == maxSize);
    }

    public boolean isEmpty() {
        return (nitems == 0);
    }

    public static void main(String[] args) {
        Enqueue q = new Enqueue();
        Scanner sc = new Scanner(System.in);
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
                    q.display();
                    break;
            }
        }

    }
}
