import java.util.Scanner;

public class CostoDeViaje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese la distancia del viaje en kilómetros: ");
        double distancia = scanner.nextDouble();


        System.out.print("Ingrese el consumo de combustible del vehículo en litros por kilómetro: ");
        double consumo = scanner.nextDouble();


        System.out.print("Ingrese el precio del combustible por litro: ");
        double precioCombustible = scanner.nextDouble();


        double costoTotal = distancia * consumo * precioCombustible;


        System.out.printf("El costo total del viaje es: %.2f%n", costoTotal);


        scanner.close();
    }
}