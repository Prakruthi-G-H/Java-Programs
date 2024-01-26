package programs;
import java.util.Scanner;

//Swapping two numbers without using third variable by user defined input
public class swapping {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a= s.nextInt();
		System.out.println("Enter value of b");
		int b =s.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping");
		System.out.println("a is :" +a);
		System.out.println("b is :"+b);
		
		
	}
}


//Swapping inside main method with using third variable
/*public class swapping {
		
	public static void main(String[] args) {
		int a=10;
		int b =20;
		int temp;
		temp = a;
		a=b;
		b=temp;
		System.out.println("a is :" +a);
		System.out.println("b is :"+b);
		
		
	}
}
*/

//Swapping two numbers without using third variable in main method
/*public class swapping {
	
	public static void main(String[] args) {
		int a=10;
		int b =20;
		 a=a+b;
		 b=a-b;
		 a=a-b;
		System.out.println("a is :" +a);
		System.out.println("b is :"+b);
		
		
	}
}*/


//Swapping using method and third variable
/*public class swapping {
	int a=10;
	int b =20;
	int temp;
	public void swap() {
		temp = a;
		a=b;
		b=temp;
		System.out.println("a is :" +a);
		System.out.println("b is :"+b);

	}
	public static void main(String[] args) {
		swapping s = new swapping();
		s.swap();
		
		
	}

}*/

//Swapping using third variable by user defined input
/*public class swapping {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a= s.nextInt();
		System.out.println("Enter value of b");
		int b =s.nextInt();
		int temp;
		temp = a;
		a=b;
		b=temp;
		System.out.println("After Swapping");
		System.out.println("a is :" +a);
		System.out.println("b is :"+b);
		
		
	}
}*/








