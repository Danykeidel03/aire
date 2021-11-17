public class aire {

    float temperatura;

    public aire() {
        temperatura = 15;
    }

    /**
     * subir temperatura
     */
    public float subirTemperatura() {
        temperatura = temperatura + 5;
        return temperatura;
    }
    
    /**
     * bajar temperatura
     */
    public float bajarTemperatura() {
        temperatura = temperatura - 5;
        return temperatura;
    }
    
    /**
     * Devuelve la temperatura
     */
    public float getTemperatura() {
        return temperatura;
    }
} 