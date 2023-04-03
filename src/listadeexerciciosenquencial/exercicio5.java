package listadeexerciciosenquencial;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
// Variaveis
    double metros;
    double cm;
// Entrada
    System.out.println("Informe quantos metros você quer converter!");
    metros = teclado.nextDouble();
    cm = metros * 100;
    teclado.close();
// Saida 
    System.out.print("a conversão dos metrós é de 1" + cm + " cm.");
    
    }
}
