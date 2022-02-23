import java.util.Locale;
import java.util.Scanner;

public class Exe_1009 {

	public static void main(String[] args) {
		// Salário com Bônus
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next();
		double salFixo = sc.nextDouble();
		double totalVendas = sc.nextDouble();
		
		double salBonus = totalVendas * 0.15 + salFixo;
		
		System.out.printf("TOTAL = R$ %.2f%n", salBonus);
		
		sc.close();

	}

}
