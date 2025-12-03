import java.util.Scanner;

class Switch{
    public void caseValues(int num){
        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
                break;
        }
    }
}
public class SwitchCase {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter your choice: ");
            int n = input.nextInt();
            Switch s = new Switch();
            s.caseValues(n);
        }
    }
    
}
