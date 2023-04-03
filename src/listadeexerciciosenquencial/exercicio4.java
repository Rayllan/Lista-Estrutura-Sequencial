package listadeexerciciosenquencial;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
// Variaveis
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double media;
// Entrada
    System.out.println("Digite sua primeira nota!");
    nota1 = teclado.nextDouble();
    System.out.println("Digite sua segunda nota!");
    nota2 = teclado.nextDouble();
    System.out.println("digite sua terceira nota!");
    nota3 = teclado.nextDouble();
    System.out.println("Digite sua quarta nota!");
    nota4 = teclado.nextDouble();
    teclado.close();
// Processamento
    media = (nota1 + nota2 + nota3 + nota4) / 4;
// Saida 
    System.out.print("Sua media é " + media);

    }
}
