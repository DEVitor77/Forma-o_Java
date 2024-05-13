import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("DIGITE UM NUMERO: ");

        int numero = sc.nextInt();

        System.out.println("Seu numero é: ");
        if (numero > 0) {
            System.out.println("NUMERO POSITIVO");

        } else {
            System.out.println("NUMERO NEGATIVO");
        }

        sc.close();
    }
}
