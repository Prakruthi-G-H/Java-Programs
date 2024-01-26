package programs;
import java.util.*;

public class EvenOrOdd {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	
	while(true) {
	System.out.println("Enter a number to check  Even or Odd");
	int num=sc.nextInt();
	if(num%2==0) {
		System.out.println(num+" is Even Number");
	}
	else
	{
		System.out.println(num+" is Odd Number");
	}
	   sc.close();
	}
}
}