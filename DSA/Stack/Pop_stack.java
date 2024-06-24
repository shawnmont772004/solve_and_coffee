package DSA.Stack;

public class Pop_stack {

    int maxSize = 2;
    int[] stackArray = new int[maxSize];
    int top = -1;

    public void push(int key) {
        System.out.print(top);
        if (top < maxSize - 1) {
            stackArray[++top] = key;

        } else {
            System.out.print("Stack is full");
            return;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int popval = stackArray[top--];
            System.out.println("The popped value is" + popval);
            return popval;

        }

    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public static void main(String[] args) {
        Pop_stack p = new Pop_stack();
        p.push(5);
        p.push(6);

        p.pop();
        p.pop();
        p.pop();

    }
}
