import java.util.Scanner;

public class NumerosParesImparesArray {
    public static void main(String[] args) throws Exception {
        
        Scanner pedir = new Scanner(System.in);
        int[] numeros = new int[12];
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < 12; i++) {
            System.out.print("Ingrese un numero: ");
            numeros[i] = pedir.nextInt();
        }

        for (int i = 0; i < 12; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Hay " + pares + " numeros pares");
        System.out.println("Hay " + impares + " numeros impares");
        pedir.close();

    }
}
