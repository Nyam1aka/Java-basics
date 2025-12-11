// RUNTIME POLYMORPHISM/ DYNAMIC POLYMORPHISM
import java.util.Scanner;

abstract class Animal{
    public abstract void speak();
}

class Dog extends Animal{

    @Override
    public void speak() {
      System.out.println("Dog goes *woof*");  
    }

}

class Cat extends Animal{

    @Override
    public void speak() {
        System.out.println("Cat goes *meow*");
    }

    
}
public class RunTimePolyMorphismExample {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Animal animal;

    System.out.print("Would you like a dog or a cat? (1 = dog, 2 = cat): ");
    int choice = scanner.nextInt();

    if(choice == 1){
        animal = new Dog();
        animal.speak();
    } else if (choice == 2){
        animal = new Cat();
        animal.speak();
    }
    
    scanner.close();
    }
}