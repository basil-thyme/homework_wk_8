/**15. Display left angle triangle of * using nested for loops
 *
 * *
 * * *
 * * * *
 * * * * **/
package displaypattern;

import java.util.Scanner;

public class Exercise15LeftAngleTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int rows = sc.nextInt();

        for (int j = 1; j <= rows; j++) {
            for (int i = 1; i <= rows - j; i++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= j; k++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}