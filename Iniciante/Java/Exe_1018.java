import java.util.Scanner;

public class Exe_1018 {

	public static void main(String[] args) {
		// Cédulas
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		System.out.println(N);
		
		int resto = N;
		int nota = 100;
		
		for (int i=1; i<=7; i++) {
			int qtd = resto / nota;
			System.out.printf("%d nota(s) de R$ %d,00%n", qtd, nota);
			resto %= nota;
			
			nota /= 2;
			
			if (i == 2) {
				nota -= 5;
			}
			}
		
		sc.close();
		
	}

}
