
public class PalindromeCheckerApp {
//UseCase2

    public static void main(String[] args) {
        String word = "madam";
        String reversedWord = new StringBuilder(word).reverse().toString();
        if (word.equals(reversedWord)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}