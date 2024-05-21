import java.util.Scanner;

public class FibRecursion {
    public int fibonacci(int i)
    {
        if(i==0) return 0;
        else if(i==1) return 1;
        else{
            return fibonacci(i-1)+fibonacci(i-2);
        }
    }

    public static void main(String[] args) {
        int num;
        System.out.println("Enter the number to generate fibonacci sequence:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        
        FibRecursion f = new FibRecursion();

        for(int i=0;i<num;i++)
        {
            System.out.println(f.fibonacci(i));
        }
        
    }
}
