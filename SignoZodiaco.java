import java.util.Scanner;

public class SignoZodiaco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Igrese su fecha de nacimiento en formato (dd/mm/yyyy): ");
        String fechaNacimiento = scanner.nextLine();

        String[] partes = fechaNacimiento.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int anio = Integer.parseInt(partes[2]);

        String signo = obtenerSignoZodiacal(dia, mes);
        String mensajeHoroscopo = obtenerMensajeHorosco(signo);

        System.out.println("Tu signo del zodiaco es: " + signo);
        System.out.println("El mensaje de tu horoscopo es: " + mensajeHoroscopo);
    }

    public static String obtenerSignoZodiacal(int dia, int mes){
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            return "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            return "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            return "Geminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            return  "Cancer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            return "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            return "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            return "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            return "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            return "Capricornio";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            return "Acuario";
        } else if ((mes == 2 && dia >=19) || (mes == 3 && dia <= 20)) {
            return "Piscis";
        } else {
            return "Como vas a poner mas de 12 en meses pa";
        }
    }

    public static String obtenerMensajeHorosco(String signo) {
        switch (signo) {
            case "Aries":
                return "Bien ahi los Aries";
            case "Tauro":
                return "Bien ahi los Tauro";
            case "Geminis":
                return "Bien ahi los Geminis";
            case "Cancer":
                return "Bien ahi los Cancer";
            case "Leo":
                return "Bien ahi los Leo";
            case "Virgo":
                return "Bien ahi los Virgo";
            case "Libra":
                return "Bien ahi los Libra";
            case "Escorpio":
                return "Bien ahi los Escorpio";
            case "Sagitario":
                return "Bien ahi los Sagitario";
            case "Capricornio":
                return "Bien ahi los Capricornio";
            case "Acuario":
                return "Bien ahi los Acuario";
            case "Piscis":
                return "Bien ahi los Piscis";
            default:
                return "Imposible darte un signo";
        }
    }
}
