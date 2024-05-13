import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		System.out.println("Digite um numero inteiro: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		//Criando um condição
		
		
		if(numero % 2 == 0) {
			System.out.println("O numero " + numero + " é PAR" );
		}	
		else {
			System.out.println("O numero " + numero + " é IMPAR");
		}
		sc.close();
	}

}
