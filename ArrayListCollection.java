import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCollection{
    public static void main(String args[]){
        
        Scanner scanner = new Scanner(System.in);

        ArrayList <String> fruits = new ArrayList <>();

        System.out.print("Enter the number of fruits you would like: ");
        int numberOfFruits = scanner.nextInt();
        scanner.nextLine();

        for(int i=1; i<=numberOfFruits; i++){
            System.out.print("Enter fruit number " + i +" :");
            String fruit = scanner.nextLine();

            fruits.add(fruit);
        }

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        scanner.close();
    }
}