import java.util.Scanner;//hook para traer los scanners

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//declarar el scaner

        int[] numeros = new int[2];//array para almacenar los numeros
        for (int i = 0; i < numeros.length; i++)//bucle para recibir los numeros y almacenarlos
        {

            System.out.println("Ingrese el numero numero " + i);
            numeros[i] = sc.nextInt();
        }
        sc.nextLine();
        int sum = 0;
        int prod = 1;

        for (int numero : numeros) {
            sum += numero;
            prod *= numero;
        }


        System.out.println("La suma de los dos numeros es de " + sum);
        System.out.println("El producto de los numeros ingresados es de " + prod);

        int diferencia;

        diferencia = numeros[0] - numeros[1];
        if (diferencia < 0) {
            diferencia *= -1;
        }

        System.out.println("La diferencia entre ambos numeros es de " + diferencia);

        System.out.println("¿Desea usted dividir el primero numero por el segundo?");

        String  respuesta = sc.nextLine();

        float cociente;
        float resto;

        if (respuesta.equalsIgnoreCase("SI")) {
            cociente = (float) numeros[0] / numeros[1];
            System.out.println("El cociente de la division del primer numero por el segundo es " + cociente);
            resto = (float) numeros[0] % numeros[1];
            System.out.println("Y el resto es de " + resto);
        } else {
            cociente=(float)numeros[1]/numeros[0];
            System.out.println("El cociente de la division del segundo numero por el primer es " + cociente);
            resto=(float)numeros[1]%numeros[0];
            System.out.println("Y el resto es de " + resto);
        }
    }
}