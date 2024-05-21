import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whether it is prime or not:");
        num = sc.nextInt();
        int flag = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                flag++;
            }
        }
        if (flag == 1) {
            System.out.println("The given number " + num + " is a prime number");
        }
        else{
            System.out.println("The given number " + num + " is not a prime number");
        }
    }
}
