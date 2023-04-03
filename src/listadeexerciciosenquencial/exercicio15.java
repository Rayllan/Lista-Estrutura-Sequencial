package listadeexerciciosenquencial;
import java.util.Scanner;
import java.util.Locale;

    public class exercicio15{
    public static void main (String [] args){
    
    Locale.setDefault(Locale.US);
    Scanner keyboard = new Scanner(System.in);

    double salariohora,
    horastrabalhadas,
    totalbruto,
    inss,
    sindicato,
    ir,
    salarioliquido;

        System.out.println("Quanto você ganha por hora trabalhada?\n ");
        salariohora = keyboard.nextDouble();

        System.out.println("Quanto você ganha por hora trabalhada?\n ");
        horastrabalhadas = keyboard.nextDouble();

         totalbruto = (salariohora * horastrabalhadas);

         ir = ((totalbruto * 11) / 100);
         inss = ((totalbruto * 8) / 100);
         sindicato = ((totalbruto * 5) / 100);

        salarioliquido = ((ir + inss + sindicato) - totalbruto);

        System.out.println("Salário Bruto : R$ " + totalbruto);
        System.out.println("- IR (11%) : R$ " + ir);
        System.out.println("- INSS (8%) : R$ " + inss);
        System.out.println("- Sindicato ( 5%) : R$ " + sindicato);
        System.out.println("= Salário Liquido : R$ " + Math.abs(salarioliquido));


    keyboard.close();
    }
}