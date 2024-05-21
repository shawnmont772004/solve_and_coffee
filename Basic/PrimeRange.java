import java.util.Scanner;
public class PrimeRange{
    public static void main(String[] args)
    {
        int initial;
        int finall;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the lower bound:");
        initial = sc.nextInt();
        System.out.println("Enter the upper bound:");
        finall = sc.nextInt();
        System.out.println("The prime numbers in the range"+initial+" to "+ finall+" are:");
        for(int i=initial;i<finall;i++)
        {
            int flag=0;
            for(int j=1;j<i;j++)
            {
                if(i%j==0)
                {
                    flag++;
                }
            }
            if(flag==1)
            {
                System.out.println(i);
            }
        }


    }
}