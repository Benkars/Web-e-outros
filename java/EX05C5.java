import java.util.Scanner;

public class EX05C5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float celsius, kelvin;
        double fahrenheit;
        System.out.print("Informe a temperatura em celsius: ");
        celsius = teclado.nextFloat();
        
        kelvin = celsius + 273;
        fahrenheit = (celsius*9 + 160) / 5.0;

        System.out.printf("kelvin = %f \nfahrenheit = %f",kelvin,fahrenheit);

        teclado.close();
    }   
}