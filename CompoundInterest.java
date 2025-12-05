import java.util.Scanner;

class Amount{
    public void comInterest(double p, double r, int t, int y){
        double amount = p * Math.pow(1 + r/t, t * y);
        System.out.printf("The accumulated amount after %d year is Ksh%.2f\n", y, amount);
    }
}
public class CompoundInterest{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        double rate = input.nextDouble()/100;

        System.out.print("Enter the number of times compounded per year: ");
        int timeCompounded = input.nextInt();

        System.out.print("Enter the number of years to be compounded: ");
        int years = input.nextInt();

        Amount a = new Amount();
        a.comInterest(principal, rate, timeCompounded, years); 

        input.close();
    }
}