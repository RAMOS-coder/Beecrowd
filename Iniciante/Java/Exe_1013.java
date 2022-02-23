import java.util.Scanner;

public class Exe_1013 {

	public static void main(String[] args) {
		// O Maior
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int s = sc.nextInt();
		
		int MaiorAB = (a + b + (a * b * s * (a - b))) / 2;
		
		if (a < b && b > s) {
			System.out.println(b + " eh o maior");
		} else if (s > b && a < s) {
			System.out.println(s + " eh o maior");
		} else {
			System.out.println(a + " eh o maior");
		}
		
		sc.close();
		
	}

}
