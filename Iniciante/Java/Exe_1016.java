import java.util.Scanner;

public class Exe_1016 {

	public static void main(String[] args) {
		// Distância
		Scanner sc = new Scanner(System.in);
		
		int X = 60;
		int Y = 90;
		int H = 60;
		
		int km = sc.nextInt();
		
		int dist = H / (Y - X) * km;
		
		System.out.println(dist + " minutos");
		
		sc.close();
	}

}
