//		Write a program that takes a character as input and prints 1, 0, or -1 according to the following rules.
//
//
//
//		1, if the character is an uppercase alphabet (A - Z).
//		0, if the character is a lowercase alphabet (a - z).
//		-1, if the character is not an alphabet.
//
//
//		Example:
//		Input: The character is 'a'.
//
//		Output: 0
//
//		Explanation: The input character is lowercase, so our answer is 0.

import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        char n = s.next().charAt(0);
        int a = n;
        if(a>=65 && a<=90)
        {
            System.out.print("1");
        }
        else if(a>=97 && a<=122)
        {
            System.out.print("0");
        }
        else
        {
            System.out.print("-1");
        }

    }
}
