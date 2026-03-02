import java.util.Scanner;

public class ex10 {
    public static void main(String[] args){

        double km;
        double m;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma velocidade em Km/h");
        km = entrada.nextDouble();
        double conversao = (m=(km/3.6));
        System.out.println(conversao);
    }
}
