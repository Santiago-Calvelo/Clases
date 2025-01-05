package comidas;

public enum Comidas {
    PANCHO("Pancho", 10, 5),
    PIZZA("Pizza", 20, 10),
    MATE("Mate", 100, 50);

    private String nombre;
    private int resVida;
    private int precio;
    Comidas(String nombre, int resVida, int precio) {
        this.nombre = nombre;
        this.resVida = resVida;
        this.precio = precio;
    }

    public Comida getComida() {
        return new Comida(nombre, resVida, precio);
    }
}
