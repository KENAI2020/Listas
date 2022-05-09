package lse;

public class ListasDoblementeEnlazada {
    NodoLse inicio;

    public ListasDoblementeEnlazada(){
        inicio = null;
    }

    public boolean estaVacia(){
        return inicio == null;
    }

    public void insertar(Object dato){
        if (estaVacia()){
            NodoLse nuevo = new NodoLse(null, dato, null);
            inicio = nuevo;
        }else {
            NodoLse nuevo = new NodoLse(null, dato, inicio);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    }

    public void eliminar(){
        if (!estaVacia()){
            if (inicio.getSiguiente() ==null){
                inicio = inicio.getSiguiente();
            }else{
                inicio = inicio.getSiguiente();
                inicio.setAnterior(null);
            }
        }
    }

    public void mostrarAdelante(){
        if (!estaVacia()){
            NodoLse temp = inicio;
            while (temp != null){
                System.out.println(temp.getDato() +"     ");

                temp = temp.getSiguiente();
            }
            System.out.println();
        }
    }

    public void mostrarAtras(){
        if (!estaVacia()){
            NodoLse ultimo = inicio;
            while (ultimo.getSiguiente() != null){
                ultimo = ultimo.getSiguiente();
            }

            NodoLse temp = ultimo;
            while (temp != null){
                System.out.println(temp.getDato() + "       ");

                temp = temp.getAnterior();
            }
            System.out.println();
        }
    }
}

