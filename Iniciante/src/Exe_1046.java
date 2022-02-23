import java.util.Scanner;

public class Exe_1046 {

	public static void main(String[] args) {
		// Tempo de Jogo
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		int duracao;
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);
		
		sc.close();

	}

}
