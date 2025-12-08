import java.util.Scanner;

class ArrayExampleSearch{
    Scanner input = new Scanner(System.in);

    public void search(){
        String [] fruits = {"mango", "apple", "orange", "banana"};

        System.out.print("Enter the name of element to search: ");
        String target = input.nextLine();
        
        boolean isFound = false;

        for(int i = 0; i<fruits.length; i++){
            if(target.equals(fruits[i])){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("Element not found in the array!");
        }

        input.close();
    }
}
public class ArraySearch{
    public static void main(String[] args) {
        ArrayExampleSearch as = new ArrayExampleSearch();
        as.search();
 
    }
}