import java.util.Scanner;
public class SumadosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, suma = 0;
        int respuesta;

        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextInt();

        System.out.println("Suma repetitiva de " + num1 + " + " + num2 + ":");

        while (true) {
            suma += num1 + num2;
            System.out.println("Suma: " + suma);

            System.out.print("¿Desea continuar sumando? (1 para sí, 0 para no): ");
            respuesta = scanner.nextInt();

            if (respuesta == 0) {
                break;
            } else if (respuesta != 1) {
                System.out.println("Respuesta inválida. Por favor, ingrese 1 para continuar o 0 para detener.");
            }
        }

        scanner.close();
    }
}