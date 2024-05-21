import java.util.*;

public class ReverseInteger {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        num = sc.nextInt();
        int reverse = 0, rem;
        while (num != 0) {
            rem = num % 10;
            reverse = (reverse * 10) + rem;
            num = num / 10;
        }
        System.out.println("The reversed number is:" + reverse);

    }
}
