import java.util.Scanner;
class EnhancedCase1{
    Scanner input = new Scanner(System.in);
    
    double result = 0;
    boolean validOperation = true;

    public void switchCase1(){
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the operation (+,-,*,^,/): ");
        char operator = input.next().charAt(0);

        System.out.print("Enter the second number: ");
        double num2 = input.nextInt();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '^' -> result = Math.pow(num1,num2);
            case '/' -> {
                if (num2 == 0){
                    System.out.println("Cannot divide by zero!");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
            }
            
            default ->{
                System.out.println("Invalid Operator!");
                validOperation = false;
            } 
        }

        if (validOperation){
            System.out.println(result);
        }

        input.close();
    }
}
public class EnhancedSwitchCaseExample2 {

    public static void main(String[] args) {

        EnhancedCase1 e = new EnhancedCase1();
        e.switchCase1();

    }
}



