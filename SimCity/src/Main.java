public class Main {
    private Tienda tienda = new Tienda();
    public static void main(String[] args) {
        new Main().iniciar();


    }

    private void iniciar() {
        System.out.println("Bienvenido papa crea tu pj");
        System.out.println("Ingrese su nombre");
        String nombre = Utiles.ingresarString();
        System.out.println("Ingrese el nombre de su ciudad");
        String ciudad = Utiles.ingresarString();
        Globales.alcalde = new Alcalde(nombre, ciudad);


        tienda.comprar(Globales.alcalde);
        System.out.println(Globales.alcalde.getNombreAP() + " " + Globales.alcalde.getCiudad().getNombre());

        int i = 0;
        int min = 0;
        int max = 0;
        int imax = 0;
        int imin = 0;
        for(Edificio edificio : Globales.alcalde.getCiudad().getEdificios()){
            System.out.println((i+1) + "- " + edificio.getNombre() + " " + edificio.getTipo() + " " + edificio.getSeguridad() + " " + edificio.getPrevIncendios() + " " + edificio.getFelicidad());
            if (i==0 || max <edificio.getPrecio()){
               max=  edificio.getPrecio();
               imax = i;
            }
            if (i==0 || min >edificio.getPrecio()){
                min=  edificio.getPrecio();
                imin = i;
            }
            i++;
        }
        System.out.println("max : " + Globales.alcalde.getCiudad().getEdificios().get(imax).getNombre() + " "+ Globales.alcalde.getCiudad().getEdificios().get(imax).getPrecio());
        System.out.println("min : " + Globales.alcalde.getCiudad().getEdificios().get(imin).getNombre() + " "+ Globales.alcalde.getCiudad().getEdificios().get(imin).getPrecio());
    }
}