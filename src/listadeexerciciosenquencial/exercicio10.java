package listadeexerciciosenquencial;
import java.util.Scanner;
import java.util.Locale;

public class exercicio10{

    public static void main (String[] args) {
    Locale.setDefault(Locale.US);
    Scanner keyboard = new Scanner (System.in);

    double Celsius = 0.0, 
    Fahrenheit = 0.0;
    String nome = "Calculada";

    System.out.println("Informe qual a temperatura em Celsius!");
    Celsius = keyboard.nextDouble();

    Fahrenheit = ((Celsius * 1.8) + 32);

    System.out.printf("A temperatura é de: %.2f %s%n",  Fahrenheit, nome);

    keyboard.close();
    }
}