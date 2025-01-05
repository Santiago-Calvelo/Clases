import comidas.Comida;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private int monedas = 100;
    private Mascota mascota = new Mascota();
    private ArrayList<Comida> inventario = new ArrayList<>();

    public Usuario(String nombre){
        this.nombre =  nombre;
    }

    public void agregarMonedas(int cantidad){
        this.monedas+=cantidad;
    }

    public void agregarComida(Comida comida) {
        inventario.add(comida);
    }

    public String getNombre() {
        return nombre;
    }

    public int getMonedas() {
        return monedas;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public ArrayList<Comida> getInventario() {
        return inventario;
    }

    public void eliminarObjeto(Comida comida) {
        inventario.remove(comida);
    }
}
