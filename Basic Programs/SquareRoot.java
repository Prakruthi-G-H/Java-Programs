package programs;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		 int n=s.nextInt();
		 double m=Math.sqrt(n);
		 System.out.println("Square Root of "+n+" is "+m);
		 s.close();
	}

}
