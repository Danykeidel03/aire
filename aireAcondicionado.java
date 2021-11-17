public class aireAcondicionado {

    double temperatura;

    public aireAcondicionado() {
        temperatura = 15;
    }

    /**
     * subir temperatura
     */
    public void subirTemperatura() {
        temperatura = temperatura + 5;
    }
    
    /**
     * bajar temperatura
     */
    public void bajarTemperatura() {
        temperatura = temperatura - 5;
    }
    
    /**
     * Devuelve la temperatura
     */
    public double getTemperatura() {
        return temperatura;
    }
} 