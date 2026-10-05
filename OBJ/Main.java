import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String continuar;

        do {

            System.out.print("Ingresa tu peso en kg: ");
            double peso = scanner.nextDouble();

            System.out.print("Ingresa tu altura en metros: ");
            double altura = scanner.nextDouble();

            double imc = peso / (altura * altura);

            System.out.printf("Tu IMC es: %.2f%n", imc);

            if (imc < 18.5) {
                System.out.println("Debajo del rango de referencia.");
                System.out.println("Recomendacion: procura mantener una alimentacion equilibrada y consulta a un profesional de salud.");

            } else if (imc >= 18.5 && imc < 25.0) {
                System.out.println("Dentro del rango de peso normal :b");
                System.out.println("Recomendacion: continua con una alimentacion equilibrada, actividad fisica regular y buenos habitos de sueño.");

            } else if (imc >= 25.0 && imc < 30.0) {
                System.out.println("Tienes sobrepeso! Pero aun estas a tiempo :)");
                System.out.println("Recomendacion: procura llevar una alimentacion equilibrada, mantener actividad fisica regular y consultar a un profesional de salud.");

            } else if (imc >= 30.0 && imc < 35.0) {
                System.out.println("Obesidad grado 1.");
                System.out.println("Recomendacion: considera consultar a un profesional de salud para recibir orientacion personalizada sobre alimentacion y actividad fisica.");

            } else if (imc >= 35.0 && imc < 40.0) {
                System.out.println("Obesidad grado 2.");
                System.out.println("Recomendacion: es recomendable consultar a un profesional de salud para recibir orientacion personalizada y dar seguimiento a tu salud.");

            } else {
                System.out.println("IMC de 40 o mas.");
                System.out.println("Recomendacion: consulta a un profesional de salud para recibir una evaluacion y orientacion personalizada.");
            }

            System.out.print("\n¿Quieres calcular otro IMC? (si/no): ");
            continuar = scanner.next();

        } while (continuar.equalsIgnoreCase("si"));

        System.out.println("Programa terminado.");

        scanner.close();
    }
}