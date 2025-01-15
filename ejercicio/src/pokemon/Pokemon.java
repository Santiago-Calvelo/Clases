package pokemon;

import ataque.Ataque;

public abstract class Pokemon {
    private int vida, defensa, velocidad;
    private String nombre;
    private Ataque[] ataques;

    public Pokemon(int vida, int defensa, int velocidad, String nombre,Ataque[] ataques){
        this.vida = vida;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.nombre = nombre;
        this.ataques = ataques;
    }

    public void restarVida(int vida){
        this.vida -= vida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public Ataque[] getAtaques() {
        return ataques;
    }
}

