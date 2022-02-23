import java.util.Scanner;

public class Exe_1071 {

	public static void main(String[] args) {
		// Soma de Impares Consecutivos I
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int soma = 0;
		
		if (X < Y) {
			X += 1;
			for (int i=X; i<Y; i++) {
				if (i%2 == 1 || i%2 == -1) {
					soma += i;
				}
			}
		}
		else {
			Y += 1;
			for (int i=Y; i<X; i++) {
				if (i%2 == 1 || i%2 == -1) {
					soma += i;
				}
			}
		}
		
		System.out.println(soma);
		
		sc.close();

	}

}
