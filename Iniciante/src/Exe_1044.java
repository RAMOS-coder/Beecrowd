import java.util.Scanner;

public class Exe_1044 {

	public static void main(String[] args) {
		// Multiplos
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A%B == 0 || B%A == 0) {
			System.out.println("S�o Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();

	}

}
