import java.util.Locale;

public class Main {

	public static void main(String[] args) {
			
		int 	y 		= 32;
		double 	x 		= 10.6546846;
		String 	nome 	= "Valter Vitor";
		int 	idade 	= 56;
		double 	renda	= 9500.0;
		
 		System.out.println(y);
		System.out.printf("%.2f%n",x);
		System.out.printf("%.4f%n",x);
		System.out.println("Bom dia!");
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n",x);
		System.out.printf("%.4f%n",x);
		System.out.printf("MANO AS COISAS SÃO ASSIM =  %.2f%n ENTENDEU AGORA?%n",x);
		System.out.printf("%s TEM %d ANOS DE IDADE E GANHA R$ %.2f REAIS.%n", nome, idade, renda);
	}

}

