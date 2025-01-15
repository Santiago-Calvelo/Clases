package pokemon;

import ataque.*;

public class Charmander extends Pokemon{


    public Charmander() {
        super(100,50,200,"Charmander", new Ataque[]{
                new Paralisis(), new Llamarada(), new Arañazo(), new Placaje()
        });
    }

}
