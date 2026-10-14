package ciclosanidados;

import java.util.Scanner;

public class VentasPaletas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalGeneral = 0;
        double recaudacionTotal = 0;

        for (int dia = 1; dia <= 2; dia++) {

            System.out.println("\nDia " + dia + " ");

            int totalPaletas = 0;
            double dineroDia = 0;

            for (int sabor = 1; sabor <= 3; sabor++) {

                int precio = 0;

                if (sabor == 1) {
                    precio = 15;
                    System.out.println("Sabor: Fresa ($15)");
                } else if (sabor == 2) {
                    precio = 12;
                    System.out.println("Sabor: Limon ($12)");
                } else {
                    precio = 18;
                    System.out.println("Sabor: Coco ($18)");
                }

                System.out.print("Cuantas paletas vendieron? ");
                int cantidad = sc.nextInt();

                totalPaletas += cantidad;
                dineroDia += cantidad * precio;
            }

            System.out.println("\nTotal de paletas del dia: "
                    + totalPaletas);
            System.out.println("Dinero recaudado del dia: $"
                    + dineroDia);

            totalGeneral += totalPaletas;
            recaudacionTotal += dineroDia;
        }

        System.out.println("\nRESUMEN GENERAL :b");
        System.out.println("Total de paletas vendidas: "
                + totalGeneral);
        System.out.println("Recaudacion total: $"
                + recaudacionTotal);

        sc.close();
    }
}
