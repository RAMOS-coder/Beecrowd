import java.util.Scanner;

public class Exe_1073 {

	public static void main(String[] args) {
		// Quadrado de Pares
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int multi;
		
		for (int i=1; i<=N; i++) {
			if (i%2 == 0) {
				multi = (int) Math.pow(i, 2);
				System.out.println(i + "^2 = " + multi);
			}
		}
		
		sc.close();

	}

}
