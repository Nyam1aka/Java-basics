import java.util.Scanner;

public class IfElseStatementExample{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number to check: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number to check: ");
        int num2 = input.nextInt();
        if (num1 > num2){
            System.out.println(num1);
        } else if(num1 == num2){
            System.out.println("The numbers are equal!");
        } else{
            System.out.println(num2);
        }

    }
}