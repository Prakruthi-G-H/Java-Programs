package programs;

import java.util.Scanner;

public class DivisionOfTwoNumber {

	public static void main(String[] args) {
		int x, y, z;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter value of x ");
		x = in.nextInt();
		System.out.println("Enter value of y ");
		y = in.nextInt();
		z = x / y;
		System.out.println("Sum of two numbers  is "+z);
		in.close();
	}

}
