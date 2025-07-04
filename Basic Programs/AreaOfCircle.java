package programs;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		int radius;
		float area;
		final float PI=3.14f;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Radius of the CIrcle");
		radius=s.nextInt();
		
		area=PI*radius*radius;
		System.out.println("Area Of Circle is "+area);
       s.close();

	}

}
