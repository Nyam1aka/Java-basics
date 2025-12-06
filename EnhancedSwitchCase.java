import java.util.Scanner;

class EnhancedCase{
    public void switchCase(String day){
        switch (day) {
            // case "Monday" -> System.out.println("It is a weekday.");
            // case "Tuesday" -> System.out.println("It is a weekday.");
            // case "Wenesday" -> System.out.println("It is a weekday.");
            // case "Thursday" -> System.out.println("It is a weekday.");
            // case "Friday" -> System.out.println("It is a weekday.");

            //Because the output is the same we can consolidate them together

            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday.");

            // case "Saturday" -> System.out.println("It is a weekend.");
            // case "Sunday" -> System.out.println("It is a weekend.");

            case "Saturday", "Sunday" -> System.out.println("It is a weekend.");
            
            default -> System.out.println(day + " is not a day!");
        }
    }
}
public class EnhancedSwitchCase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String d = input.nextLine();
        
        EnhancedCase e = new EnhancedCase();
        e.switchCase(d);

        input.close();
        
    }
}