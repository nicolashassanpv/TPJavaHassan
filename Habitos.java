import java.util.Scanner;

public class Habitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese cuántas horas al día duerme: ");
        double horasSueño = scanner.nextDouble();


        System.out.print("Ingrese cuántas horas al día hace ejercicio: ");
        double horasEjercicio = scanner.nextDouble();


        System.out.print("Ingrese cuántas comidas saludables consume al día: ");
        int comidasSaludables = scanner.nextInt();


        evaluarHabitosSaludables(horasSueño, horasEjercicio, comidasSaludables);

        scanner.close();
    }

    public static void evaluarHabitosSaludables(double horasSueño, double horasEjercicio, int comidasSaludables) {
        System.out.println("\nEvaluación de hábitos saludables:");


        if (horasSueño >= 7 && horasSueño <= 9) {
            System.out.println("Horas de sueño: Bueno. Está durmiendo una cantidad adecuada de horas.");
        } else if (horasSueño > 9) {
            System.out.println("Horas de sueño: Excesivo. Considere reducir las horas de sueño.");
        } else {
            System.out.println("Horas de sueño: Insuficiente. Considere aumentar las horas de sueño.");
        }


        if (horasEjercicio >= 0.5 && horasEjercicio <= 1.5) {
            System.out.println("Horas de ejercicio: Bueno. Está haciendo una cantidad adecuada de ejercicio.");
        } else if (horasEjercicio > 1.5) {
            System.out.println("Horas de ejercicio: Excesivo. Considere reducir las horas de ejercicio.");
        } else {
            System.out.println("Horas de ejercicio: Insuficiente. Considere aumentar las horas de ejercicio.");
        }


        if (comidasSaludables >= 3) {
            System.out.println("Comidas saludables: Bueno. Está consumiendo una cantidad adecuada de comidas saludables.");
        } else {
            System.out.println("Comidas saludables: Insuficiente. Considere aumentar el consumo de comidas saludables.");
        }


        if (horasSueño == 0 && horasEjercicio == 0 && comidasSaludables == 0) {
            System.out.println("Usted está muerto");
        }
    }
}
