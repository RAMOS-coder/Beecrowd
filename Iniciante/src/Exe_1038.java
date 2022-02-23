import java.util.Locale;
import java.util.Scanner;

public class Exe_1038 {

	public static void main(String[] args) {
		// Lanche
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double [] preco = new double [5];
		double val = 3.50;
		
		for (int i=0; i<=4; i++) {
			preco [i] = val + 0.50;
			
			if (i == 3) {
				preco [i] = val - 3.00;
			}
			if (i == 4) {
				preco [i] = val - 0.50;
			}
			
			val = preco[i];
		}
		
		int codEnt = sc.nextInt();
		int quant = sc.nextInt();
		
		double tot = preco [codEnt-1] * quant;
		
		System.out.printf("Total: R$ %.2f%n", tot);
		
		sc.close();

	}

}
