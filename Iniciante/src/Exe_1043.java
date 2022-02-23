import java.util.Locale;
import java.util.Scanner;

public class Exe_1043 {

	public static void main(String[] args) {
		// Triângulo
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float A = sc.nextFloat();
		float B = sc.nextFloat();
		float C = sc.nextFloat();
		
		float nBC = B - C;
		float pBC = B + C;
		float nAC = A - C;
		float pAC = A + C;
		float nAB = A - B;
		float pAB = A + B;
		
		if (nBC<A && A<pBC && nAC<B && B<pAC && nAB<C && C<pAC) {
			float P = A + B + C;
			System.out.printf("Perimetro = %.1f%n", P);
		} else {
			float T = pAB * C / 2;
			System.out.printf("Area = %.1f%n", T);
		}
		
		sc.close();

	}

}
