package programs;
import java.util.*;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("Enter a number");
		int n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		
		if(sum==n)
		{
			System.out.println(n+" is Perfect Number");
		}
		else
		{
			System.out.println(n+ " is not a Perfect number");
		}
		sc.close();
	}

}
