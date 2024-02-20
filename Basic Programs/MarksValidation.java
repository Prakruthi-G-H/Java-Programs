package programs;

import java.util.Scanner;

public class MarksValidation {

	public static void main(String[] args) {
		int marks;
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter a Marks");
	    marks=s.nextInt();
	    if (marks>80 && marks<=100) {
        System.out.println("Congratulations! Pass And Distinction");			
		} 
	    else if (marks>=35 && marks<=80) {
        		System.out.println("Congratulations! Pass And First Class");	
		}
	    else if (marks>0 && marks<35) {
			System.out.println("Fail");
		}
	    else {
          System.out.println("Invalid Marks");
		}
	    s.close();
	}

}
