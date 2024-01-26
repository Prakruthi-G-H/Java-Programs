package programs;
import java.util.*;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		int x,y,z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of First Number");
		x=sc.nextInt();
		System.out.println("Enter value of Second Number");
		y=sc.nextInt();
		System.out.println("Enter value of Third Number");
		z=sc.nextInt();
		
		if(x>y && x>z)
		{
			System.out.println("First Number is Largest");
		}
		else if(y>x && y>z)
		{
			System.out.println("Second Number is Largest");
		}
		else
		{
			System.out.println("Third Number is Largest");
		}
        sc.close();
	}

}
