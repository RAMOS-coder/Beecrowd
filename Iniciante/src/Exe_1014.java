import java.util.Locale;
import java.util.Scanner;

public class Exe_1014 {

	public static void main(String[] args) {
		// Consumo
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		double Y = sc.nextDouble();
		
		double totalGasto = (double) X / Y;
		
		System.out.printf("%.3f km/l%n", totalGasto);
		
		sc.close();
	}

}
