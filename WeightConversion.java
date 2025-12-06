import java.util.Scanner;
class Conversion{
    Scanner input = new Scanner(System.in);
    public void weigh(){
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        if(choice == 1){
            System.out.print("Enter the weight in pounds(lbs): ");
            double weight = input.nextDouble();

            double newWeight = weight * 0.453592;

            System.out.printf("The weight in kgs is: %.2fkgs", newWeight);

        } else if(choice == 2){
            System.out.print("Enter the weight in kilograms(kgs): ");
            double weight = input.nextDouble();

            double newWeight = weight * 2.20462;

            System.out.printf("The weight in kgs is: %.2flbs", newWeight);

        } else{
            System.out.println("Invalid choice!");
        }

        input.close(); 
    }
}
public class WeightConversion{
    public static void main(String[] args) {

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert pounds(lbs) to kilograms(kgs)");
        System.out.println("2: Convert kilograms(kgs) to pounds(lbs)");

        Conversion c = new Conversion();
        c.weigh();
    }
}