package programs;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	      System.out.println("Enter a any character");
	      char c=s.next().charAt(0);
	      if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || 
	    		  c=='A' || c=='E' || c=='I' || c=='O' || c=='U') 
	      {
			System.out.println("Vowels");
		  } 
	      else 
	      {
            System.out.println("Consonant");
		  }
 s.close();
	}

}
