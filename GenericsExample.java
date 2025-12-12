class Box <T> {
    T item;

    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return this.item;
    }
}
// The generic type can be two 
class Product <T, U>{
    T item;
    U price;

    public Product(T item, U price){
        this.item = item;
        this.price = price;
    }

    public void showProduct(){
        System.out.println("The " + item + " price is " + price);
    }
}

public class GenericsExample{
    public static void main(String[] args) {
        
        Box <String> box = new Box <> ();

        box.setItem("Orange");

        String fruit = box.getItem();
        System.out.println(fruit);

        Product <String, Double> product = new Product <> ("Laptop", 30000.00);
        Product <String, Integer> product1 = new Product <> ("ticket", 300);
        product.showProduct();
        product1.showProduct();
    }
}