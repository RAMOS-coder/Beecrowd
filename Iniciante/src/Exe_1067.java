import java.util.Scanner;

public class Exe_1067 {

	public static void main(String[] args) {
		// Números Ímpares
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			if (i%2 == 1) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
