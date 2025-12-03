@FunctionalInterface
interface Hi{
    void hello();
}
public class ForLoop {
    public static void main(String[] args) {
        Hi h = () -> {
            for(int i = 0; i<5; i++){
                System.out.println("Hi");
            }
        };
         h.hello();
    }
}
