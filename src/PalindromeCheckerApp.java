import java.util.Scanner;
//UseCase3	
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it's a palindrome: ");
        String original = scanner.nextLine();

       
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);         }
        if (original.equals(reversed)) {
            System.out.println("Result: The string \"" + original + "\" IS a palindrome.");
        } else {
            System.out.println("Result: The string \"" + original + "\" is NOT a palindrome.");
        }

        scanner.close();
    }


