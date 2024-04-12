//		Take the principal amount, rate of interest, and the time period as input and calculate the Simple Interest.
//
//		Note: Print the answer as integer value.

import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner s = new Scanner(System.in);
		double p = s.nextDouble();
		double r = s.nextDouble();
		double t = s.nextDouble();
		int si = (int) (p*r*t)/100;
		System.out.println(si);
		
	}
}
