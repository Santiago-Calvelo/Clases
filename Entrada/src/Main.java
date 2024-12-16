import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = ingresarEntero();

        System.out.println(n);
    }

    private static int ingresarEntero() {
        boolean error;
        int n = 0;
        do {
            error = false;
            try {
                System.out.println("Ingrese un entero");
                n = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Dato mal ingresado");
                error = true;
                sc.nextLine();
            }
        } while (error);

        return n;
    }
}