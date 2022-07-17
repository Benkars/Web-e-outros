import java.util.Scanner;

public class EX02C5 {
    public static void main(String[] args) {
        float x;
        double pi = 3.1416, area, volume;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe X: ");
        x = teclado.nextFloat();

        area = 4 * pi * Math.pow(x, 2);
        volume = (float) 4 / 3 * pi * Math.pow(x, 3);

        System.out.print(area + "\n" + volume);
        teclado.close();
    }
}