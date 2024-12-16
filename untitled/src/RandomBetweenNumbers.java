import java.util.Random;
import java.util.Scanner;

public class RandomBetweenNumbers {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Random r = new Random();
        int min = 1;
        int max = 1000;
        int i = 0;
        String op;
        boolean encontrado = false;

        do {
            int mid = min + (max - min) / 2;
            System.out.println(mid);
            System.out.println("ingrese > si es menor\ningrese < si es mayor\ningrese = si lo encontre\n");
            op = sc.nextLine();

            switch (op) {
                case "<":
                    min = mid + 1;
                    break;
                case ">":
                    max = mid -1;
                    break;
                case "=":
                    encontrado=true;
                    break;
                default:
                    break;
            }
            if(min > max){
                System.out.println("puto");
                encontrado=true;
            }
            i++;
        }while(i < 10 && !encontrado);
    }
}