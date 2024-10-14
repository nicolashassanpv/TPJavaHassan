import java.util.Scanner;

public class Calorias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese la duración del ejercicio en minutos: ");
        int duracion = scanner.nextInt();

        System.out.print("Ingrese el tipo de ejercicio (correr, nadar, andar en bicicleta): ");
        String tipoEjercicio = scanner.next();

        double caloriasQuemadas = 0;
        switch (tipoEjercicio.toLowerCase()) {
            case "correr":
                caloriasQuemadas = 0.075 * peso * duracion;
                break;
            case "nadar":
                caloriasQuemadas = 0.1 * peso * duracion;
                break;
            case "andar en bicicleta":
                caloriasQuemadas = 0.065 * peso * duracion;
                break;
            default:
                System.out.println("Tipo de ejercicio no válido.");
                return;
        }

        System.out.printf("Calorías quemadas: %.2f%n", caloriasQuemadas);

        scanner.close();
    }
}
