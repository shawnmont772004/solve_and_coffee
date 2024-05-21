import java.util.*;

public class FibIteration {

    public static void main(String[] args) {
        int num;
        System.out.println("Enter the number to generate fibonacci sequence:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int first = 0, second = 1, fib = 0;
        System.out.println("The fibonnaci sequence is:");
        for (int i = 0; i < num; i++) {
            if (i <= 1) {
                System.out.println(i);
            } else {
                fib = first + second;
                System.out.println(fib);
                first = second;
                second = fib;
            }

        }

    }
}
