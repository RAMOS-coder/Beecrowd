import java.util.Arrays;
import java.util.Scanner;

public class Exe_1042 {

	public static void main(String[] args) {
		// Sort Simples
		
		Scanner sc = new Scanner(System.in);
		
		int vet[] = new int [3];
		int vetAux [] = new int [3];
		
		for (int i=0; i<vet.length; i++) {
			vet[i] = sc.nextInt();
			vetAux[i] = vet[i];
		}
		
		for (int i=0; i<vet.length; i++) {
			Arrays.sort(vet);
			System.out.println(vet[i]);
		}
		
		System.out.println("");
		
		for (int i=0; i<vetAux.length; i++) {
			System.out.println(vetAux[i]);
		}
		
		sc.close();
		
	}
}
