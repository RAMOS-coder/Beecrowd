import java.util.Locale;
import java.util.Scanner;

public class Exe_1048 {

	public static void main(String[] args) {
		// Aumento de Salário
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double novoSal, reajuste;
		
		if (salario <= 400) {
			reajuste = salario * 0.15;
			novoSal = salario + reajuste;
			
			System.out.printf("Novo salario: %.2f%n", novoSal);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 15 %");
		} 
		else if (salario > 400 && salario < 800) {
			reajuste = salario * 0.12;
			novoSal = salario + reajuste;
			
			System.out.printf("Novo salario: %.2f%n", novoSal);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 12 %");
		}
		else if (salario > 800 && salario <= 1200) {
			reajuste = salario * 0.10;
			novoSal = salario + reajuste;
			
			System.out.printf("Novo salario: %.2f%n", novoSal);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 10 %");
		}
		else if (salario > 1200 && salario <= 2000) {
			reajuste = salario * 0.07;
			novoSal = salario + reajuste;
			
			System.out.printf("Novo salario: %.2f%n", novoSal);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 7 %");
		}
		else {
			reajuste = salario * 0.04;
			novoSal = salario + reajuste;
			
			System.out.printf("Novo salario: %.2f%n", novoSal);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 4 %");
		}
		
		sc.close();

	}

}
