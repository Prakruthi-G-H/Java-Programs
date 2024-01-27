package programs;

import java.util.Scanner;

public class ReverseEvenNumber {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number Of terms");
		n=sc.nextInt();
       for(int i=n;i>0;i--)
       {
    	   if(i%2==0)
    	   {
    		   System.out.print(i+" ");
    	   }
       }
       sc.close();

	}

}
