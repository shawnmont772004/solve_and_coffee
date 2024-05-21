import java.util.Scanner;

public class PalindromeIteration {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the number whether it is palindrome or not:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int reverse = 0;
        int n = num;

        while (n != 0) {
            int mod = n % 10;
            reverse = reverse * 10 + mod;
            n = n / 10;
        }

        if (reverse == num) {
            System.out.println("The given number " + num + " is a palindrome.");
        } else {
            System.out.println("The given number " + num + " is not a palindrome.");
        }
    }
}
