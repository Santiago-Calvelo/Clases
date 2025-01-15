package ataque;

public abstract class Ataque {


    private int daño, pro;
    private Efectos efectos;
    private  String nombre;

    public Ataque(int daño, int pro, Efectos efectos,String nombre) {
        this.daño = daño;
        this.pro = pro;
        this.efectos = efectos;
        this.nombre = nombre;
    }

    public int getDaño() {
        return daño;
    }

    public int getPro() {
        return pro;
    }

    public Efectos getEfectos() {
        return efectos;
    }

    public String getNombre() {
        return nombre;
    }
}
