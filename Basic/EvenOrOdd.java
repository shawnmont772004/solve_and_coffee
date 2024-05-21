import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number:");
        num = sc.nextInt();
        if (num == 0) {
            System.out.println("The given number " + num + " is niether odd nor even.");
        } else if (num % 2 == 0) {
            System.out.println("The given number " + num + " is an even number.");
        } else {
            System.out.println("The given number " + num + " is an odd number.");
        }
    }
}
