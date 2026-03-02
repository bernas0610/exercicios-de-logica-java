import java.util.Scanner;

public class ex4 {
    public static void main(String[]args){

        double x;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero inteiro:");
        x = entrada.nextInt();
        double quadrado = (x*x);
        System.out.println(quadrado);

    }
}
