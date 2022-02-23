import java.util.Locale;
import java.util.Scanner;

public class Exe_1017 {

	public static void main(String[] args) {
		// Gasto de Combustível
		Scanner sc = new Scanner(System.in);
		
		int horas = sc.nextInt();
		int kmH = sc.nextInt();
		
		double litros = horas * kmH / 12.00;
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f%n", litros);
		
		sc.close();
	}

}
