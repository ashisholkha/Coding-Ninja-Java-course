//		Print the following pattern for the given N number of rows.
//
//				Pattern for N = 4
//				1
//				22
//				333
//				4444

import java.util.Scanner;

public class TriangularPattern4 {

	public static void main(String[] args) {
				
				Scanner s = new Scanner(System.in);
				int n = s.nextInt();
				int i=1;
				while(i<=n){
					int j = 1;
					while(j<=i){
						System.out.print(i);
						j++;
					}
					System.out.println();
					i++;
				}

	}

}
