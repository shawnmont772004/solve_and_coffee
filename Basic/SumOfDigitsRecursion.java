import java.util.Scanner;
public class SumOfDigitsRecursion {
    static int sum=0;
    static int Sum(int num)
    {
        if(num!=0)
        {
            int mod=num%10;
            sum+=mod;
            return Sum(num/10);
        }
        else{
            return sum;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        SumOfDigitsRecursion s = new SumOfDigitsRecursion();
        int result= s.Sum(num);
        System.out.println("The sum of the digits of "+num+" is:"+result);
    }
}
