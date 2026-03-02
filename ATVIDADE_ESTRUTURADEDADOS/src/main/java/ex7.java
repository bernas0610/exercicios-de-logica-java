import java.util.Scanner;

public class ex7 {
    public static void main(String[] args){

        double F;
        double C;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma temperatura em graus Fahrenheit: ");
        F = entrada.nextDouble();
        double conversao = (C=5.0*(F-32.0)/9);
        System.out.println(conversao);


    }
}
