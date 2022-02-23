import java.util.Locale;
import java.util.Scanner;

public class Exe_1011 {

	public static void main(String[] args) {
		// Esfera
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int R = sc.nextInt();
		
		double vol = (4.0/3.0) * 3.14159 * Math.pow(R, 3);
		
		System.out.printf("VOLUME = %.3f%n", vol);
		
		sc.close();

	}

}
