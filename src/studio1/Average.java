package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("The first of two intergers to be averaged?");
		int n1 =in.nextInt();
		System.out.println("The second of two intergers to be averaged?");	
		int n2 =in.nextInt();
		double average = (double) (n1 +n2) / 2; 
		System.out.println("The average is " + average);
	}


}
