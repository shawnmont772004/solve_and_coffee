import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to check it is leap year or not:");
        year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("The given year " + year + " is a leap year.");
                } else {
                    System.out.println("The given year " + year + " is not a leap year.");
                }

            } else {
                System.out.println("The given year " + year + " is a leap year.");
            }
        } else {
            System.out.println("The given year " + year + " is not a leap year.");
        }
    }
}
