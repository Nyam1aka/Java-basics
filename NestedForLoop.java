@FunctionalInterface
interface HiHello{
    void hello();
}
public class NestedForLoop {
    public static void main(String[] args) {
        HiHello h = () -> {
            for(int i = 0; i<5; i++){
                System.out.println("Hi");
                for(int j = 0; j<2; j++){
                    System.out.println("Hello");
                }
            }
        };
         h.hello();
    }
}
