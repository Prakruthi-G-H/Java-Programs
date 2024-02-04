package programs;
import java.util.*;

public class LargestOfTwoNumbers {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Value of A");
	int a=sc.nextInt();
	System.out.println("Enter Value of B");
	int b=sc.nextInt();
	System.out.println();
	if(a>b)
	{
		System.out.println("A is Larger");
	}
	else
	{
		System.out.println("B is Larger");
	}
	
    sc.close();
	
}
}