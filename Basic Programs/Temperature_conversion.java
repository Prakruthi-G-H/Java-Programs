package programs;
import java.util.Scanner;

public class Temperature_conversion {

	public static void main(String[] args) {
			float celsius;
			Scanner in = new Scanner(System.in);
			System.out.println("Enter temperatue in Fahrenheit");
			int temperature = in.nextInt();
			celsius= (float)((temperature - 32)*5)/9;
			System.out.println("Temperatue in Celsius = " + celsius);
			System.out.println("Enter temperatue in Celsius");
			celsius = in.nextInt();
			float Fahrenheit =(float)((1.8*celsius) +32);
			System.out.println("Temperatue in Celsius = " + Fahrenheit);
			in.close();
			}

}

