import java.util.Scanner;

public class ActividadesSegun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese su estado de ánimo (feliz, triste, enérgico, relajado): ");
        String estadoAnimo = scanner.nextLine().toLowerCase();


        switch (estadoAnimo) {
            case "feliz":
                recomendarActividadFeliz();
                break;
            case "triste":
                recomendarActividadTriste();
                break;
            case "enérgico":
                recomendarActividadEnergico();
                break;
            case "relajado":
                recomendarActividadRelajado();
                break;
            default:
                System.out.println("Estado de ánimo no válido.");
                break;
        }

        scanner.close();
    }

    public static void recomendarActividadFeliz() {
        System.out.println("Recomendación de actividad para cuando estás feliz:");
        System.out.println("Sal a caminar y disfruta del paisaje.");
    }

    public static void recomendarActividadTriste() {
        System.out.println("Recomendación de actividad para cuando estás triste:");
        System.out.println("Escucha música relajante o habla con un amigo.");
    }

    public static void recomendarActividadEnergico() {
        System.out.println("Recomendación de actividad para cuando estás enérgico:");
        System.out.println("Haz ejercicio o practica un deporte que te guste.");
    }

    public static void recomendarActividadRelajado() {
        System.out.println("Recomendación de actividad para cuando estás relajado:");
        System.out.println("Lee un libro o practica meditación.");
    }
}