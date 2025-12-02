import java.util.Scanner;

public class IfElseStringComparison{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the password: ");
        String password1 = input.nextLine();
        System.out.println("Repeat the password: ");
        String password2 = input.nextLine();
        if (password1.equals(password2)){ //using .equals to compare strings
            System.out.println("Welcome");
        } else{
            System.out.println("The passwords do not match");
        }

    }
}