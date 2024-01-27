package programs;
import java.util.*;

public class Natural_Numbers {

	public static void main(String[] args) {
    int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of terms");
     n=sc.nextInt();
     for(int i=1;i<=n;i++)
     {
    	 System.out.print(i+" ");
     }
     sc.close();
     }

}
