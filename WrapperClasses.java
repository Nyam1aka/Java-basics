public class WrapperClasses {

    public static void main(String[] args) {

        //AUTOBOXING
        Integer a = 123;
        Double b = 3.14;
        
        //UNBOXING
        int x = a;
        double y = b;

        System.out.println(x + " " + y);

        //Primitive data types can be converted to String using wrapper classes
        String k = Integer.toString(23);
        String j = Double.toString(3.14);

        String g = k + j;
        System.out.println(g);


        //String conversion into primitive data types

        int h = Integer.parseInt("123");
        double e = Double.parseDouble("3.142");
        boolean l = Boolean.parseBoolean("true");

        System.out.println(h);
        System.out.println(e);
        System.out.println(l);
    }
}