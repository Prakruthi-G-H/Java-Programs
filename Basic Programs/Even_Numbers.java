package programs;
import java.util.Scanner;

public class Even_Numbers {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number Of terms");
		n=sc.nextInt();
       for(int i=1;i<=n;i++)
       {
    	   if(i%2==0)
    	   {
    		   System.out.print(i+" ");
    	   }
       }
       sc.close();
	}

}
