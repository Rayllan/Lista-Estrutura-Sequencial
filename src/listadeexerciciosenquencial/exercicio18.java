package listadeexerciciosenquencial;
import java.util.Scanner;
import java.util.Locale;

public class exercicio18 {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner keyboard = new Scanner(System.in);

    double tamanhoarquivo = 0.0,
    velocidadeinternet = 0.0,
    tempodedownloadsegundos = 0.0;
  

    System.out.println("Qual o tamanho do arquivo em MB? \n");
    tamanhoarquivo = keyboard.nextDouble();

               
    System.out.println("Qual é a velocidade da sua Internet em Mbps? \n");

    velocidadeinternet = keyboard.nextDouble();


    tempodedownloadsegundos = ((tamanhoarquivo / velocidadeinternet)/60);

    System.out.printf("Seu Dowloand ficara pronto em %.2f%n" , tempodedownloadsegundos );

keyboard.close();

    }
}