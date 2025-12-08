import java.util.Scanner;

class JavaGame{
    Scanner input = new Scanner(System.in);
    public void computerExam(){
         String [] questions = {"What is a computer?",
                                "What is the role of A.I in programming?",
                                "What is a CPU?",
                                "Give me one type of interface",
                                "Is a phone a computer?"};

        String [][] options = {{"1. Electronic device", "2. A machine", "3. A phone", "4. Magnetic Device"}, 
                               {"1. Reduce code quality", "2. Improve code quality",  "3. Destroy computers", "4. Create ghost workers"},
                               {"1. Computer program unit", "2. Control program usage", "3. Central program user", "4. Central Processing Unit"}, 
                               {"1. Interface user", "2. Graphical User Interface", "3. People user interface"}, 
                               {"1. Yes", "2. No", "3. Rather not say"}};

        int [] answers = {1, 2, 4, 2, 1};
        int score = 0;
        int choice;

        System.out.println("**************************");
        System.out.println("Welcome to Computer exam!");
        System.out.println("**************************");

        for(int i=0; i< questions.length; i++){
            System.out.println(questions[i]);
            for (String option : options[i]) {
               System.out.println(option); 
            }

            System.out.print("Enter your answer: ");
            choice = input.nextInt();

            if (choice == answers[i]) {
                System.out.println("********");
                System.out.println("CORRECT!");
                System.out.println("********");
                score++;
            } else {
                System.out.println("********");
                System.out.println("WRONG!");
                System.out.println("********");
            }

        }

        System.out.println("Your final score is: " + score + " out of " + questions.length );
        input.close();

    }
}

public class ArrayGame{
    public static void main(String [] args){
        JavaGame j = new JavaGame();
        j.computerExam();
       
    }
}