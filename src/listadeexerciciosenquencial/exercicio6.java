package listadeexerciciosenquencial;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
// Variaveis
    int raio;
    float area;
// Entrada
    System.out.println("Digite o raio!");
    raio = teclado.nextInt();
// Processamento
    area = (float) (Math.PI * raio * raio);
// Saida 
    System.out.print("A área do circulo é de " + area);
    teclado.close();
    }    
}
