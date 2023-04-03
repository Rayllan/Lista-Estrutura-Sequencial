package listadeexerciciosenquencial;

import java.util.Scanner;
import java.util.Locale;

    public class exercicio11{

    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner (System.in);

    int numerointeiro1 = 0,
    numerointeiro2 = 0;
    double numeroreal = 0.0,
    resultado1 = 0.0,
    resultado2 = 0.0,
    resultado3 = 0.0;

    System.out.println("Informe um numero inteiro!");
    numerointeiro1 = keyboard.nextInt();

    System.out.println("Informe outro numero inteiro!");
    numerointeiro2 = keyboard.nextInt();

    System.out.println("Informe um numero real!");
    numeroreal = keyboard.nextDouble();

    resultado1 = ((numerointeiro1 * 2) * (numerointeiro2 / 2));
    resultado2 = ((numerointeiro1 * 3) + numeroreal);
    resultado3 = Math.pow(numeroreal,3);

    System.out.println("O Primeiro resultado é: " + resultado1);
    System.out.println("O Segundo resultado é: " + resultado2);
    System.out.println("O Terceiro resultado é: " + resultado3);

    keyboard.close();
    }
}