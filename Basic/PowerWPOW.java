import java.util.Scanner;

public class PowerWPOW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, exp;
        System.out.println("Enter the base number:");
        num = sc.nextInt();
        System.out.println("Enter the exponent:");
        exp = sc.nextInt();
        System.out.println("The square of the given number " + num + " is:" + Math.pow(num, exp));
    }
}
