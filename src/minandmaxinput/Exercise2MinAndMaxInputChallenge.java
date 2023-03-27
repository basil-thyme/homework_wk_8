package minandmaxinput;
/**2. -Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.*/
import java.util.Scanner;

public class Exercise2MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(true){
            System.out.println("Enter number: ");
            if (sc.hasNextInt()){
                int number = sc.nextInt();
                if(number < min){
                    min = number;
                }
                if(number > max){
                    max = number;
                }
            }else{
                break;
            }
            sc.nextLine();// discard the input
        }
        System.out.println("Minimum number entered: " + min);
        System.out.println("Maximum number entered: " + max);
        sc.close();
    }
}



