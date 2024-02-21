package programs;

import java.util.Scanner;

public class Divisibility {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Dividend number to check divisibility");
		 int n=s.nextInt();
		 System.out.println("Enter any Divisor number ");
		 int c=s.nextInt();
		 if(n%c==0)
		 {
           System.out.println(n+" is divisible by "+c);
		 }
		 else
		 {
		 System.out.println(n+" is not divisible by "+c);
		 }
       s.close();
	}

}
