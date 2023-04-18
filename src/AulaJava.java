import java.util.Locale;

public class AulaJava {
    public static void main(String[] args) {

        int y = 32;
        double x = 10.35784;
        String nome = "Zacker";
        int idade = 27;
        double renda = 100.000;

        System.out.println("Olá Zacker!");
        System.out.println("Ótimo dia!");
        System.out.println("___________Valores Inteiros___________");
        System.out.println(x);
        System.out.println(y);
        System.out.println("______________________________________");

        System.out.printf("%.4f%n", x);  // QUATRO CASAS DECIMAIS %.4f
        System.out.printf("%.2f%n", x); // DUAS CASAS DECIMAIS %.2f
        Locale.setDefault(Locale.US);
        System.out.print("IDIOMA ALTERADO PARA US: ");
        System.out.printf("%.2f%n", x); // COM IDIOMA ALTERADO


        System.out.println("_______________Medidas__________________");
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f metros%n", x);
        System.out.println("________________________________________");

        System.out.printf("%s tem %d anos e ganha R$ %.3f reais%n", nome, idade, renda);




    }
}
//           %f = ponto flutuante
//           %d = inteiro
//           %s = texto
//           %n = quebra linha