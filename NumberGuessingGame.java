import java.util.Random;
import java.util.Scanner;

class Game{
    Random r = new Random();
    Scanner input = new Scanner(System.in);

    public int attempts = 0;
    public int guess;

    public void numberGuessing(){
        int randomNumber = r.nextInt(1, 11);
        
        do {
            System.out.print("Enter a guess: ");
            guess = input.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("TOO LOW! Try again");
            } else if (guess > randomNumber){
                System.out.println("TOO HIGH! Try again");
            } else{
                System.out.println("CORRECT! The number was " + randomNumber);
                System.out.println("Number of attempts: " + attempts);
            }

        } while (guess != randomNumber);

        input.close();
    }

}
public class NumberGuessingGame{
    public static void main(String[] args) {
        
        System.out.println("Number Guessing Game.");
        System.out.println("Guess a number between 1-10");
        
        Game n = new Game();
        n.numberGuessing();

        
    }
}