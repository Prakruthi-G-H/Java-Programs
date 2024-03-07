package pattern;

public class Pattern13 {

	public static void main(String[] args) {
		int n=5;
		for (int i = 1; i <=n; i++) {
			for (int j = 0; j < n; j++) {
				int num=(i+j)%2;
				System.out.print(num+" ");
			}
			System.out.println();
		}

	}

}
