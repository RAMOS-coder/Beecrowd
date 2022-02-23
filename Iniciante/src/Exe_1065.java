import java.util.Scanner;

public class Exe_1065 {

	public static void main(String[] args) {
		// Pares entre Cinco Números
		
		Scanner sc = new Scanner(System.in);
		
		int cont = 0;
		int n;
		
		for (int i=1; i<=5; i++) {
			n = sc.nextInt();
			
			if (n%2 == 0) {
				cont += 1;
			}
		}
		
		System.out.println(cont + " valores pares");
		
		sc.close();

	}

}
