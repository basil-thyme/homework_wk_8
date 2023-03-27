/**Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)*/
package fibonaccinumber;

import java.util.Scanner;

public class Exercise9FibonacciNumber {

    public static void fibonacciSeries(int number) {
        int x = 1;
        int y = 1;
        int z;
        int num = number;
        int counter = 0;
        System.out.println("Fibonacci Numbers: ");
        while (counter < num) {
            System.out.print(x + " ");
            z = y + x;
            x = y;
            y = z;
            counter++;
        }

    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        fibonacciSeries(number);
        sc.close();

    }
}