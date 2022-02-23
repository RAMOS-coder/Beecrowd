import java.util.Scanner;

public class Exe_1019 {

	public static void main(String[] args) {
		// Conversão de Tempo
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int horas = N / 3600;
		int minutos = (N % 3600) / 60;
		int segundos = (N % 60);
		
		System.out.printf("%d:%d:%d%n", horas, minutos, segundos);
		
		sc.close();

	}

}
