import java.util.Scanner;

public class NombredeArticulos {
    public static void main(String[] args) throws Exception {
        
        Scanner pedir = new Scanner(System.in);

        String[] articulos = new String[9]; 

        for (int i = 0;i <= 8 ;i ++){

            System.out.println("Escriba nombre del articulo");
            articulos[i] = pedir.next();
        }

        for (int x = 8;x >= 0;x --) {
            System.out.println("El nombre del articulo " + x + " es " + articulos[x]);
        }

        pedir.close();
    }
}
