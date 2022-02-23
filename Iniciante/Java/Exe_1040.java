import java.util.Locale;
import java.util.Scanner;

public class Exe_1040 {

	public static void main(String[] args) {
		// Média 3
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float N1 = sc.nextFloat();
		float N2 = sc.nextFloat();
		float N3 = sc.nextFloat();
		float N4 = sc.nextFloat();
		
		float media = (N1 * 2f + N2 * 3f + N3 * 4f + N4 * 1f) / (2f + 3f + 4f + 1f);
		
		System.out.printf("Media: %.1f%n", media);
		
		if (media >= 7f) {
			System.out.println("Aluno aprovado.");
		} else if (media < 5f) {
			System.out.println("Aluno reprovado.");
		} else {
			System.out.println("Aluno em exame.");
			float N5 = sc.nextFloat();
			System.out.printf("Nota do exame: %.1f%n", N5);
			
			float mediaFinal = (media + N5) / 2;
			
			if (media >= 5f) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f%n", mediaFinal);
		}
		
		sc.close();
	}

}
