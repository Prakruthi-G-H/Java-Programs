package programs;
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = sc.nextInt();
	int a=10;
	for(int i=1;i<=a;i++)
	{
		int c=n*i;
		System.out.println(n+"*"+i+"="+c);
	}
    sc.close();  
	}

}
