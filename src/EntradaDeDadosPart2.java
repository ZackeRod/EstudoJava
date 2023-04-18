
import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDadosPart2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int x;
        double y;
        String s1, s2, s3;

        x = sc.nextInt();
        sc.nextLine();
        y = sc.nextDouble();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITATOS: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();

    }
}
