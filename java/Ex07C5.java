import java.util.Scanner;

public class Ex07C5 {
    public static void main(String[] args) {
        float x;
        double serie;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe X porra: ");
        x = teclado.nextInt();
        serie = Math.pow(x, 3) + 4*x + 10;
        System.out.println(serie);
        teclado.close();
    }   
}