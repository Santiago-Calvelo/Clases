public class Edificio {
    String nombre;
    String tipo;
    int seguridad;
    int prevIncendios;
    int felicidad;
    int precio;

    public Edificio(String nombre, String tipo, int seguridad, int prevIncendios, int felicidad, int precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.seguridad = seguridad;
        this.prevIncendios = prevIncendios;
        this.felicidad = felicidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getSeguridad() {
        return seguridad;
    }

    public int getPrevIncendios() {
        return prevIncendios;
    }

    public int getFelicidad() {
        return felicidad;
    }

    public int getPrecio() {
        return precio;
    }
}
