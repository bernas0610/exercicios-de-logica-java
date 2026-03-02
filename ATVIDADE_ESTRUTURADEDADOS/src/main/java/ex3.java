import java.util.Scanner;

public class ex3 {
    public static void main(String[]args){
        int num1;
        int num2;
        int num3;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        num1 = entrada.nextInt();
        System.out.println("Digite um segundo valor inteiro: ");
        num2 = entrada.nextInt();
        System.out.println("Digite um terceiro valor inteiro: ");
        num3 = entrada.nextInt();

        int soma = (num1 + num2 + num3);

        System.out.println("A soma dos tres numero é igual a:" +soma);

    }
}
