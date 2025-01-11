public class Alcalde {
    private String nombreAP;
    private Ciudad ciudad;
    private int plata = 1000000;

    public Alcalde(String nombreAP, String nomCiudad) {
        this.ciudad = new Ciudad(nomCiudad);
        this.nombreAP = nombreAP;
    }

    public void obtenerEdificio(Edificio edificio) {
        this.ciudad.almacenarEdificio(edificio);
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public String getNombreAP() {
        return nombreAP;
    }

    public boolean late(String tipo) {
        return this.ciudad.late(tipo);
    }

    public int getPlata() {
        return plata;
    }

    public void sumPlata(int plata) {
        this.plata += plata;
    }

}
