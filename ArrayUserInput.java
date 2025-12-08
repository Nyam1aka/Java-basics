import java.util.Scanner;

class ArrayInput{
     Scanner input = new Scanner(System.in);
     public void userArray(){
        
        System.out.print("Enter the number of fruits: ");
        int size = input.nextInt();
        input.nextLine();

        String [] fruits = new String [size];

        for(int i = 0; i<fruits.length; i++){
            System.out.print("Enter the fruits: ");
            fruits[i] = input.nextLine();
        }

        for(String fruit: fruits){
            System.out.println(fruit);
        }

        input.close();

     }
}
public class ArrayUserInput{
    public static void main(String[] args) {
        ArrayInput a = new ArrayInput();
        a.userArray();
   }
}