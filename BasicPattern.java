//		Print the following pattern for the given N number of rows.
//
//		Pattern for N = 3
//		###
//		###
//		###

import java.util.*;
import java.util.Scanner;

public class Solution
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		while(i<=n){
			int j = 1;
			while(j<=n){
				System.out.print("#");
				j++;
			}
			System.out.println();
			i++;
		}

		 
	}
}
