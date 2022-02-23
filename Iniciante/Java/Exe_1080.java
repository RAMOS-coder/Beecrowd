import java.util.Scanner;

public class Exe_1080 {

	public static void main(String[] args) {
		// Maior e Posição
		
		Scanner sc = new Scanner(System.in);
		
		int N, cont = 0, X = 0;
		
		for (int i=1; i<=100; i++) {
			N = sc.nextInt();
			
			if (N > X) {
				X = N;
				cont = i;
			}
		}
		
		System.out.println(X);
		System.out.println(cont);

	}

}
