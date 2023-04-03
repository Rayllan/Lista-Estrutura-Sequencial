// Operadores Logicos
// ">" Maior que 
// "<" Menor que 
// ">=" Maior ou igual a 
// "<=" Menor ou igual a 
// "==" Igual a 
// "!=" Diferente de 
// "**" Expoente ex. (c>= Match.pow(a, b));


package logicaealgoritimos;
import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;

public class operadores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);

// Variavies
        int a = 2,
        b = 3,
        c = 5;

// Operadores 
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==2);
        System.out.println(a!=c);
        System.out.println(c==a+b);
        System.out.println(c >= Math.pow(a, b));

keyboard.close();
    }
}