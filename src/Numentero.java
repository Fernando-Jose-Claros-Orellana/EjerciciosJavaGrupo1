import java.util.Scanner;

public class Numentero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int primerNumero = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int segundoNumero = scanner.nextInt();

        System.out.println("Los números pares entre " + primerNumero + " y " + segundoNumero + " son:");

      
        if (primerNumero > segundoNumero) {
            int temp = primerNumero;
            primerNumero = segundoNumero;
            segundoNumero = temp;
        }

        int numeroActual = primerNumero;

        
        while (numeroActual <= segundoNumero) {
            if (numeroActual % 2 == 0) {
                System.out.println(numeroActual);
            }
            numeroActual++;
        }
    }
}