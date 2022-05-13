import lcde.ListaCircularDoblementeEnlazada;
import lcse.ListaCircularSimplementeEnlazada;
import lse.ListasDoblementeEnlazada;
import lde.ListaSimplementeEnlazada;
public class Main {
    public static void main(String[] args) {

       // ListaSimplementeEnlazada listaSimplementeEnlazada = new ListaSimplementeEnlazada();
       // System.out.println(listaSimplementeEnlazada.estaVacia());

        //insertar elementos a nuestra lista
       // listaSimplementeEnlazada.insertar(5);
       // listaSimplementeEnlazada.insertar(4);
       // listaSimplementeEnlazada.insertar(3);
       //listaSimplementeEnlazada.insertar(2);
        //listaSimplementeEnlazada.insertar(1);
        //listaSimplementeEnlazada.insertar(0);


        //mostrar nuestra lista
       // listaSimplementeEnlazada.mostrar();

        //eliminar algunos elementos
       // listaSimplementeEnlazada.eliminar();
       // listaSimplementeEnlazada.eliminar();

        //mostrar nuestra lista
       // listaSimplementeEnlazada.mostrar();





        // ListasDoblementeEnlazada listasDoblementeEnlazada = new ListasDoblementeEnlazada();
        // System.out.println(listasDoblementeEnlazada.estaVacia());

        //  for (int i = 20; i > 0; i--){
        //     listasDoblementeEnlazada.insertar(i);
        //  }

        // System.out.println(listasDoblementeEnlazada.estaVacia());
        // listasDoblementeEnlazada.mostrarAdelante();

        //  listasDoblementeEnlazada.eliminar();
        //  listasDoblementeEnlazada.eliminar();

        // listasDoblementeEnlazada.mostrarAdelante();
        //  listasDoblementeEnlazada.mostrarAtras();



        

     //   ListaCircularSimplementeEnlazada listaCircularSimplementeEnlazada = new ListaCircularSimplementeEnlazada();
     //   System.out.println(listaCircularSimplementeEnlazada.estaVacia());
     //   System.out.println(listaCircularSimplementeEnlazada.tamaño());

      //  for (int i = 1; i <= 12; i++) {
       // listaCircularSimplementeEnlazada.insertarFin(i);
      //  }

       // listaCircularSimplementeEnlazada.mostrar();
      //  System.out.println(listaCircularSimplementeEnlazada.tamaño());

       // listaCircularSimplementeEnlazada.eliminarFin();
       // listaCircularSimplementeEnlazada.eliminarFin();

       // listaCircularSimplementeEnlazada.mostrar();


       // listaCircularSimplementeEnlazada.mostrarCircular(2);



        ListaCircularDoblementeEnlazada listaCircularDoblementeEnlazada = new ListaCircularDoblementeEnlazada();

        System.out.println(listaCircularDoblementeEnlazada.estaVacia());
      for (int i = 1; i <= 5; i++){
            listaCircularDoblementeEnlazada.insertarFinal(i);
        }
      listaCircularDoblementeEnlazada.mostrar();

       listaCircularDoblementeEnlazada.eliminarFinal();
        listaCircularDoblementeEnlazada.eliminarFinal();
        listaCircularDoblementeEnlazada.mostrar();


        listaCircularDoblementeEnlazada.mostrarAdelante(8);
        listaCircularDoblementeEnlazada.mostrarAtras(8);


    }
}

