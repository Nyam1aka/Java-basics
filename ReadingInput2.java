import java.util.Scanner;

public class ReadingInput2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        //Write your program here
        System.out.println("Greetings! How are you doing?");
        String message1 = reader.nextLine();
        System.out.println("Oh, how interesting. Tell me more!");
        String message2 = reader.nextLine();
        


        //Printing output
        System.out.println("Greetings! How are you doing?");
        System.out.println(message1);
        System.out.println("Oh, how interesting. Tell me more!");
        System.out.println(message2);
        System.out.println("Thanks for sharing!");

    }
}