package programs;
import java.util.*;

public class PowerOfNumber {

	public static void main(String[] args) {
		int Pow;
		int num;
		int sum=1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number");
		num=s.nextInt();
		System.out.println("Enter a Power");
		Pow=s.nextInt();
		
		for(int i=1;i<=Pow;i++)
		{
			sum=sum*num;
		}
		System.out.println(num+" to the Power of " +Pow+ " is:"+sum);
      s.close();
	}

}
