import java.util.Scanner;

public class EX04C5 {
    public static void main(String[] args) {
        float x1, x2, y1, y2;
        double distancia;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe os valores X1 e Y1: ");
        x1 = teclado.nextFloat();
        y1 = teclado.nextFloat();
        System.out.print("Informe os valores X2 e Y2: ");
        x2 = teclado.nextFloat();
        y2 = teclado.nextFloat();

        distancia = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        System.out.println(distancia);

        teclado.close();
    }
}