import java.util.Scanner;

enum Day{
 
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

    private final int dayNumber;
    Day (int dayNumber){
        this.dayNumber = dayNumber;
    }

    public int getDayNumber(){
        return this.dayNumber;
    }
}

public class EnumDayExample {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the day of the week: ");
            String response = scanner.nextLine().toUpperCase();

            Day day = Day.valueOf(response);

            switch (day) {
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("It is a week day");  
                case SATURDAY, SUNDAY -> System.out.println("It is the weekend"); 
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day of the week!");
        }
    }
}