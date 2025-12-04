import java.util.Scanner;
class Calculation{
    public void circumference(double r){
        double circum = 2 * Math.PI * r;
        System.out.printf("The circumference of the circle is: %.2fcm\n", circum);
    }

    public void area(double r){
        double ar = Math.PI * Math.pow(r, 2);
        System.out.printf("The area of the circle is: %.2fcm²\n", ar);
        

    }

    public void volume(double r){
        double vol = (4.0/3.0) * Math.PI * Math.pow(r, 3);
        System.out.printf("The volume of the sphere is: %.2fcm³\n", vol);
    }
    
}
public class MathFunctions{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();
        Calculation obj = new Calculation();
        obj.circumference(radius);
        obj.area(radius);
        obj.volume(radius);

        input.close();
    }
}