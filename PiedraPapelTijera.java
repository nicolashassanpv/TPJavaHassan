import java.util.Scanner;
import java.util.Random;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.print("Ingrese su elección (piedra, papel, tijera): ");
        String eleccionUsuario = scanner.nextLine().toLowerCase();


        if (!eleccionUsuario.equals("piedra") && !eleccionUsuario.equals("papel") && !eleccionUsuario.equals("tijera")) {
            System.out.println("Elección no válida. Por favor, elija entre piedra, papel o tijera.");
            return;
        }


        String[] opciones = {"piedra", "papel", "tijera"};
        String eleccionPrograma = opciones[random.nextInt(opciones.length)];


        String resultado = determinarGanador(eleccionUsuario, eleccionPrograma);


        System.out.println("Usted eligió: " + eleccionUsuario);
        System.out.println("El programa eligió: " + eleccionPrograma);
        System.out.println(resultado);

        scanner.close();
    }

    public static String determinarGanador(String eleccionUsuario, String eleccionPrograma) {
        if (eleccionUsuario.equals(eleccionPrograma)) {
            return "Empate!";
        } else if (eleccionUsuario.equals("piedra") && eleccionPrograma.equals("tijera") ||
                eleccionUsuario.equals("papel") && eleccionPrograma.equals("piedra") ||
                eleccionUsuario.equals("tijera") && eleccionPrograma.equals("papel")) {
            return "Usted gana!";
        } else {
            return "El programa gana!";
        }
    }
}
