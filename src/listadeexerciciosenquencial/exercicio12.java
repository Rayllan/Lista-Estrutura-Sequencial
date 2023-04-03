package listadeexerciciosenquencial;
    import java.util.Scanner;
    import java.util.Locale;

public class exercicio12{

    public static void main(String[]args ){
        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);

    double height,
    weight;

        System.out.println("Qual é a sua altura?");
         height = keyboard.nextDouble();

            weight = (72.7*height) - 58;

        System.out.println("Seu peso ideal é de " + weight + "kg");
keyboard.close();
    }

}