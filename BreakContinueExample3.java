import java.util.Scanner;

public class BreakContinueExample3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // For saving number of numbers
        int numberOfPositives = 0;
        int numberOfNegatives = 0;

        // For repeatedly asking for numbers
        while (true) {
            System.out.println("Give a number (0 to stop): ");
            // For reading user input
            int numberFromUser = input.nextInt();

            // For breaking the loop when user writes 0
            if (numberFromUser == 0) {
                break;
            }

            // For increasing numberOfPositives and numberOfNegatives by one
            // when user gives a positive number it executes if block
            if (numberFromUser > 0) {
                numberOfPositives = numberOfPositives + 1;
            } else{
                numberOfNegatives = numberOfNegatives + 1;
            }

        }

        // For printing the number of positive numbers
        System.out.println("Positive numbers: " + numberOfPositives);
        // For printing the number of negative numbers
        System.out.println("Negative numbers: " + numberOfNegatives);
    }
}