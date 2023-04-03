package listadeexerciciosenquencial;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
// Variaveis
    double num0;

// Entrada
    System.out.println("Digite um numero!");
    teclado.close();

// Processamento

    num0 = teclado.nextDouble();

// Saida 
    System.out.print("Seu Numero é " + num0);

    }
}
