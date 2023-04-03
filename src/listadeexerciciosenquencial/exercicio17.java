package listadeexerciciosenquencial;
import java.util.Scanner;
import java.util.Locale;

public class exercicio17 {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner keyboard = new Scanner(System.in);

    double 
    area = 0.0,
    painttin = 18.0,
    gallontin = 3.6,
    tinprice = 80.00,
    gallonprice = 25.00,
    totaltin = 0.0,
    totalgallon = 0.0,
    valorlatastotal = 0.0,
    valorgalaototal = 0.0,
    metrosrestante = 0.0,
    litrosrestantes = 0.0,
    precolata3 = 0.0,
    galoesamais = 0.0,
    precogalao3 = 0.0,
    total3 = 0.0,
    litros = 0.0;

//area
    System.out.println("Quantos m² você deseja pintar? \n");
         area = keyboard.nextDouble();

         totaltin = Math.ceil((area / 6) / painttin);
         totalgallon = Math.ceil((area / 6) / gallontin);
         
// litros
         litros = (area / 6);

     System.out.printf("\nLitros necessário: %.2f%n" , litros);

// latas     
    System.out.println("\nVocê vai gastar " + totaltin + " latas de tinta!");

         valorlatastotal = (totaltin * tinprice);

    System.out.println("Que ficara no valor de R$ " + valorlatastotal);

//galão
    System.out.println("\nVocê vai gastar " + totalgallon + " galões de tinta!");

         valorgalaototal = (totalgallon * gallonprice);

    System.out.println("Que ficara no valor de R$ " + valorgalaototal);

// litros

         metrosrestante = (((totaltin - 1) * 6 * painttin ) - area);

         litrosrestantes = ((metrosrestante / 6) * 1.10);

         precolata3 = ((totaltin - 1) * tinprice);

         galoesamais = (Math.ceil(Math.abs(litrosrestantes/gallontin)));

         precogalao3 = (galoesamais * gallonprice);

         total3 =  (precolata3 + precogalao3);


    if (area == 0 ){
         System.out.println("\nOpção mista: \n" + 0.0 + " Latas e " + 0.0 + " Galões.");
         System.out.println("Que ficara no valor de R$ " + 0.0);

    } else {

        System.out.println("\nOpção mista: \n" + (totaltin - 1) + " Latas e " + galoesamais + " Galões.");
        System.out.println("Que ficara no valor de R$ " + total3);
    }

keyboard.close();

    }
}