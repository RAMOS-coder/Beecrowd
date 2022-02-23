import java.util.Locale;
import java.util.Scanner;

public class Exe_1079 {

	public static void main(String[] args) {
		// Médias Ponderadas
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		int N = sc.nextInt();
		float media, x, y, z;
		
		for (int i=1; i<=N; i++) {
			x = sc.nextFloat();
			y = sc.nextFloat();
			z = sc.nextFloat();
			
			media = (x*2f + y*3f + z*5f) / (2+3+5);
			
			System.out.printf("%.1f%n", media);
		}
		
		sc.close();

	}

}
