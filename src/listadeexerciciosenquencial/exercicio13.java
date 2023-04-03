package listadeexerciciosenquencial;
    import java.util.Scanner;
    import java.util.Locale;

public class exercicio13 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        

    double height = 0.0,
    weightman = 0.0,
    weightwoman = 0.0;


     System.out.println("Informe o seu sexo? (Digite Masculino ou Feminino )    ");
            String resposta = input.nextLine();

             boolean Masculino = resposta.equalsIgnoreCase("Masculino");
             boolean Feminino = resposta.equalsIgnoreCase("Feminino");

     System.out.println("Qual é a sua altura? \n");
            height = keyboard.nextDouble();

    if (Masculino) {

        weightman = (72.7*height) - 58;
        System.out.println("Seu peso ideal é de " + weightman + "kg \n");
    }
    else {
        if (Feminino) {
        weightwoman = (62.1*height) - 44.7;
        System.out.println("Seu peso ideal é de " + weightwoman + "kg \n");

       
            }
   
        }
    keyboard.close();
    input.close();
    }
}