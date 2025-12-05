public class PrintfExample{
    public static void main(String[] args) {
        //printf() = is a method used to format the output
        //$[flags][width][.precision][specifier-character]

        String name = "Colin";
        char firstLetter = 'C';
        int age = 24;
        double height = 5.2;
        boolean isEmployed = false;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a letter %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %.2f fits tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old", name, age);
    }
}