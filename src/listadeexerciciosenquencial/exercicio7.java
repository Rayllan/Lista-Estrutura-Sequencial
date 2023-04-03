package listadeexerciciosenquencial;
import java.util.Scanner;
import java.util.Locale;

public class exercicio7 {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner keyboard = new Scanner(System.in);

// Variaveis
    float base,
    height,
    area,
    result;

// Entrada

    System.out.println("Digite a altura!");
    height = keyboard.nextFloat();
    System.out.println("Digite a Base!");
    base = keyboard.nextFloat();

// Processamento

    area = base * height;
    result = (area * 2);
// Saida 
    System.out.println("o resultado da Area é " + area);
    System.out.println("o resuldado do dobro da Area é " + result);
    keyboard.close();
    }   
}
