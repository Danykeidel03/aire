public class AireAcondicionado {

    double temperatura;
    double max;
    double min;
    double incremento;

    public AireAcondicionado(double newMax, double newMin) {
        temperatura = 15;
        incremento = 5.0;
        max = newMax;
        min = newMin;
    }

    /**
     * subir temperatura
     */
    public void subirTemperatura() {
        if (temperatura == max) {
            temperatura = max; 
        }
        temperatura = temperatura + 5;
    }
    
    /**
     * bajar temperatura
     */
    public void bajarTemperatura() {
        if (temperatura == min) {
            temperatura = min; 
        }
        temperatura = temperatura - 5;
    }
    
    /**
     * incremento
     */
    public void setIncremento( double cambioIncremento ) {
        incremento = cambioIncremento;
    }
    
    /**
     * Devuelve la temperatura
     */
    public double getTemperatura() {
        return temperatura;
    }
} 