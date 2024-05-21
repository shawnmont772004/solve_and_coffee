import java.util.Scanner;

public class PalindromeRecursion {

    static int palindrome(int num, int reverse) {
        if (num != 0) {
            int mod = num % 10;
            reverse = reverse * 10 + mod;
            return palindrome(num / 10, reverse);
        } else {
            return reverse;
        }
    }

    static int ispalindorme(int num) {
        int reverse = 0;
        int rev = palindrome(num, reverse);
        if (rev == num) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        PalindromeRecursion p = new PalindromeRecursion();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check for palindrome:");
        int num = sc.nextInt();
        int result = p.ispalindorme(num);
        if (result == 1) {
            System.out.println("The given number " + num + " is a palindorme.");
        } else {
            System.out.println("The given number " + num + " is not a palindorme.");
        }

    }
}
