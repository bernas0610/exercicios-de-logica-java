import java.util.Scanner;

public class ex6 {
    public static void main(String[]args){
        double F;
        double C;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma temperatura em graus celsius: ");
        C = entrada.nextDouble();
        double conversao = (F = C*(9.0/5.0)+32.0);
        System.out.println(conversao);


    }


}
