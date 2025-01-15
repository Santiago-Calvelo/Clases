import pokemon.Pokemon;

public class Jugador {

    private String nombre;
    private Pokemon pokemon;


    public Jugador(String nombre,Pokemon pokemon) {
        this.nombre = nombre;
        this.pokemon = pokemon;
    }

    public String getNombre() {
        return nombre;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }
}
