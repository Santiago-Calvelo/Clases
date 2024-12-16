import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int numMin = 0;
        int numMax = 0;
        for(int i = 0; i < numeros.length ; i++) {
            System.out.println("Ingrese el numero " + i);
            numeros[i] = sc.nextInt();

            if(numMax < numeros[i] || i == 0) {
                numMax = numeros[i];
            }

            if (numMin > numeros[i] || i == 0) {
                numMin = numeros[i];
            }
        }

        System.out.println("Max: " + numMax);
        System.out.println("Min: " + numMin);
    }
}