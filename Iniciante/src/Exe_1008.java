import java.util.Locale;
import java.util.Scanner;

public class Exe_1008 {

	public static void main(String[] args) {
		// Salário
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numFuncionario = sc.nextInt();
		int numHoras = sc.nextInt();
		double valorHora = sc.nextDouble();
		
		double salario = (double) numHoras * valorHora;
		
		System.out.printf("NUMBER = %d%n", numFuncionario);
		System.out.printf("SALARY = U$%.2f%n", salario);
		
		sc.close();
		
	}

}
