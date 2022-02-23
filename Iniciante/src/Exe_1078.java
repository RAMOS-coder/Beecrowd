import java.util.Scanner;

public class Exe_1078 {

	public static void main(String[] args) {
		// Tabuada
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i=1; i<=10; i++) {
			int mult = i * N;
			System.out.println(i + " x " + N + " = " + mult);
		}
		
		sc.close();

	}

}
