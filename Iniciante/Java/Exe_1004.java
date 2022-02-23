import java.util.Scanner;

public class Exe_1004 {

	public static void main(String[] args) {
		// Produto Simples
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		int PROD = X * Y;
		
		System.out.printf("PROD = %d%n", PROD);
		
		sc.close();

	}

}
