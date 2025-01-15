import Utiles.Utiles;
import ataque.Ataque;
import pokemon.Charmander;
import pokemon.Pokemon;
import pokemon.Squirtle;

import java.util.ArrayList;

public class Main {
    private Jugador[] jugadores = new Jugador[2];
    private ArrayList<Pokemon> pokemones = new ArrayList<>();

    public static void main(String[] args) {
        new Main().iniciar();




    }

    private void iniciar(){
        pokemones.add(new Squirtle());
        pokemones.add(new Charmander());

        for (int i = 0; i < jugadores.length; i++) {
            System.out.println("Bienvenido jugador " + (i+1) + " ingrese su nombre : ");
            jugadores[i] = new Jugador(Utiles.ingresarString(),elegir());
        }
        pelear();
    }

    private Pokemon elegir(){
        int eleccion = 0;
      /*  Pokemon[] pokemones = {
                new Squirtle(), new Charmander()
        };*/


        System.out.println("elija un pokemon");
        for (int i = 0; i < pokemones.size(); i++) {
            System.out.println((i+1)+ "- " + pokemones.get(i).getNombre());
        }
        eleccion = Utiles.ingresarInt(1,pokemones.size())-1;
        Pokemon temporal = pokemones.get(eleccion);
        pokemones.remove(eleccion);

        return temporal;

    }

    private void pelear(){
        boolean muelto = false;

        do {
            Ataque ataque1 = null, ataque2 = null;

            for (int i = 0; i < jugadores.length; i++) {
                System.out.println("Elija jugador "+ jugadores[i].getNombre());
                for (int j = 0; j < jugadores[i].getPokemon().getAtaques().length; j++) {
                    System.out.println((j+1)+"- " + jugadores[i].getPokemon().getAtaques()[j].getNombre());
                }
                int opcion = Utiles.ingresarInt(1,jugadores[i].getPokemon().getAtaques().length)-1;
                if (i== 0){
                    ataque1 = jugadores[i].getPokemon().getAtaques()[opcion];

                }else {
                   ataque2 = jugadores[i].getPokemon().getAtaques()[opcion];
                }
            }
            if (jugadores[0].getPokemon().getVelocidad()<jugadores[1].getPokemon().getVelocidad()){
                muelto = atacar(1,ataque2);
                muelto = atacar(0,ataque1);
            } else {
                muelto = atacar(0,ataque1);
                muelto = atacar(1,ataque2);
            }

        } while(!muelto);

    }

    private boolean atacar(int indice, Ataque ataque) {
        boolean muerto = false;
        int indiceRival = obtenerRival(indice);

        if (Utiles.generarAleatorio(0,100) <= ataque.getPro()){
            System.out.println("El " + jugadores[indice].getPokemon().getNombre() + " de " + jugadores[indice].getNombre() + " usa " + ataque.getNombre());
            jugadores[indiceRival].getPokemon().restarVida(ataque.getDaño());
            System.out.println("Vida del pokemon rival: " + jugadores[indiceRival].getPokemon().getVida());
            if (jugadores[indiceRival].getPokemon().getVida()<=0){
                muerto = true;
                System.out.println("Gano " + jugadores[indice].getNombre());
            }
        } else {
            System.out.println("Falla al atacar");
        }


        return muerto;
    }

    private int obtenerRival(int indice){
        return (indice == 0) ? 1:0;
    }
}