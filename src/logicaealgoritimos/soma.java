package logicaealgoritimos;
import java.util.Scanner;
import java.util.Locale;


    public class soma {
    public static void main (String[] agrs ){
        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);


        double num1,
        num2,
        soma;


    System.out.println("Digite um numero: \n");
         num1 = keyboard.nextDouble();
    System.out.println("Digite outro numero: \n");
         num2 = keyboard.nextDouble();

         soma = (num1 + num2);

    System.out.println("A soma entre "+ num1 + "e " + num2 + " é igual a " + soma);

    keyboard.close();

    }
}
