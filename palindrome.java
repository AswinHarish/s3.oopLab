import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine().toLowerCase();
        int n = str.length();
        boolean Palindrome = true;

        for (int i = 0; i < n / 2; i++){
            if (str.charAt(i) != str.charAt(n - i - 1)){
                Palindrome = false;
                break;
            }
        }

        if (Palindrome){
            System.out.println("The string is palindrome");
        }
        else {
            System.out.println("The string is not a palindrome");
        }
    }
}
