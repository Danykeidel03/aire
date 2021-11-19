public class AireAcondicionado {

    double temperatura;
    double max;
    double min;
    double incremento;
    int cambio;
    double maximo;
    double minimo;
    public AireAcondicionado(double newMax, double newMin) {
        temperatura = 15;
        incremento = 5.0;
        max = newMax;
        min = newMin;
        cambio = 0;
        maximo = temperatura;
        minimo = temperatura;
    }

    /**
     * subir temperatura
     */
    public void subirTemperatura() {
        if ((temperatura + incremento)<= max) {
            temperatura = temperatura + incremento;
            cambio = cambio + 1;
            maximo = maximo + incremento;
        }
    }

    /**
     * bajar temperatura
     */
    public void bajarTemperatura() {
        if ((temperatura - incremento)>= min) {
            temperatura = temperatura - incremento;
            cambio = cambio + 1;
            minimo = minimo - incremento;
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

    /**
     * estadisticas
     */
    public void mostrarEstadisticas() {
        System.out.println("Temperatura actual:" + temperatura + "º" + "-" + "Temperatura maxima posible:" + max + "º" + "-" + "Temperatura minima posible:" + min + "º" + "-" + "temperatura maxima seleccionada:" + maximo + "º" + "-" + "temperatura minima seleccionada:" + minimo + "º" + "-" + "Cambios realizados:" + cambio);

    }

    /**
     * Devuelve las estadisticas
     */
    public String getEstadisticas() {
        String estadisticas = "Temperatura actual:" + temperatura + "º" + "-" + "Temperatura maxima posible:" + max + "º" + "-" + "Temperatura minima posible:" + min + "º" + "-" + "temperatura maxima seleccionada:" + maximo + "º" + "-" + "temperatura minima seleccionada:" + minimo + "º" + "-" + "Cambios realizados:" + cambio; 
        return estadisticas;
    }

} 