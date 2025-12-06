import java.util.Scanner;
class SubString{
    Scanner input = new Scanner(System.in);
    public void subs(){
        System.out.print("Enter your email: ");
        String email = input.nextLine();

        if(email.contains("@")){
            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@") + 1);

            System.out.println(username);
            System.out.println(domain);
        } else{
            System.out.println("Enter a valid email address!");
        }
       


        input.close();
    }
        
}
public class SubStringMethod{
    public static void main(String[] args) {
        SubString s = new SubString();
        s.subs();
    }
}