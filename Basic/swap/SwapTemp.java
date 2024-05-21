package swap;
import java.util.Scanner;
public class SwapTemp {
    public static void main(String[] args) {
        int num1, num2, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1:");
        num1 = sc.nextInt();
        System.out.print("Enter num2:");
        num2 = sc.nextInt();
        System.out.println("Before swap: num1=" + num1 + ", num2=" + num2);
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Before after: num1=" + num1 + ", num2=" + num2);
    }
}
