import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class tryCatchFinally {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("file.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();
            System.out.println("Read line from file: " + line);
        } catch (IOException e) {
            System.err.println("An IOException occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
