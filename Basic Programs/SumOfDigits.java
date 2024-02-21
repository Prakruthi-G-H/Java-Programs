package programs;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		int r,sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		 int n=s.nextInt();
		 while(n>0)
		 {
			 r=n%10;
			 sum=sum+r;
			 n=n/10;
		 }
		 System.out.println("Sum of Digits is "+sum);
		 s.close();
	}

}
