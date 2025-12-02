import java.util.Scanner;

public class IfElseLeapYear{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year to check if it is a Leap year: ");
        int year = input.nextInt();

        if (year % 100 == 0 && year % 400 == 0){ //using .equals to compare strings
            System.out.println("The year " + year + " is a leap year.");
        } else if ( year % 4 == 0){
            System.out.println("The year " + year + " is a leap year.");
        } else {
            System.out.println("The year " + year + " is not a leap year.");
        }

    }
}