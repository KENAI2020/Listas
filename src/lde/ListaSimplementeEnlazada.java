package lde;

public class ListaSimplementeEnlazada {
    NodoLde primero;
    public ListaSimplementeEnlazada(){
        primero = null;
    }

    public boolean estaVacia(){
        return primero == null;
    }

    public void insertar(Object dato){
        if(estaVacia()){
            NodoLde nuevo = new NodoLde(dato,  null);
            primero = nuevo;
        }else {
            NodoLde nuevo = new NodoLde(dato, primero);
            primero = nuevo;
        }
    }

    public void eliminar(){
        if (!estaVacia()){
            primero = primero.getSiguiente();
        }
    }

    public void mostrar(){
        NodoLde tmp = primero;
        while (tmp != null){
            System.out.println(tmp.getDato() + "    ");

            tmp = tmp.getSiguiente();
        }
        System.out.println();
    }
}

