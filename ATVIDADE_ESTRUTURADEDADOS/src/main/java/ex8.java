import java.util.Scanner;

public class ex8 {
    public static void main(String[] args){

        double K;
        double C;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma temperatura em graus Kelvin: ");
        K = entrada.nextDouble();
        double conversao = (C=K-273.15);
        System.out.println(conversao);
}

}
