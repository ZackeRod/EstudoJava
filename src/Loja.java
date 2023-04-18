import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bem vindo a Loja de Zackerod");

        System.out.println("Entre com o valor do produto: ");
        double valorProduto = scan.nextDouble();

        System.out.println("Entre com o valor do segundo produto: ");
        double valorProduto2 = scan.nextDouble();

        double soma = valorProduto + valorProduto2;
        System.out.println("A soma do produto 1 + produto 2: " + soma);
    }
}
