import java.util.Locale;
import java.util.Scanner;

public class Exe_1094 {

	public static void main(String[] args) {
		// Experiências
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int Quantia, totCobaia = 0, totCoelho = 0, totRato = 0, totSapo = 0;
		double perCoelho, perRato, perSapo;
		char Tipo;
		
		int N = sc.nextInt();
		
		
		for (int i=1; i<=N; i++ ) {
			Quantia = sc.nextInt();
			Tipo = sc.next().charAt(0);
			
			totCobaia += Quantia;
			
			if (Tipo == 'C') {
				totCoelho += Quantia;
			}
			else if (Tipo == 'R') {
				totRato += Quantia;
			}
			else {
				totSapo += Quantia;
			}
		}
		
		perCoelho = (double) totCoelho * 100.0 / totCobaia;
		perRato = (double) totRato * 100.0 / totCobaia;
		perSapo = (double) totSapo * 100.0 / totCobaia;
		
		System.out.printf("Total: %d cobaias%n", totCobaia);
		System.out.printf("Total de coelhos: %d%n", totCoelho);
		System.out.printf("Total de ratos: %d%n", totRato);
		System.out.printf("Total de sapos: %d%n", totSapo);
		System.out.printf("Percentual de coelhos: %.2f %%%n", perCoelho);
		System.out.printf("Percentual de ratos: %.2f %%%n", perRato);
		System.out.printf("Percentual de sapos: %.2f %%%n", perSapo);
		
		sc.close();
	}

}
