import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();


        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();


        double imc = calcularIMC(peso, altura);


        System.out.printf("Su Índice de Masa Corporal (IMC) es: %.2f%n", imc);


        imprimirRecomendacion(imc);

        scanner.close();
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static void imprimirRecomendacion(double imc) {
        if (imc < 18.5) {
            System.out.println("Recomendación: Bajo peso. Considere aumentar su ingesta calórica y realizar ejercicios de fortalecimiento.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Recomendación: Peso normal. Mantenga una dieta equilibrada y realice ejercicios regularmente.");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Recomendación: Sobrepeso. Considere reducir su ingesta calórica y aumentar su actividad física.");
        } else {
            System.out.println("Recomendación: Obesidad. Consulte a un profesional de la salud para un plan de dieta y ejercicio adecuado.");
        }
    }
}
