package primenumber;
/**12. Write a programme to input any number and check if it is prime or not.
(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
17.... are the prime numbers.)*/

import java.util.Scanner;

public class Exercise12PrimeNumber {

    public static void IsPrimeNumber(int number) {
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " is a prime number");

        } else {
            System.out.println(number + " is not a prime number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        IsPrimeNumber(num);
        sc.close();

    }

}
