import java.util.Locale;
import java.util.Scanner;

public class Exe_1010 {

	public static void main(String[] args) {
		// Cálculo Simples
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int [] codPecas = new int[2];
		int [] quant = new int[2];
		double [] preco = new double [2];

		for (int i=0; i<=1; i++) {
			codPecas[i] = sc.nextInt();
			quant[i] = sc.nextInt();
			preco[i] = sc.nextDouble();
		}
		
		double valorTot = quant[0] * preco[0] + quant[1] * preco[1];
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTot);
		
		sc.close();
		
	}

}
