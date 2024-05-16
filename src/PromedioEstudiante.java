import java.util.Scanner;
public class PromedioEstudiante {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       
       float nota1, nota2, nota3, promedio;
        
       do {
       System.out.println("Ingrese la primera nota (entre 0 y 10)");
       nota1 = scanner.nextFloat();
       } while (nota1 < 0 || nota1 > 10);

       do {
       System.out.println("Ingrese la segunda nota (entre 0 y 10)");
       nota2 = scanner.nextFloat();
       
       } while (nota2 < 0 || nota2 > 10);

       do {
       System.out.println("Ingrese la tercera nota (entre 0 y 10)");
       nota3 = scanner.nextFloat();
       } while (nota3 < 0 || nota3 > 10);

       promedio = (nota1 + nota2 + nota3) / 3;

        System.out.printf("El promedio es: %.2f\n", promedio);

        if (promedio >= 7) {
            System.out.println("El estudiante está aprobado");
        } else {
            System.out.println("El estudiante está reprobado");
        }

        scanner.close();    
    
}    
}


