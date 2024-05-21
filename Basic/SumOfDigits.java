import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int orgnum=num;
        int sum = 0;
        while (num != 0) {
            int i = num % 10;
            sum += i;
            num = num / 10;
        }

        System.out.println("The sum of the digits of " + orgnum + "is: " + sum);
    }
}
