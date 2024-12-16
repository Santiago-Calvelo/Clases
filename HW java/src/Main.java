import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre ");

        String nombre = sc.nextLine();

        System.out.println("El nombre ingresado es " + nombre);

        System.out.println("Ingrese su apeliido ");

        String apellido = sc.nextLine();

        System.out.println("El apellido ingresado es " + apellido + " \nY el nombre completo es " + nombre +" " + apellido);

    }
}