package pokemon;

import ataque.*;

public class Squirtle extends Pokemon{


    public Squirtle() {
        super(150,35,180,"Squirtle", new Ataque[]{
                new Pistola(), new Somnifero(), new Arañazo(), new Placaje()
        });
    }
}
