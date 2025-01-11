import java.util.ArrayList;

public class Ciudad {
    private String nombre;
    private ArrayList<Edificio> edificios = new ArrayList<>() ;

    public Ciudad(String nomCiudad) {
        this.nombre = nomCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void almacenarEdificio(Edificio edificio) {
        edificios.add(edificio);
    }

    public boolean late(String tipo) {
        boolean existe = false;

        for(Edificio edificio : edificios) {
            if(edificio.getTipo().equalsIgnoreCase(tipo)) {
                existe = true;
            }
        }
        return existe;
    }

    public ArrayList<Edificio> getEdificios() {
        return edificios;
    }
}
