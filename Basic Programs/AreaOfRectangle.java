package programs;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		int length;
		int breadth;
	    int area;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value of length of Rectangle");
		length=s.nextInt();
		System.out.println("Enter a value of breadth of Rectangle");
		breadth=s.nextInt();
		area=length*breadth;
		System.out.println("Area of Reactangle is:"+area);
        s.close();

	}

}
