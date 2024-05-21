import java.util.Scanner;

public class FactorialIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int factorial = 1;
        int orgnum=num;
        if (num == 0 && num == 1) {
            System.out.println("The factorial of the givn number " + num + " is:1");
        } else {
            while (num != 1) {
                factorial = factorial * num;
                num--;
            }
            System.out.println("The factorial of the givn number " + orgnum + " is:" + factorial);
        }

    }
}
