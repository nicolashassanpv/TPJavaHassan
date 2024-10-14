import java.util.Scanner;

public class CalculadoraDescuentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();


        System.out.print("Ingrese la categoría del cliente (estudiante, adulto, jubilado): ");
        String categoria = scanner.next().toLowerCase();


        double precioFinal = 0;
        switch (categoria) {
            case "estudiante":
                precioFinal = precio * 0.9; // 10% de descuento
                break;
            case "adulto":
                precioFinal = precio * 0.95; // 5% de descuento
                break;
            case "jubilado":
                precioFinal = precio * 0.85; // 15% de descuento
                break;
            default:
                System.out.println("Categoría de cliente no válida.");
                return;
        }


        System.out.printf("El precio final después del descuento es: %.2f%n", precioFinal);

        scanner.close();
    }
}