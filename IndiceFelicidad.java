import java.util.Scanner;

public class IndiceFelicidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese su nivel de satisfacción con la vida (1-10): ");
        int satisfaccion = scanner.nextInt();

        System.out.print("Ingrese su nivel de estrés (1-10): ");
        int estres = scanner.nextInt();

        System.out.print("Ingrese su nivel de salud (1-10): ");
        int salud = scanner.nextInt();

        System.out.print("Ingrese su nivel de relaciones sociales (1-10): ");
        int relaciones = scanner.nextInt();

        System.out.print("Ingrese su nivel de satisfacción en la universidad (1-10): ");
        int facultad = scanner.nextInt();


        if (satisfaccion < 1 || satisfaccion > 10 || estres < 1 || estres > 10 ||
                salud < 1 || salud > 10 || relaciones < 1 || relaciones > 10 ||
                facultad < 1 || facultad > 10) {
            System.out.println("Todos los valores deben estar en el rango de 1 a 10.");
            return;
        }


        double indiceFelicidad = calcularIndiceFelicidad(satisfaccion, estres, salud, relaciones, facultad);


        System.out.printf("Su índice de felicidad es: %.2f%n", indiceFelicidad);

        scanner.close();
    }

    public static double calcularIndiceFelicidad(int satisfaccion, int estres, int salud, int relaciones, int facultad) {
        double ponderacionSatisfaccion = 0.3;
        double ponderacionEstres = 0.2;
        double ponderacionSalud = 0.2;
        double ponderacionRelaciones = 0.1;
        double ponderacionTrabajo = 0.2;


        double indiceFelicidad = (satisfaccion * ponderacionSatisfaccion) +
                (estres * ponderacionEstres) +
                (salud * ponderacionSalud) +
                (relaciones * ponderacionRelaciones) +
                (facultad * ponderacionTrabajo);

        return indiceFelicidad;
    }
}
