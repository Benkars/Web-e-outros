import java.util.Scanner;

public class EX06C5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float a, b, c, x, y;
        double distancia;

        System.out.print("Informe os valores de A, B, C da reta R e as coordenadas de X e Y: ");
        a = teclado.nextFloat();
        b = teclado.nextFloat();
        c = teclado.nextFloat();
        x = teclado.nextFloat();
        y = teclado.nextFloat();

        distancia = (a * x + b * y + c) / (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));

        System.out.println(distancia);

        teclado.close();
    }
}