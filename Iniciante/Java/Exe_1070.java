import java.util.Scanner;

public class Exe_1070 {

	public static void main(String[] args) {
		// Seis N�meros �mpares
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = n + 11;
		
		for (int i=n; i<=x; i++) {
			if (i%2 == 1 ) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
