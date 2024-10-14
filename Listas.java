import java.util.Scanner;

public class Listas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su estado de ánimo (feliz, triste, enérgico, relajado): ");
        String estadoAnimo = scanner.nextLine().toLowerCase();


        switch (estadoAnimo) {
            case "feliz":
                generarListaFeliz();
                break;
            case "triste":
                generarListaTriste();
                break;
            case "enérgico":
                generarListaEnergico();
                break;
            case "relajado":
                generarListaRelajado();
                break;
            default:
                System.out.println("Estado de ánimo no válido.");
                break;
        }

        scanner.close();
    }

    public static void generarListaFeliz() {
        System.out.println("Lista de reproducción para cuando estás feliz:");
        System.out.println("1. La Bicicleta - Carlos Vives ft. Shakira");
        System.out.println("2. Despacito - Luis Fonsi ft. Daddy Yankee");
        System.out.println("3. Bailando - Enrique Iglesias ft. Descemer Bueno y Gente de Zona");
        System.out.println("4. Felices los 4 - Maluma");
        System.out.println("5. No Me Acuerdo - Thalía ft. Natti Natasha");
    }

    public static void generarListaTriste() {
        System.out.println("Lista de reproducción para cuando estás triste:");
        System.out.println("1. Amor Eterno - Rocío Dúrcal");
        System.out.println("2. Sin Ti - Marco Antonio Solís");
        System.out.println("3. Perdóname - La Sonora Dinamita");
        System.out.println("4. Lluvia al Corazón - Maná");
        System.out.println("5. Si Tú No Estás Aquí - Rosana");
    }

    public static void generarListaEnergico() {
        System.out.println("Lista de reproducción para cuando estás enérgico:");
        System.out.println("1. Mi Gente - J Balvin ft. Willy William");
        System.out.println("2. Con Calma - Daddy Yankee ft. Snow");
        System.out.println("3. Taki Taki - DJ Snake ft. Selena Gomez, Ozuna, Cardi B");
        System.out.println("4. Bailar - Deorro ft. Elvis Crespo");
        System.out.println("5. Súbeme la Radio - Enrique Iglesias ft. Descemer Bueno y Zion & Lennox");
    }

    public static void generarListaRelajado() {
        System.out.println("Lista de reproducción para cuando estás relajado:");
        System.out.println("1. El Día Que Me Quieras - Carlos Gardel");
        System.out.println("2. Volver - Carlos Gardel");
        System.out.println("3. Por Una Cabeza - Carlos Gardel");
        System.out.println("4. Alfonsina y el Mar - Mercedes Sosa");
        System.out.println("5. Gracias a la Vida - Mercedes Sosa");
    }
}
