package lse;

public class NodoLse {
    private NodoLse anterior;
    private Object dato;
    private NodoLse siguiente;

    public NodoLse(NodoLse anterior, Object dato, NodoLse siguiente) {
        this.setAnterior(anterior);
        this.setDato(dato);
        this.setSiguiente(siguiente);
    }

    public NodoLse getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoLse anterior) {
        this.anterior = anterior;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoLse getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLse siguiente) {
        this.siguiente = siguiente;
    }
}
