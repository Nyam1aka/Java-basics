import java.util.Scanner;

public class IfStatementExample{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer number: ");
        int num = input.nextInt();
        if (num == 1984){
            System.out.println("Orwell");
        } else {
            System.out.println("Try again");
        }

        if (num < 2015){
            System.out.println("Ancient history!");
        } else {
            System.out.println("Modern times");
        }
        
    }
}