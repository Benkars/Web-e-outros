import java.util.Scanner;

public class EX09C5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3;
        double media;

        System.out.println("Informe as notas n1, n2 e n3: ");
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        n3 = teclado.nextInt();

        media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10.0;

        System.out.println(media);

        teclado.close();
    }
}