import java.util.Scanner;

public class VariablesExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give a string: ");
        String name = input.nextLine();
        System.out.println("Give an Integer: ");
        int age = input.nextInt();
        System.out.println("Give a double: ");
        double variation = input.nextDouble();
        System.out.println("Give a boolean: ");
        boolean trueOrFalse = input.nextBoolean();

        //The output of the program
        System.out.println("You gave the string " + name + ". You gave the integer age " + age + ". You gave the double " + variation + ". You gave the boolean " + trueOrFalse);
    }
}