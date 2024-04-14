//		Print the following pattern for the given N number of rows.
//
//		Pattern for N = 4
//		1
//		23
//		345
//		4567

import java.util.Scanner;

public class TriangularPattern2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		while(i<=n){
			int j = 1;
			int counter = i;
			while(j<=i){
				System.out.print(counter);
				j++;
				counter++;
			}
			System.out.println();
			i++;
		}

	}

}
