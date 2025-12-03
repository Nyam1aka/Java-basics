import java.util.Scanner;

public class BreakContinueExample2{
    public static void main(String [] args){
         Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Input a number ");
            int number = input.nextInt();

            if (number < 0) {
                System.out.println("Unfit number");
                continue;
            }

            if (number == 0) {
                break;
            }

            System.out.println(number * number);
        }
    }
   
}