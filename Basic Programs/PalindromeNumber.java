package programs;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
      System.out.println("Enter a Number");
      int num=s.nextInt();
      int c=num;
      int rev=0;
      while(num!=0)
      {
    	rev=rev*10+num%10;
    	num=num/10;
      }
      System.out.println(rev);
      
      if(c==rev)
      {
    	  System.out.println("Palindrome");
      }
      else
      {
    	  System.out.println("Not Palindrome");
      }
      s.close();
	}

}
