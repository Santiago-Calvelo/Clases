import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int [3];
        Scanner sc = new Scanner(System.in);
        int numMin = 0;


       // Integer.max(numeros[0],Integer.max(numeros[1],numeros[2]));
        int numMax=-1;
        int suma = 0;
        float promedio = 0;
        int producto = 1;

        for(int i=0;i<3;i++) {
            System.out.println("Ingrese un numero");
            numeros[i] = sc.nextInt();
            if(numeros[i] < numMin || i==0) {
                numMin=numeros[i];
            }
            if(numeros[i] > numMax || i==0) {
                numMax=numeros[i];
            }

            suma += numeros[i];
            producto *= numeros[i];
        }

        sc.nextLine();
        System.out.println("El resultado de la suma es de " + suma);

        promedio = (float) suma / numeros.length;
        System.out.println("El promedio de los 3 numeros es " + promedio);
        System.out.println("El producto es de" + producto);
        System.out.println("El numero mas pequeño es " + numMin);
        System.out.println("El numero mas grande es " + numMax);

    }
}