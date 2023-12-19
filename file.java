import java.io.*;

public class file{
    public static void main(String[] args){
        String inputFile = "input.txt";
        String outputFile = "output.txt";
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            
            String line;
            while ((line = reader.readLine()) != null){
                writer.write(line + "\n");
            }
            
            reader.close();
            writer.close();
            
            System.out.println("File contents copied successfully");
        } catch (IOException e) {
            System.err.println("Error in performing read/write operation to file");
        }
    }
}
