import java.util.Scanner;

public class Rutina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nivel de condición física (principiante, intermedio, avanzado): ");
        String nivel = scanner.nextLine().toLowerCase();

        switch (nivel) {
            case "principiante":
                generarRutinaPrincipiante();
                break;
            case "intermedio":
                generarRutinaIntermedio();
                break;
            case "avanzado":
                generarRutinaAvanzado();
                break;
            default:
                System.out.println("Nivel de condición física no válido.");
                break;
        }

        scanner.close();
    }

    public static void generarRutinaPrincipiante() {
        System.out.println("Rutina de ejercicio semanal para principiantes:");
        System.out.println("Lunes: Ejercicio de resistencia 40 minutos");
        System.out.println("Martes: Ejercicios de Tronco superior 40 minutos");
        System.out.println("Miércoles: Ejercicio de movilidad 30 minutos");
        System.out.println("Jueves: Caminadora 5 kilometros");
        System.out.println("Viernes: Ejercicios de pierna 40 minutos)");
        System.out.println("Sábado: Descanso");
        System.out.println("Domingo: Descanso");
    }

    public static void generarRutinaIntermedio() {
        System.out.println("Rutina de ejercicio semanal para intermedios:");
        System.out.println("Lunes: Ejercicios de resistencia + ejercicios de core");
        System.out.println("Martes: Ejercicios centrados en fuerza de brazo y espalda");
        System.out.println("Miércoles: Ejercicios de destreza y movilidad 60 minutos");
        System.out.println("Jueves: Caminadora + bicicleta fuerza media 60 minutos");
        System.out.println("Viernes: Ejercicios de piernas centrados en quadriceps");
        System.out.println("Sábado: Descanso");
        System.out.println("Domingo: Descanso");
    }

    public static void generarRutinaAvanzado() {
        System.out.println("Rutina de ejercicio semanal para avanzados:");
        System.out.println("Lunes: Ejercicios de resistencia 60 minutos + 15 kilometros en bicicleta");
        System.out.println("Martes: Ejercicios de biceps, triceps y hombro");
        System.out.println("Miércoles: Ejercicios de quadriceps, pantorrillas y abdoptores");
        System.out.println("Jueves: Ejercicios pecho y espalda trabajos completos");
        System.out.println("Viernes: Idem Jueves");
        System.out.println("Sábado: Bicicleta 10 kilometros");
        System.out.println("Domingo: Ejercicios de fuerza 30 minutos");
    }
}