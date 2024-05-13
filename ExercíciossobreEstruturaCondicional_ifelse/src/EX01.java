import java.util.Scanner;


public class EX01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite Um Numero: ");
		
		int N = sc.nextInt();
	    
		if (N < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("POSITIVO");
		}

		sc.close();
	}
}