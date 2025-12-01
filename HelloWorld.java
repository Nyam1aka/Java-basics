@FunctionalInterface
interface Hello{
    void show();
}

public class HelloWorld{
    public static void main(String [] args){
        Hello h = () ->
                System.out.println("Hello world");
        h.show();
    }
}