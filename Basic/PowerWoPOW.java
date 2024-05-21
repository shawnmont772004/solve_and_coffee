import java.util.Scanner;

public class PowerWoPOW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, exp;
        System.out.println("Enter the base number:");
        num = sc.nextInt();
        System.out.println("Enter the exponent:");
        exp = sc.nextInt();
        int power=1;
        if(exp==0)
        {
            System.out.println("The result is 1");
        }
        else{
            while(exp!=0)
            {
                power=power*num;
                exp--;
            }
            System.out.println("The square of the given number " + num + " is:" + power);
        }
    }
}
