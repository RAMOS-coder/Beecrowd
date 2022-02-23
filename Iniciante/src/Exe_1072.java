import java.util.Scanner;

public class Exe_1072 {

	public static void main(String[] args) {
		// Intervalo 2
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X, contD = 0, contF = 0;
		
		for (int i=1; i<=N; i++) {
			X = sc.nextInt();
			
			if (X>=10 && X<=20) {
				contD += 1;
			}
			else {
				contF += 1;
			}
		}
		
		System.out.println(contD + " in");
		System.out.println(contF + " out");
		
		sc.close();

	}

}
