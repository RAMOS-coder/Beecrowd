import java.util.Scanner;

public class Exe_1074 {

	public static void main(String[] args) {
		// Par ou Ímpar
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i=1; i<=N; i++) {
			int X = sc.nextInt();
			
			if (X > 0 && X%2 == 0) {	
				System.out.println("EVEN POSITIVE");
			}
			else if(X > 0 && X%2 != 0) {
				System.out.println("ODD POSITIVE");
			}
			else if (X == 0) {
				System.out.println("NULL");
			}
			else if (X%2 == 0 && X < 0) {
					System.out.println("EVEN NEGATIVE");
			}
			else {
				System.out.println("ODD NEGATIVE");
			}
		}
		
		sc.close();

	}

}
