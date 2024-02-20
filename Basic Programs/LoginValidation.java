package programs;


public class LoginValidation {

	public static void main(String[] args) {
		String id = "Admin";
		int password=2158235;
		if (id=="Admin") {
			System.out.println("User id is Valid");
			if (password==21569445) {
				System.out.println("User Password is Valid");
				System.out.println("Login Successfull...");
			} else {
            System.out.println("User Password is Invalid");
            System.out.println("Login Unsuccessfulll");
			}
		} else {
          System.out.println("User id is Invalid");
		}
         
	}

}
