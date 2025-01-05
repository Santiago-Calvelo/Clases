import cancion.Cancion;
import utilidades.Utiles;

import java.util.ArrayList;


public class Main {
    private ArrayList<Cancion> canciones = new ArrayList<>();

    public static void main(String[] args) {
        new Main().iniciar();
    }

    private void iniciar() {
        imprimirMenu();
    }

    private void imprimirMenu() {
       boolean repeat = true;
       int op;
        do{
            System.out.println("1) Ingresar cancion");
            System.out.println("2) Buscar cancion ");
            System.out.println("3) Mostrar canciones");
            System.out.println("4) Salir");
            op = Utiles.ingresarInt(1, 4);
            switch (op){
                case 1 :
                    ingresarCancion();
                    break;
                case 2 :
                    buscarCancion();
                    break;
                case 3 :
                    imprimirCanciones();
                    break;
                case 4 :
                    repeat = false;
                    break;
            }
        }while(repeat);
    }

    private void ingresarCancion() {
        System.out.println("Ingrese el nombre de la cancion");
        String nombre = Utiles.ingresarString();
        System.out.println("Ingrese el nombre del artrista");
        String artista = Utiles.ingresarString();
        System.out.println("Ingrese la duraciin en minutos de la cancion");
        int duracion = Utiles.ingresarInt(1 , 20);
        System.out.println("Ingrese el peso en kb");
        int peso = Utiles.ingresarInt(1 , 1024);

        Cancion c = new Cancion(duracion, nombre, artista, peso);
        canciones.add(c);
    }

    private void buscarCancion() {
        System.out.println("Ingrese nombre de la cancion o del artista");
        String rta = Utiles.ingresarString();

        for(Cancion cancion : canciones) {
            if(rta.equalsIgnoreCase(cancion.getArtista()) || rta.equalsIgnoreCase(cancion.getNombre())){
                System.out.println(cancion.getDatos());
            }

        }
    }

    private void imprimirCanciones() {
        for(Cancion cancion : canciones) {
                System.out.println(cancion.getDatos());
        }
    }
}