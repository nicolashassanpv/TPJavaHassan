import java.util.Scanner;

public class PlanEstudio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese cuántas horas al día puede estudiar: ");
        int horasDiarias = scanner.nextInt();


        if (horasDiarias <= 0) {
            System.out.println("El número de horas debe ser mayor que cero.");
            return;
        }


        System.out.print("Ingrese el número de materias: ");
        int numeroMaterias = scanner.nextInt();


        if (numeroMaterias <= 0) {
            System.out.println("El número de materias debe ser mayor que cero.");
            return;
        }


        String[] materias = new String[numeroMaterias];
        for (int i = 0; i < numeroMaterias; i++) {
            System.out.print("Ingrese el nombre de la materia " + (i + 1) + ": ");
            materias[i] = scanner.next();
        }


        generarPlanEstudio(horasDiarias, materias);

        scanner.close();
    }

    public static void generarPlanEstudio(int horasDiarias, String[] materias) {
        int totalHorasSemana = horasDiarias * 7;
        int horasPorMateria = totalHorasSemana / materias.length;

        System.out.println("\nPlan de estudio semanal:");
        for (int i = 0; i < materias.length; i++) {
            System.out.println(materias[i] + ": " + horasPorMateria + " horas por semana");
        }


        int horasRestantes = totalHorasSemana % materias.length;
        if (horasRestantes > 0) {
            System.out.println("\nHoras restantes: " + horasRestantes + " horas");
            System.out.println("Puede distribuir estas horas adicionales según sus necesidades.");
        }
    }
}