package app;

public class Oferta {

    private final boolean temporada;

    public Oferta(boolean temporada) {
        this.temporada = temporada;
    }

    public Boolean hayOferta() {
        // Evalua la temporada. Si en caso se encuentren en temporada de ofertas, devuelve true
        return true;
    }
}