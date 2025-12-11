// POLYMORPHISM BY USE OF ABSTRACT SUPER CLASS

// public interface Vehicle {
//     void go();   
// }

// If we were to use the above interface to achieve polymorphism the classes Car, Bike and Boat will implement the interface.


abstract class Vehicle{
    public abstract void go();
}


class Car extends Vehicle{
    
    @Override
    public void go(){
        System.out.println("You drive the car");
    }
}


class Bike extends Vehicle{

    @Override
    public void go() {
       System.out.println("You ride the bike");
    }
    
}

class Boat extends Vehicle{
    @Override
    public void go() {
       System.out.println("You sail the boat");
    }
}
public class PolyMorphismExample{
    public static void main(String[] args) {

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle [] vehicles = {car, bike, boat}; 

        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }
        
    }
}