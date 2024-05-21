import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        num = sc.nextInt();
        System.out.println("The square root of the given number " + num + " is:" + Math.sqrt(num));
    }
}
