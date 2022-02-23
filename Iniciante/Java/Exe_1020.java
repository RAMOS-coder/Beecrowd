import java.util.Scanner;

public class Exe_1020 {

	public static void main(String[] args) {
		// Idade em Dias
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int rest = x % 365;
		
		int ano = x / 365;
		int mes = rest / 30;
		int dias = rest % 30;
		
		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dias + " dia(s)");

		sc.close();
	}

}
