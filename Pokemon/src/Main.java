import comidas.Comida;
import utilidades.Utiles;

public class Main {

    private Juego juego = new Juego();
    private Tienda tienda = new Tienda();
    private Usuario usuario;
    public static void main(String[] args) {
        new Main().iniciar();
    }

    private void iniciar() {
        System.out.println("Bienvenido al fichin. Cree su usuario ingresando su nombre");
        usuario = new Usuario(Utiles.ingresarString());
        boolean salir = false;
        do {
            System.out.println("Dinero: " + usuario.getMonedas() + usuario.getMascota().getEstado());
            System.out.println(" 1)- Jugar \n 2)- Tienda \n 3)- Comer \n 4)- Bañar \n 5) Salir");
            int op = Utiles.ingresarInt(1, 5);
            switch (op) {
                case 1:
                    juego.mostrarJuegos(usuario);
                    break;
                case 2:
                    tienda.mostrarTienda(usuario);
                    break;
                case 3:
                    comer();
                    break;
                case 4:
                    bañar();
                    break;
                case 5:
                    salir = true;
                    System.out.println("Chau ");
                    break;
            }
        }while(!salir);

    }
    public void bañar( ){
        usuario.getMascota().modificarSuciedad(-10);
    }
    public void comer(){
        int i = 0;
        System.out.println("Elija con que quiere alimentar a su mnascota");
        for(Comida comida : usuario.getInventario()){
            System.out.println((i+1) + "- Nombre: " + comida.getNombre() + " Energia que restaura: " + comida.getResVida() + " Precio: " + comida.getPrecio());
            i++;
        }
        int morfi = Utiles.ingresarInt(1,i+1)-1;
        usuario.getMascota().modificarEnergia(usuario.getInventario().get(morfi).getResVida());
        usuario.eliminarObjeto(usuario.getInventario().get(morfi));
    }
}