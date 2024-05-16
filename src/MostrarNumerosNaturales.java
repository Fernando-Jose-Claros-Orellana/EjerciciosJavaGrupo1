import java.util.Scanner;

public class MostrarNumerosNaturales {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar un número entero al usuario
        System.out.print("Por favor, ingrese un número entero: ");
        int numero = scanner.nextInt();
        
        // Inicializar el contador en 0
        int contador = 0;
        
        // Imprimir los números pares usando un bucle while
        System.out.println("Números pares entre 0 y " + numero + ":");
        while (contador <= numero) {
            if (contador % 2 == 0) {
                System.out.println(contador);
            }
            contador++;
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}
