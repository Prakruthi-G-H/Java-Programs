package programs;

import java.util.Scanner;

public class ASCIIValues {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	      System.out.println("Enter a any character");
	      char c=s.next().charAt(0);
	      int a=c;
	      System.out.println("ASCII Values of "+ c + "is :"+a);
            s.close();
	}

}
