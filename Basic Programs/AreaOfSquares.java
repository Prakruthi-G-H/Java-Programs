package programs;

import java.util.Scanner;

public class AreaOfSquares {

	public static void main(String[] args) {
		int side;
	    int area;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value of side of Square");
		side=s.nextInt();
		area=side*side;
		System.out.println("Area of Square is: "+area);
        s.close();
	}

}
