package DSA.Stack;

import java.util.Scanner;

public class Push_stack {
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

    public void display() {
        for (int i = 0; i < maxSize; i++) {
            System.out.print(stackArray[i] + ",");
        }
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        Push_stack p = new Push_stack();
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
                    sc.close();
                    System.exit(0);
                    break;
            }
        }

    }
}
