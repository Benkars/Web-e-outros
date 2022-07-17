import java.util.Scanner;

public class EX08C5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float s, a;
        double raio;
        System.out.print("Informe a área de um setor circular: ");
        s = teclado.nextFloat();
        System.out.print("Informe o ângulo: ");
        a = teclado.nextFloat();

        raio = Math.sqrt((s * 360) / (a * Math.PI));

        System.out.println(raio);

        teclado.close();
    }
}