package utilidades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utiles {
    private static Scanner sc = new Scanner(System.in);

    public static int ingresarInt(int min, int max) {
        int nro = 0;
        boolean error;

        do {
            error = false;

            try {
                nro = sc.nextInt();
                sc.nextLine();
                if (nro > max || nro < min) {
                    error = true;
                    System.out.println("El numero debe estar entre " + min + " y " + max);
                }
            } catch (InputMismatchException e) {
                System.out.println("Tipo de dato mal ingresado");
                error = true;
                sc.nextLine();
            }
        } while(error);

        return nro;
    }

    public static String ingresarString() {
        return sc.nextLine();
    }
}
