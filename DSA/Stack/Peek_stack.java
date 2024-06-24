package DSA.Stack;

import java.util.Scanner;

public class Peek_stack {

    int maxSize = 5;
    int[] stackArray = new int[maxSize];
    int top = -1;

    public void push(int key) {
        if (isFull()) {
            System.out.println("The stack is full");
            return;
        } else {
            stackArray[++top] = key;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("there exists no peek element ");
            return -1;
        } else {
            System.out.println("The peek element is " + stackArray[top]);
            return stackArray[top];
        }
    }

    public void display() {
        for (int i = 0; i < maxSize; i++) {
            System.out.print(stackArray[i] + ",");
        }
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public static void main(String[] args) {
        Peek_stack p = new Peek_stack();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element to push:");
                    int key = sc.nextInt();
                    p.push(key);
                    break;
                case 2:
                    p.display();
                    break;

                case 3:
                    p.peek();
                    break;

                case 4:
                    sc.close();
                    System.exit(0);
                    break;
            }
        }

    }
}
