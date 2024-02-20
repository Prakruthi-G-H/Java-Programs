package programs;

import java.util.Scanner;

public class AverageofNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count=1;
		float x,sum=0,avg;
	      System.out.println("Enter a Total Number");
	      int num=s.nextInt();
	      while(count<=num)
	      {
	    	  System.out.println("Enter the "+ count+" number");
	    	 x=s.nextInt();
	    	  sum=sum+x;
	    	  ++count;
	      }
	      avg=sum/num;
       System.out.println("Average is:"+avg);
       s.close();
	}

}
