package ejercicioarreglos;
import java.util.Scanner;

public class arreglos {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        int[] numeros = new int[10];

        // Leer los 10 numeros
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            numeros[i] = consola.nextInt();
        }

        // Inicializar mayor y menor
        int mayor = numeros[0];
        int menor = numeros[0];

        int posicionMayor = 0;
        int posicionMenor = 0;

        // Recorrer el arreglo para encontrar mayor y menor
        for (int i = 1; i < 10; i++) {

            if (numeros[i] > mayor) {
                mayor = numeros[i];
                posicionMayor = i;
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
                posicionMenor = i;
            }
        }

        // Mostrar los cuatro datos
        System.out.println("\nNumero mayor: " + mayor);
        System.out.println("Posicion del mayor: " + posicionMayor);

        System.out.println("Numero menor: " + menor);
        System.out.println("Posicion del menor: " + posicionMenor);

        consola.close();
    }
}