import java.util.Locale;
import java.util.Scanner;

public class Exe_1021 {

	public static void main(String[] args) {
		// Notas e Moedas
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double N = sc.nextDouble();
		double rest = N;
		int nota = 100;
		double moeda = 1.00;
		
		System.out.println("NOTAS:");
		
		for (int i=1; i<=6; i++) {
			int qtd = (int) rest / nota;
			
			System.out.printf("%d nota(s) de R$ %d.00%n", qtd, nota);
			rest %= nota;
			nota /= 2;
			
			if (i == 2) {
				nota -= 5;
			}
			if (i == 6) {
				System.out.println("MOEDAS:");
				rest *= 100;
				nota = 100;
				
				for (i=1; i<=6; i++) {
					qtd = (int) rest / nota;
					System.out.printf("%d moeda(s) de R$ %.2f%n", qtd, moeda);
					rest %= nota;
					moeda /= 2;
					nota /= 2;
					
					if (i == 3) {
						moeda -= 0.025;
						nota -= 2;
					}
					if (i == 5) {
						moeda -= 0.015;
						nota -= 1;
					}
				}
			}
		}
		
		sc.close();

	}

}
