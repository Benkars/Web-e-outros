import java.util.Scanner;

public class EX0701C5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float x;
        double funcao;

        System.out.print("Informe o valor de X: ");
        x = teclado.nextFloat();

        funcao = Math.sqrt(Math.pow((x / 4.0) + 1, 2) + x / 5.0);

        System.out.println(funcao);

        teclado.close();
    }
}