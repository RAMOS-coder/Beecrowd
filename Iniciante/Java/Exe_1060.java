import java.util.Locale;
import java.util.Scanner;

public class Exe_1060 {

	public static void main(String[] args) {
		// Números Positivos
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cont = 0;
		
		for (int i=1; i<=6; i++) {
			double n = sc.nextDouble();
			
			if (n > 0) {
				cont += 1;
			}
		}
		
		System.out.println(cont + " valores positivos");
		
		sc.close();

	}

}
