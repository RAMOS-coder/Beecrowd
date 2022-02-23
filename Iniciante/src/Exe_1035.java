import java.util.Scanner;

public class Exe_1035 {

	public static void main(String[] args) {
		// Teste de Seleção 1
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int CD = C + D;
		int AB = A + B;
		int par = A % 2;
		
		if ( B > C && D > A && CD > AB && C > 0 && D > 0 && par == 0) {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores nao aceitos");
		}
		
		sc.close();

	}

}
