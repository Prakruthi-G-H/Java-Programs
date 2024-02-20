package programs;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		int count=0;
		Scanner s = new Scanner(System.in);
	      System.out.println("Enter a any Number");
	      int n=s.nextInt();
	      while(n>0)
	      {
	    	  n=n/10;
	    	  count ++;
	      }
	System.out.println("Number of Digits is :"+count);
	s.close();
	}

}
