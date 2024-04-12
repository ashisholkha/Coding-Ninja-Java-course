//		Write a program that takes a number as input and prints all its factors except 1 and the number itself.. 
//		If the number has only two factors (1 and the number itself), then the program should print -1.

import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    int i=2;
	    boolean hasFactors = false;
	    while(n>i)
	    {
	        if(n%i==0)
	        {
	        	hasFactors = true;
	        	System.out.print(i+" ");
	        }
	        i++;
	    } 
	    if (!hasFactors) 
			{
            	System.out.println("-1");
    		}
	    else 
			{
            	System.out.println();
        	}
    }
}
