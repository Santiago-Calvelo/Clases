import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Utiles {
    private static Random r = new Random();

    private static Scanner sc = new Scanner(System.in);

    public static int ingresarInt(int min, int max) {
        int nro = 0;
        boolean error;
        String ingreso;
        do {
            error = false;

            try {
                ingreso = sc.nextLine();
                if (ingreso.equalsIgnoreCase("TORG")) {
                    Globales.alcalde.sumPlata(1000000);
                }
                nro = Integer.parseInt(ingreso);
                if (nro > max || nro < min) {
                    error = true;
                    System.out.println("El numero debe estar entre " + min + " y " + max);
                }
            } catch (NumberFormatException e) {
                System.out.println("Tipo de dato mal ingresado");
                error = true;
            }
        } while(error);

        return nro;
    }

    public static int generarAleatorio(int nro1, int nro2) {
        return  r.nextInt((nro2 - nro1) + 1) + nro1;
    }

    public static String ingresarString() {
        String ingreso = sc.nextLine();
        if (ingreso.equalsIgnoreCase("TORG")) {
            Globales.alcalde.sumPlata(1000000);
        }
        return ingreso;
    }
}
