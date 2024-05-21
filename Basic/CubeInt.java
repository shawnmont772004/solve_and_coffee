import java.util.Scanner;

public class CubeInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number:");
        num = sc.nextInt();
        int cb = num * num * num;
        System.out.println("The cube of the given number " + num + " is:" + cb);

    }

}
