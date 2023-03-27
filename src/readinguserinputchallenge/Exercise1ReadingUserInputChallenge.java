package readinguserinputchallenge;
/**1. Read 10 numbers from the console entered by the user and print the sum of those
numbers.*/
import java.util.Scanner;

public class Exercise1ReadingUserInputChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 1;

        while (counter <= 10) {
            System.out.println("Enter number # ");
            boolean isIntegerNumber = scanner.hasNextInt();
            if (isIntegerNumber) {
                int n = scanner.nextInt();
                sum = sum + n;
                counter++;
            }
            if (!isIntegerNumber) {
                System.out.println(" Invalid number, enter again: ");
                scanner.next();
            }

        }

        System.out.println("Sum of numbers " + sum);


    }
}


