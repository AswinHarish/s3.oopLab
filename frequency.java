import java.util.Scanner;

public class frequency {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine().toLowerCase();

        System.out.print("Enter a character to find its frequency: ");
        char key = scanner.nextLine().charAt(0);

        int freq = 0;
        for (char c : str.toCharArray()) {
            if (c == key){
                freq++;
            }
        }

        System.out.println("The frequency of character "+ key + " in string is : " + freq);
    }
}
