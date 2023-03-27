package palindromenumber;
/**5. Palindrome Number
 Write a method called isPalindrome with one int parameter called number.
 The method needs to return a boolean.
 It should return true if the number is a palindrome number otherwise it should return false.
 Check the tips below for more info about palindromes.
 Example Input/Output
 isPalindrome(-1221); → should return true
 isPalindrome(707); → should return true
 isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
 11212.*/
public class Exercise5PalindromeNumber {

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        boolean outcome = false;
        int originalNumber = number;

        while (number != 0) {
            int lastDigit = number % 10;
            // System.out.println("lastdigit " + lastDigit);
            reverse = (reverse * 10) + lastDigit;
            //System.out.println(" Reverse " + reverse);
            // System.out.println("number is = " + number);
            number = number / 10;
            // System.out.println("number after discarding is = " + number);
        }


        if (reverse == originalNumber) {
            System.out.println( originalNumber + " is Palindrome");
            outcome = true;
            System.out.println(outcome);
        } else {
            System.out.println(originalNumber + " is not Palindrome");
            outcome = false;
            System.out.println(outcome);
        }

        return outcome;
    }

    public static void main(String[] args) {
        isPalindrome(707);
        isPalindrome(-1221);
        isPalindrome(12321);
        isPalindrome(123456);

    }

}
