import java.util.Scanner;

public class PerfectNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int divisors[] = new int[20];
        int j = 0;
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                divisors[j] = i;
                j++;
            }
        }
        for (int i = 0; i < j; i++) {
            sum += divisors[i];
        }
        if (sum == num) {
            System.out.println("the given number " + num + " is a perfect number.");
        } else {
            System.out.println("the given number " + num + " is not a perfect number.");
        }
    }
}
