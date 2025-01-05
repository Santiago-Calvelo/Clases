import utilidades.Utiles;
public class Juego {
    public void mostrarJuegos(Usuario usuario){
        boolean salir = false;
        int op;
        do {
            System.out.println("1) Piedra Papel o Tijera");
            System.out.println("2) Cara o Cruz");
            System.out.println("3) salir");
            op=Utiles.ingresarInt(1,3);

            switch (op){
                case 1:
                    jugarPPT(usuario);
                    break;
                case 2:
                    jugarCC(usuario);
                    break;
                case 3:
                    salir = true;
                    break;
            }
        } while(!salir);
    }

    private void jugarCC(Usuario usuario) {
        int jop;
        int moneda=Utiles.generarAleatorio(1,2);
        System.out.println("1)cara");
        System.out.println("2)cruz");
        jop=Utiles.ingresarInt(1,2);
        if(jop==moneda){
            System.out.println("ganaste");
            usuario.agregarMonedas(2);
        }
        else{
            System.out.println("perdiste");
        }
        usuario.getMascota().modificarEnergia(-2);
        usuario.getMascota().modificarSuciedad(Utiles.generarAleatorio(1,20));
    }

    private void jugarPPT(Usuario usuario){
        int jop;
        int mop=Utiles.generarAleatorio(1,3);
        System.out.println("1)piedra");
        System.out.println("2)papel");
        System.out.println("3)tijera");
        jop=Utiles.ingresarInt(1,3);

        int resultado = (jop-mop+3) % 3;
        switch (resultado){
            case 0:
                System.out.println("empate");
                break;
            case 1:
                System.out.println("ganaste");
                usuario.agregarMonedas(4);
                break;
            case 2:
                System.out.println("perdiste XD");
                break;
        }
        usuario.getMascota().modificarEnergia(-4);
        usuario.getMascota().modificarSuciedad(Utiles.generarAleatorio(1,20));
    }

}
