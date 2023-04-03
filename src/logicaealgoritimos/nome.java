package logicaealgoritimos;
import java.util.Scanner;

public class nome {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

        String nome;

        Scanner input = new Scanner(System.in);

        System.out.print("Qual o seu nome? \n");

            nome = input.nextLine();

        System.out.println("Olá " + nome + " como vai?");

        keyboard.close();
        input.close();
    }
}