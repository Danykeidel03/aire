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
        if ((temperatura + incremento)> max) {
            temperatura = temperatura;
        }
        else{
        temperatura = temperatura + incremento;
        }
        
    }
    
    /**
     * bajar temperatura
     */
    public void bajarTemperatura() {
        if ((temperatura - incremento)< min) {
            temperatura = temperatura; 
        }
        else{
        temperatura = temperatura - incremento;
        }
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