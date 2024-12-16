import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int op = 0;
        float peso = 0.0f, altura = 0.0f, masaCorporal=0.0f;

        System.out.println("ingresar el la forma que prefieres dependiendo de tu IQ:\n");
        System.out.println("1)  peso en libras y altura en pulgadas");
        System.out.println("2)  peso en kilogramos y altura en metros");
        op = sc.nextInt();

        System.out.println("ingresa tu peso: ");
        peso = sc.nextFloat();

        System.out.println("ingrese su altura: ");
        altura = sc.nextFloat();

        switch (op){
            case 1:
                masaCorporal = (peso * 703)/(altura * altura);
                break;
            case 2:
                masaCorporal = peso /(altura * altura);
                break;
            default:
                break;
        }
        if(masaCorporal<=18.5){
            System.out.println("flaco");
        }
        else if((masaCorporal>=18.5) && (masaCorporal<=24.9)){
            System.out.println("estas normal");
        }
        else if((masaCorporal>=25) && (masaCorporal<=29.9)){
            System.out.println("un gordo");
        }
        else if(masaCorporal>=30){
            System.out.println("un puto yate");
        }
    }
}