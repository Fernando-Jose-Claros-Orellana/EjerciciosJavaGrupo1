import java.util.Scanner;

public class DescuentoCompra {

    public static void main(String[] args) throws Exception{

        //solicitar el valor de una compra
        Scanner pedir = new Scanner(System.in);
        System.out.print("Ingrese el valor de la compra: ");
        double valorCompra = pedir.nextDouble();
        pedir.close();

        double total;
        double descuento;
        //calcular el descuento
        if (valorCompra < 100) {
            System.out.println("No hay descuento");
            System.out.println("El total es: " + valorCompra);

        } else if (valorCompra >= 100 && valorCompra <= 300) {
            System.out.println("El descuento es del 10%");
            descuento = valorCompra * 0.10;
            total = valorCompra - descuento;
            System.out.println("El descuento sera de: " + descuento);
            System.out.println("El total es: " + total);

        } else {
            System.out.println("El descuento es del 15%");
            descuento = valorCompra * 0.15;
            total = valorCompra - descuento;
            System.out.println("El descuento sera de: " + descuento);
            System.out.println("El total es: " + total);

        }


    }
}
