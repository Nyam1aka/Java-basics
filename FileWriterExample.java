import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

class WriteFile{
    public void testFile(){

        String fileName = "test.txt";
        String testContent = "This is my first file to write in java";

        try ( FileWriter writer = new FileWriter(fileName)) {
                    writer.write(testContent);
                    System.out.println("File has been written");
                    
        } catch (FileNotFoundException e){
            System.out.println("Could not find the location of the file!");
        } catch (IOException e) {
                    System.out.println("Encountered an error, the file has not been written!");
        }
    }
}
public class FileWriterExample{
    public static void main(String [] args) {

       WriteFile w = new WriteFile();
       w.testFile();
        
    }
}