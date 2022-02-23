import java.util.Scanner;

public class Exe_1047 {

	public static void main(String[] args) {
		// Tempo de Jogo com Minutos
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicial = sc.nextInt();
		int minInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int minFinal = sc.nextInt();
		
		int instInicial = horaInicial * 60 + minInicial;
		int instFinal = horaFinal * 60 + minFinal;
		
		int duracao;
		
		if (instInicial < instFinal) {
			duracao = instFinal - instInicial;
		} else {
			duracao = (24 * 60 - instInicial) + instFinal;
		}
		
		int duracaoHoras =  duracao / 60;
		int duracaoMin = duracao % 60;
		
		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", duracaoHoras, duracaoMin);
		
		sc.close();

	}

}
