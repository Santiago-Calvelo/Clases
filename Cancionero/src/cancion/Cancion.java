package cancion;

public class Cancion {
    private int duracion;
    private String nombre;
    private String artista;
    private int peso;

    public Cancion(int duracion, String nombre, String artista, int peso) {
        this.duracion = duracion;
        this.nombre = nombre;
        this.artista = artista;
        this.peso = peso;
    }

    public String getDatos() {
        return "duracion: " + duracion + " nombre: " + nombre + " artista: " + artista + " peso kb: " + peso;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getArtista() {
        return artista;
    }

    public int getPeso() {
        return peso;
    }
}


