import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
//UseCase7
public class PalindromeCheckerApp {


    public static boolean isPalindrome(String input) {

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to palindrome checker mangement system");//use case 1

       
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC7: Deque-Based Palindrome Checker ===");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome.");
        }

        scanner.close();
    }
}

