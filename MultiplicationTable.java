// Write a program that generates a multiplication table for a given integer.

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int tab ;
		while(i<=10){
			tab = i*n;
			System.out.println(tab);
			i=i+1;
		}

	}
}
