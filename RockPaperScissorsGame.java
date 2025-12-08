import java.util.Random;
import java.util.Scanner;

class ComputerUserGame{
    Random random = new Random();
    Scanner input = new Scanner(System.in);

    String playAgain = "yes";

    public void userComputerGame(){
        do {
            String [] gameOptions = {"rock", "paper", "scissors"};
            
            System.out.print("Enter your pick (rock, paper, scissors): ");
            String userChoice = input.nextLine().toLowerCase();

            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid choice!");
                continue;
            }

            String computerChoice = gameOptions[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            if (userChoice.equals(computerChoice)) {
                System.out.println("It is a tie!");
            } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) || 
                        (userChoice.equals("paper") && computerChoice.equals("rock")) || 
                        (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            System.out.println("You want to continue playing (yes/no): ");
            playAgain = input.nextLine().toLowerCase();
        } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing!");

        input.close();

    }
}

public class RockPaperScissorsGame{
    public static void main(String[] args) {
        ComputerUserGame c = new ComputerUserGame();
        c.userComputerGame();  
    }
}