package programs;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		int number;
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter a Number");
	    number=s.nextInt();
       if (number>0) {
		System.out.println("Given number is a positive");
	} else {
      System.out.println("Given number is a Negative");
	}
       s.close();
	}

}
