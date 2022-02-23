import java.util.Locale;
import java.util.Scanner;

public class Exe_1012 {

	public static void main(String[] args) {
		// Área
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double areaTriang = A * C / 2.0;
		double areaCirculo = Math.pow(C,  2) * 3.14159;
		double areaTrapezio = (A + B) / 2 * C;
		double areaQuad = Math.pow(B, 2);
		double areaRetang = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", areaTriang);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuad);
		System.out.printf("RETANGULO: %.3f%n", areaRetang);
		
		sc.close();

	}

}
