package comidas;

public class Comida {
    private String nombre;
    private int resVida;
    private int precio;

    public Comida(String nombre, int resVida, int precio) {
        this.nombre = nombre;
        this.resVida = resVida;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getResVida() {
        return resVida;
    }

    public int getPrecio() {
        return precio;
    }
}
