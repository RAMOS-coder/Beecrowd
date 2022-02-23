import java.util.Locale;
import java.util.Scanner;

public class Exe_1064 {

	public static void main(String[] args) {
		// Positivos e Média
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cont = 0;
		double x = 0;
		
		for (int i=1; i<=6; i++) {
			double n = sc.nextDouble();
			
			if (n > 0) {
				x += n;
				cont += 1;
			}
		}
		
		double media = x / cont;
		
		System.out.println(cont + " valores positivos");
		System.out.printf("%.1f%n", media);
		
		sc.close();

	}

}
