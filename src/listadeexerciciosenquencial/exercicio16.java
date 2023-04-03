package listadeexerciciosenquencial;
import java.util.Scanner;
import java.util.Locale;

public class exercicio16 {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner keyboard = new Scanner(System.in);

    double 
    area = 0.0,
    painttin = 18.0,
    tinprice = 80.00,
    metersliter = 6,
    totaltin = 0.0,
    valorlatastotal = 0.0;



    System.out.println("Quantos metros quadrados você deseja pintar? \n");
         area = keyboard.nextDouble();

         totaltin = Math.ceil((area / metersliter) / painttin);
               
     
    System.out.println("Você vai gastar " + totaltin + " latas de tinta! \n");

         valorlatastotal = (totaltin * tinprice);

    System.out.println("Que ficara no valor de R$ " + valorlatastotal);


    

keyboard.close();

    }
}