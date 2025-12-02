import java.util.Scanner;

public class ReadingInput1 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        //Write your program here
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String message1 = reader.nextLine();
        System.out.println("What is their job?");
        String message2 = reader.nextLine();
        


        //Printing output
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was "+ message1 + ", who was a " + message2);
        System.out.println("On the way to work, " + message1 + " reflected on life.");
        System.out.println("Perhaps " + message1 + " will not be a " + message2 + " forever.");

    }
}