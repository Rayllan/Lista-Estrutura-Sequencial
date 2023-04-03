package aulas;

import java.util.Scanner;
import java.util.Locale;

    public class imc{
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);
    
    double peso = 0.0,
    altura = 0.0,
    imc = 0.0;
    
    System.out.println("Digite seu pese em KG:");
    peso = keyboard.nextDouble();
    System.out.println("Digite sua altura em cm:");
    altura = keyboard.nextDouble();
    
    imc = (peso / (altura * altura));
    
    if (imc < 18.5){
        System.out.println("Abaixo do peso");
    }
    else {
        if (imc > 18.5 && imc < 24.9) {
            System.out.println("Peso normal");
        } else {
            if (imc > 18.5 && imc < 24.9) {
                System.out.println("Sobrepeso");
    keyboard.close();
            }   
        }
    }
}
}