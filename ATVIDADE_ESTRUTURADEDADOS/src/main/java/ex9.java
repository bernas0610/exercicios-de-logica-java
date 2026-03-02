import java.util.Scanner;

public class ex9 {
    public static void main(String[] args){

        double K;
        double C;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma temperatura em graus Celsius: ");
        C = entrada.nextDouble();
        double conversao = (K=C+273.15);
        System.out.println(conversao);
    }
}
