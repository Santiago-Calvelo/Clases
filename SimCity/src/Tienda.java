import java.util.ArrayList;

public class Tienda {
    private ArrayList<String> tipos = new ArrayList<>() ;
    private String [][] tienda =
    {//Nombre - Tipo - Seguridad - Prev Incendios - Felicidad - Precio
        {"Rascascielos","Maravilla","0","0","10","900000"},
        {"Torre Eiffel","Maravilla","0","0","10","850000"},
        {"Arco del triunfo","Maravilla","0","0","9","700000"},
        {"Pirámide","Maravilla","0","0","9","600000"},
        {"Obelisco","Maravilla","0","0","8","450000"},
        {"Planta de energía eólica","Planta energética","0","0","10","500000"},
        {"Planta de energía solar","Planta energética","0","0","9","400000"},
        {"Planta de energía hidroeléctrica","Planta energética","0","0","8","300000"},
        {"Planta de energía de carbón","Planta energética","0","0","4","150000"},
        {"Empresa de agua corriente","Planta de agua","0","0","10","750000"},
        {"Obras de cañerias para agua potable","Planta de agua","0","0","9","500000"},
        {"Tanques de agua por manzana","Planta de agua","0","10","9","350000"},
        {"Pozos de agua","Planta de agua","0","0","7","200000"},
        {"Mega estación de policía","Seguridad","10","0","10","400000"},
        {"Estación de polocía grande","Seguridad","9","0","9","300000"},
        {"Estación de policía mediana","Seguridad","7","0","5","200000"},
        {"Estación de polocía chica","Seguridad","5","0","2","100000"},
        {"Mega estación de bomberos","Incendios","0","10","10","450000"},
        {"Estación de bomberos grande","Incendios","0","8","8","350000"},
        {"Estación de bomberos mediana","Incendios","0","7","6","250000"},
        {"Estación de bomberos chica","Incendios","0","6","5","150000"},
        {"Rutas","Caminos","0","0","10","400000"},
        {"Autopistas","Caminos","0","0","9","300000"},
        {"Avenidas","Caminos","0","0","8","200000"},
        {"Calles de asfalto","Caminos","0","0","6","150000"},
        {"Calles de tierra","Caminos","0","0","1","50000"},
        {"Reserva natural","Ecología","0","0","10","500000"},
        {"Parque polideportivo","Ecología","0","0","9","300000"},
        {"Parque grande","Ecología","0","0","8","200000"},
        {"Plaza","Ecología","0","0","7","100000"}
    };

    private void mostrarTienda(){
        System.out.println(" Elija que comprar: ");
        for (int i = 0; i < tienda.length; i++){
            System.out.print((i+1) + "- ");
            for (int j = 0; j < tienda[i].length; j++){
                System.out.print(tienda[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void comprar(Alcalde alcalde){
        boolean error = false;
      do {
        do {
            error = false;
            mostrarTienda();
            System.out.println(alcalde.getPlata());
            int op = Utiles.ingresarInt(1 , 30) - 1;
            Edificio edificio = new Edificio(tienda[op][0],tienda[op][1], Integer.parseInt(tienda[op][2]), Integer.parseInt(tienda[op][3]) ,Integer.parseInt(tienda[op][4]), Integer.parseInt(tienda[op][5]));
            if (alcalde.getPlata() >= edificio.getPrecio()) {
                if (alcalde.late(edificio.getTipo())) {
                    error = true;
                    System.out.println("Ya tenes un edificio de este tipo");
                }
                else {
                    tipos.add(edificio.getTipo());
                    alcalde.sumPlata( - edificio.getPrecio());
                    alcalde.obtenerEdificio(edificio);
                }
            }

        } while(error);
      }while (!isFull());

    }

    private boolean isFull() {
        boolean isFull = false;
        if (tipos.size() == 5) {
            isFull = true;
        }
        return  isFull;
    }
}
