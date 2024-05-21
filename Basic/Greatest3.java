import java.util.Scanner;

public class Greatest3 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        num1 = sc.nextInt();
        System.out.print("Enter the second number:");
        num2 = sc.nextInt();
        System.out.print("Enter the third number:");
        num3 = sc.nextInt();
        int max;
        if(num1 > num2 && num1 > num3){
            max=num1;
        }
        else if(num2 > num3){
            max=num2;
        }
        else{
            max=num3;
        }
        System.out.println("The greatest number among the three is:"+max);



    }
}
