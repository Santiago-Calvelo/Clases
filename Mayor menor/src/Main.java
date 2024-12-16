import java.net.Inet4Address;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[2];
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese el numero numero " + (i + 1));
            numeros[i] = sc.nextInt();
        }

        /*for (int numero : numeros) {
            if (max < numero) {
                max = numero;
            }
        }*/

        if(numeros[0]>numeros[1])
        {
            System.out.println("El primer numero es mayor");
        } else if (numeros[0]==numeros[1])
        {
            System.out.println("El primer numero es igual al segundo");
        }
        else {
            System.out.println("El segundo numero es mayor al primero");
        }
    }
}