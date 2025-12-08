class ElipExample{
    public double average(double... numbers){
        double sum = 0;

        for(double number: numbers){
            sum += number;
        }
         
        return sum/numbers.length;
    }
}
public class ElipsisExample {

    public static void main(String [] args){
        ElipExample e = new ElipExample();
        double av = e.average(4,5,8,20);
        System.out.println(av);

    }
}