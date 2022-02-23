import java.util.Scanner;

public class Exe_1066 {

	public static void main(String[] args) {
		// Pares, Ímpares, Positivos e Negativos
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		int contPar = 0;
		int contImp = 0;
		int contPos = 0;
		int contNeg = 0;
		
		for (int i=1; i<=5; i++) {
			n = sc.nextInt();
			
			if (n > 0) {
				contPos += 1;
				
				if (n%2 == 0) {
					contPar += 1;
				}
				else {
					contImp += 1;
				}
			} else {
				if (n < 0) {
					contNeg += 1;
				}
				if (n%2 == 0) {
					contPar += 1;
				}
				else {
					contImp += 1;
				}
			}
		}
		
		System.out.println(contPar + " valor(es) par(es)");
		System.out.println(contImp + " valor(es) impar(es)");
		System.out.println(contPos + " valor(es) positivo(s)");
		System.out.println(contNeg + " valor(es) negativo(s)");
		
		sc.close();

	}

}
