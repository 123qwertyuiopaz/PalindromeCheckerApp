import java.util.Scanner;
class PalindromeCheckerApp {

    //use case 4
    public static boolean isPalindrome(String str) {
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                return false;            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the word  : ");
                String test1 = sc.nextLine();
                System.out.println("input: "+test1+" \nIs Palindrome?"+ " → " + isPalindrome(test1));
            }
}



