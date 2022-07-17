import java.util.Scanner;

public class EX03C5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        double liquido, ir;
        float salario;
        System.out.print("Informe o número de dependentes: ");
        numero = teclado.nextInt();
        System.out.print("Informe o seu salário em reais: ");
        salario = teclado.nextFloat();
        liquido = salario - (numero * 60);
        ir = liquido * 0.15;
        System.out.println(ir);
        teclado.close();
    }   
}