import java.util.Scanner;

public class SquareInt {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number:");
        num = sc.nextInt();
        int sq= num*num;
        System.out.println("The square of the given number "+num+" is:"+sq);

    }
}
