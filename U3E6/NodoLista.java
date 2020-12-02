package u3e6;
class NodoLista {
    int dato;
    NodoLista siguiente;

    public NodoLista(int dato, NodoLista n) {
        this.dato = dato;
        this.siguiente = n;
    }

    public NodoLista(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }   
}
