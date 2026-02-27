import java.util.Scanner;


class PalindromeCheckerApp {


    public static void main(String[] args) {
<<<<<<< HEAD
        System.out.println("welcome to palindrome checker mangement system");//use case one
=======
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to palindrome checker mangement system");//use case 1

        System.out.println("Enter words to check ");//use case 1
            String word = sc.nextLine();
            String reversed = new StringBuilder(word).reverse().toString();
            if (word.equals(reversed)) {
                System.out.println(word + " is a palindrome.");
            } else {
                System.out.println(word + " is not a palindrome.");
            }
>>>>>>> 98075cc (UC1: Add welcome message module)
    }
}
