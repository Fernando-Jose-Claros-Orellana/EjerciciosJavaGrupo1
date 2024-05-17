import java.util.Scanner;;

public class Compra_Con_Descuento 
{
    public static void main(String[] args) throws Exception
    {
        Scanner Console = new Scanner( System.in);

        // Atributos:
        double Pc_Gamer = 150;
        double Grafica = 100;
        double Teclado = 50;
        double Descuento = 10;
        double Total=0.0;
        boolean Terminar = false;

        do{
            System.out.println("\n    _ _ Bienvenido A La Tienda _ _");
            System.out.println("\nProductos Para Comprar:");
            System.out.println("1. PC Gamer = $150    2. Grafica 4090T = $ 100    3. Teclado = $50");
            System.out.print("Opcion: ");
            int Opcion = Console.nextInt();

            if(Opcion==1)
            {
                //Descuento
                Total = (Pc_Gamer*Descuento)/100;

                System.out.println("\n  DATOS DE COMPRA:");
                System.out.print("Precio Del Producto: $"+Pc_Gamer);
                System.out.println("  Con Un Descuento De: "+Descuento+"%");
                System.out.println("Descuento a Aplicar: $"+Total);
                System.out.println("Total A Pagar: $"+(Pc_Gamer-Total));
            }
            else if(Opcion==2)
            {
                //Descuento
                Total = (Grafica*Descuento)/100;

                System.out.println("\n  DATOS DE COMPRA:");
                System.out.print("Precio Del Producto: $"+Grafica);
                System.out.println("  Con Un Descuento De: "+Descuento+"%");
                System.out.println("Descuento a Aplicar: $"+Total);
                System.out.println("Total A Pagar: $"+(Grafica-Total));
            }
            else if(Opcion==3)
            {
                //Descuento
                Total = (Teclado*Descuento)/100;

                System.out.println("\n  DATOS DE COMPRA:");
                System.out.print("Precio Del Producto: $"+Teclado);
                System.out.println("  Con Un Descuento De: "+Descuento+"%");
                System.out.println("Descuento a Aplicar: $"+Total);
                System.out.println("Total A Pagar: $"+(Teclado-Total));
            }
            else
            {
                System.out.println("\nOpcion No Valida\n");
              
            }

            System.out.println("\n¿Desea Seguir Comprando?: ");
            System.out.println("1.Si  2.No");
            System.out.print("Opcion: ");
            int Continuar = Console.nextInt();

            if(Continuar!=1)
            {
                Terminar=true;
            }

        }while(!Terminar);

        
        System.out.println("");
    }
}
