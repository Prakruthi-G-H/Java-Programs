package programs;

import java.util.Scanner;

public class RverseNaturalNumber {

	public static void main(String[] args) {
		 int n;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of terms");
		     n=sc.nextInt();
		     for(int i=n;i>=1;i--)
		     {
		    	 System.out.print(i+" ");
		     }
		     sc.close();

	}

}
