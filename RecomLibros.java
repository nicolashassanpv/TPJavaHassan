import java.util.Scanner;

public class RecomLibros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese su género de libro favorito (fantasía, misterio, romance, ciencia ficción): ");
        String genero = scanner.nextLine().toLowerCase();


        switch (genero) {
            case "fantasía":
                recomendarLibroFantasia();
                break;
            case "misterio":
                recomendarLibroMisterio();
                break;
            case "romance":
                recomendarLibroRomance();
                break;
            case "ciencia ficción":
                recomendarLibroCienciaFiccion();
                break;
            default:
                System.out.println("Género de libro no válido.");
                break;
        }

        scanner.close();
    }

    public static void recomendarLibroFantasia() {
        System.out.println("Recomendación de libro de fantasía:");
        System.out.println("El Señor de los Anillos - J.R.R. Tolkien");
    }

    public static void recomendarLibroMisterio() {
        System.out.println("Recomendación de libro de misterio:");
        System.out.println("El misterio del cuarto amarillo - Gaston Leroux");
    }

    public static void recomendarLibroRomance() {
        System.out.println("Recomendación de libro de romance:");
        System.out.println("Orgullo y prejuicio - Jane Austen");
    }

    public static void recomendarLibroCienciaFiccion() {
        System.out.println("Recomendación de libro de ciencia ficción:");
        System.out.println("Dune - Frank Herbert");
    }
}
