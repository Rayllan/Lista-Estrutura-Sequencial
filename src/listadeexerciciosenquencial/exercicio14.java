package listadeexerciciosenquencial;
    import java.util.Scanner;
    import java.util.Locale;

public class exercicio14 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);

        double weight,
        excess,
        ticket = 4.00,
        weightlimit = 50.0,
        valueticket;

            System.out.println("informe quantos Kg o peixe tem:\n" );
                weight = keyboard.nextDouble();
                excess = (weight - weightlimit);
                valueticket = (excess * ticket);
            System.out.println("O valor da Multa é de R$ " + valueticket);
    keyboard.close();
}
}