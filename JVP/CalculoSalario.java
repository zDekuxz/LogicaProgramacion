import java.util.Scanner;
 
public class CalculoSalario {

    public static final float HORAS_BASE = 40.0f;

    public static final float MULTIPLICADOR_EXTRA = 2.0f;
 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
 
        System.out.print("Ingrese el nombre del empleado: ");

        String nombre = sc.nextLine();
 
        System.out.print("Ingrese el pago correspondiente a cada hora: ");

        float pagoHora = sc.nextFloat();
 
        float totalHoras = 0.0f;

        float horasExtra = 0.0f;

        float salarioSemanal;

        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
 
        for (int i = 0; i < dias.length; i++) {

            System.out.print("Ingrese las horas trabajadas el " + dias[i] + ": ");

            float horasDia = sc.nextFloat();

            totalHoras += horasDia;

        }
 
        if (totalHoras > HORAS_BASE) {

            horasExtra = totalHoras - HORAS_BASE;

            salarioSemanal = (HORAS_BASE * pagoHora) + (horasExtra * pagoHora * MULTIPLICADOR_EXTRA);

        } else {

            salarioSemanal = totalHoras * pagoHora;

        }

        System.out.println("Empleado: " + nombre);

        System.out.println("Pago por hora: " + pagoHora);

        System.out.println("Horas trabajadas: " + totalHoras);

        System.out.println("Horas extra: " + horasExtra);

        System.out.println("Salario semanal: $" + salarioSemanal);
 
        sc.close();

    }

}
 