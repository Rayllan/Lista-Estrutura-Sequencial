package listadeexerciciosenquencial;
import java.util.Scanner;
import java.util.Locale;

    public class exercicio8{
    public static void main (String [] args){
    
    Locale.setDefault(Locale.US);
    Scanner keyboard = new Scanner(System.in);
    
    double WageHours;
    double HoursMoth;
    double Wage;

    System.out.println("Informe quanto você ganha por hora trabalhada!");
    WageHours = keyboard.nextDouble();
    System.out.println("Informe quantas horas você trabalha por mês!");
    HoursMoth = keyboard.nextDouble();

    Wage = WageHours * HoursMoth;

    System.out.println("O seu Salario será de R$ " + Wage + ".");

    keyboard.close();

    }

}
