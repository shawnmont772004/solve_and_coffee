package DSA.Queue;

import java.util.Scanner;

class Queue {
    private int maxSize;
    private int front;
    private int rear;
    private int nItems;
    private int[] queueArray;

    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
        } else {
            if (rear == maxSize - 1) { // wrap around
                rear = -1;
            }
            queueArray[++rear] = value;
            nItems++;
            System.out.println("Enqueued " + value + " into the queue.");
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        } else {
            int dequeuedValue = queueArray[front++];
            if (front == maxSize) { // wrap around
                front = 0;
            }
            nItems--;
            System.out.println("Dequeued " + dequeuedValue + " from the queue.");
            return dequeuedValue;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to peek.");
            return -1;
        } else {
            System.out.println("Front element is " + queueArray[front]);
            return queueArray[front];
        }
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            for (int i = 0; i < nItems; i++) {
                int index = (front + i) % maxSize;
                System.out.print(queueArray[index] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter queue size: ");
        int size = scanner.nextInt();
        Queue queue = new Queue(size);

        while (true) {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int value = scanner.nextInt();
                    queue.enqueue(value);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.peek();
                    break;
                case 4:
                    queue.display();
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
