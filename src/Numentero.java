import java.util.Scanner;

public class Numentero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, suma = 0;
        boolean continuar = true;
        String respuesta;

        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextInt();

        System.out.println("Suma repetitiva de " + num1 + " + " + num2 + ":");

        while (continuar) {
            suma += num1 + num2;
            System.out.println("Suma: " + suma);

            System.out.print("¿Desea continuar sumando? (s/n): ");
            respuesta = scanner.next();

            if (respuesta.equals("n")) {
                continuar = false;
            } else if (!respuesta.equals("s")) {
                System.out.println("Respuesta inválida. Por favor, ingrese 's' o 'n'.");
            }
        }

        scanner.close();
    }
}