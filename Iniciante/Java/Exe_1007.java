import java.util.Scanner;

public class Exe_1007 {

	public static void main(String[] args) {
		// Diferen�a
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int DIFERENCA = A * B - C * D;
		
		System.out.printf("DIFERENCA = %d%n", DIFERENCA);
		
		sc.close();

	}

}
