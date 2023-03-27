/**10. Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153*/

package armstrongNumber;

import java.util.Scanner;

public class Exercise10ArmstrongNumber {

    public void isArmstrongNumber(int originalNumber) {
        int number = originalNumber;
        int x;
        int calcNumber = 0;

        while (number != 0) {
            x = number % 10; // taking the last digit
            //System.out.println(x);
            calcNumber = calcNumber + x * x * x;
            number /= 10; // removing last digit
        }
        if (calcNumber == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number");
        } else {
            System.out.println(originalNumber + " is not an armstrong number");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input any number: ");
        int num = sc.nextInt();
        Exercise10ArmstrongNumber obj = new Exercise10ArmstrongNumber();
        obj.isArmstrongNumber(num);
        sc.close();

    }


}
