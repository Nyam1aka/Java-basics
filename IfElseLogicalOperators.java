import java.util.Scanner;

public class IfElseLogicalOperators{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to check divisibility: ");
        int num = input.nextInt();

        if (num % 3 == 0 && num % 5 == 0){ //using .equals to compare strings
            System.out.println("FizzBuzz");
        } else if ( num % 3 == 0){
            System.out.println("Fizz");
        } else if (num % 5 == 0){
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }

    }
}