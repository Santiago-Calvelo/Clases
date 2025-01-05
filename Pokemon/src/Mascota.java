public class Mascota {
    private int vida = 100;
    private int energia = 100;
    private int suciedad = 0;

    public void modificarEnergia(int energia){
        this.energia+=energia;
    }
    public void modificarSuciedad(int suciedad){
        this.suciedad+=suciedad;
    }

    public int getEnergia() {
        return energia;
    }

    public int getVida() {
        return vida;
    }

    public int getSuciedad() {
        return suciedad;
    }

    public String getEstado() {
        return "Energia: " + this.energia + " Vida: " + this.vida + " Suciedad: " + this.suciedad;
    }
}
