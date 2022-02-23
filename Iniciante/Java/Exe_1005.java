import java.util.Locale;
import java.util.Scanner;

public class Exe_1005 {

	public static void main(String[] args) {
		// Média 1
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		
		double MEDIA = (A * 3.5 + B * 7.5) / (3.5 + 7.5);
		
		System.out.printf("MEDIA = %.5f%n", MEDIA);
		
		sc.close();

	}

}
