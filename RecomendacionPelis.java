import java.util.Scanner;

public class RecomendacionPelis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese su género de película favorito (acción, comedia, drama, ciencia ficción): ");
        String genero = scanner.nextLine().toLowerCase();


        switch (genero) {
            case "acción":
                recomendarPeliculaAccion();
                break;
            case "comedia":
                recomendarPeliculaComedia();
                break;
            case "drama":
                recomendarPeliculaDrama();
                break;
            case "ciencia ficción":
                recomendarPeliculaCienciaFiccion();
                break;
            default:
                System.out.println("Género de película no válido.");
                break;
        }

        scanner.close();
    }

    public static void recomendarPeliculaAccion() {
        System.out.println("Recomendación de película de acción:");
        System.out.println("Mad Max: Fury Road (2015)");
    }

    public static void recomendarPeliculaComedia() {
        System.out.println("Recomendación de película de comedia:");
        System.out.println("Superbad (2007)");
    }

    public static void recomendarPeliculaDrama() {
        System.out.println("Recomendación de película de drama:");
        System.out.println("The Shawshank Redemption (1994)");
    }

    public static void recomendarPeliculaCienciaFiccion() {
        System.out.println("Recomendación de película de ciencia ficción:");
        System.out.println("Interstellar (2014)");
    }
}
