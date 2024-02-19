package programs;
import java.util.*;

public class AreaOfTriangle {

	public static void main(String[] args) {
		int b;
		int h;
	    float area;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value of breadth");
		b=s.nextInt();
		System.out.println("Enter a value of height");
		h=s.nextInt();
		area=(b*h)/2;
		System.out.println("Area of Triangle is:"+area);
        s.close();
	}

}
