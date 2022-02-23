import java.util.Locale;
import java.util.Scanner;

public class Exe_1061 {

	public static void main(String[] args) {
		// Tempo de um Evento
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		
		x = sc.next();
		int W1 = sc.nextInt();
		int X1 = sc.nextInt();
		x = sc.next();
		int Y1 = sc.nextInt();
		x = sc.next();
		int Z1 = sc.nextInt();
		x = sc.next();
		int W2 = sc.nextInt();
		int X2 = sc.nextInt();
		x = sc.next();
		int Y2 = sc.nextInt();
		x = sc.next();
		int Z2 = sc.nextInt();
		
		int iniEvent = W1*24*60*60 + X1*60*60 + Y1*60 + Z1;
		int fimEvent = W2*24*60*60 + X2*60*60 + Y2*60 + Z2;
		int duracao = fimEvent - iniEvent;
		
		int W = duracao / (24*60*60);
		int rest = duracao % (24*60*60);
		int X = rest / (60*60);
		rest %= (60*60);
		int Y = rest / 60;
		int Z = rest % 60;
		
		System.out.println(W + " dia(s)");
		System.out.println(X + " hora(s)");
		System.out.println(Y + " minuto(s)");
		System.out.println(Z + " segundo(s)");
		
		sc.close();

	}

}
