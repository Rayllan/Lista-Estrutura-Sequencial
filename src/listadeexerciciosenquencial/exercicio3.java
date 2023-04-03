package listadeexerciciosenquencial;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
// Variaveis
    double num0;
    double num1;
    double num2;
// Entrada
    System.out.println("Digite um numero!");
    num0 = teclado.nextDouble();
    System.out.println("Digite outro numero!");
    num1 = teclado.nextDouble();
// Processamento
    num2 = num0 + num1;
// Saida 
    System.out.print("A soma dos numeros é " + num2);
    teclado.close();
    }
}
