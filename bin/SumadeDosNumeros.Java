import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, suma = 0, repeticiones = 0;
        char continuar;

        do {
            System.out.print("Ingresa el primer número: ");
            num1 = scanner.nextInt();

            System.out.print("Ingresa el segundo número: ");
            num2 = scanner.nextInt();

            while (repeticiones < num2) {
                suma += num1;
                repeticiones++;
            }

            System.out.println("La suma de " + num1 + " repetida " + num2 + " veces es: " + suma);

            System.out.print("¿Deseas continuar? (s/n): ");
            continuar = scanner.next().charAt(0);

            suma = 0;
            repeticiones = 0;
        } while (continuar == 's' || continuar == 'S');
    }
}