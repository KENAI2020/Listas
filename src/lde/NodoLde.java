package lde;


public class NodoLde {
    private Object dato;
    private NodoLde siguiente;

    public NodoLde(Object dato, NodoLde siguiente) {
        this.setDato(dato);
        this.setSiguiente(siguiente);
    }


    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoLde getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLde siguiente) {
        this.siguiente = siguiente;
    }
}
