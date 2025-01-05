import comidas.Comida;
import comidas.Comidas;
import utilidades.Utiles;

public class Tienda {
    private Comida[] comidas = new Comida[3];

    public Tienda(){
        generarItems();
    }

    public void mostrarTienda(Usuario usuario) {
        System.out.println("Bienvenido en la tienda");
        System.out.println("Dinero: " + usuario.getMonedas());
        for(int i=0; i<comidas.length; i++){
            System.out.println((i+1) + "- Nombre: " + comidas[i].getNombre() + " Energia que restaura: " + comidas[i].getResVida() + " Precio: " + comidas[i].getPrecio());

        }
        System.out.println("elije una opcion");
        int op = Utiles.ingresarInt(1 , 3)-1;

        usuario.agregarComida(comidas[op]);
        usuario.agregarMonedas(-comidas[op].getPrecio());
    }

    private void generarItems() {
        int i = 0;
        for (Comidas comida : Comidas.values()) {
            comidas[i] = comida.getComida();
            i++;
        }
    }
}
