package programs;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
	int n;
	int fact=1;
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the numbers");
    n=sc.nextInt();
    
    for(int i=1;i<=n;i++) {
    	fact=fact*i;
    }
    sc.close();
    System.out.println("Factorial of "+n+" is "+fact);
	}
  
}
