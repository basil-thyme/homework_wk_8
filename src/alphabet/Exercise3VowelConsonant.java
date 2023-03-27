/**3. Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel of Consonant, depending on the user input. If the user input
Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.
For eg:
Input an alphabet: p
Expected Output:
Input letter is Consonant*/
package alphabet;

import java.util.Scanner;

public class Exercise3VowelConsonant {
    public void vowelConsonant(char ch){

        int a = 0;
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                a++;
        }
        if (a == 1) {
            System.out.println("Input letter " + ch + " is Vowel");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            System.out.println("Input letter " + ch + " is Consonant");
        else
            System.out.println("Input is not a letter");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        char ch = sc.next().charAt(0);
        Exercise3VowelConsonant obj = new Exercise3VowelConsonant();
        obj.vowelConsonant(ch);
        sc.close();
    }

}


