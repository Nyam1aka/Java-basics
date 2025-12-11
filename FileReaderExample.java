import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    public static void main(String [] args){

        String filePath = "C:\\Users\\Colin Kebaso\\Desktop\\mine\\test.txt";

       

        try ( BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
           
            String line;
            while((line = reader.readLine()) != null ){
                System.out.println(line);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate the file!");
        } catch (IOException e){
            System.out.println("We encountered an error!");
        }
    }
}