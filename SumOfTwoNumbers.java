import java.util.Scanner;

public class SumOfTwoNumbers{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Give the first number: ");
        int first = input.nextInt();
        System.out.println("Give the second number: ");
        int second = input.nextInt();

        int sum = first + second;
        System.out.println("The sum of the numbers is: " + sum);
    }
}