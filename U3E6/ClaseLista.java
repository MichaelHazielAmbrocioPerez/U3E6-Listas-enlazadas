package u3e6;
class ClaseLista {

    NodoLista inicio, fin;

    public ClaseLista() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean EstaVacia() {
        return inicio == null;
    }

    public void InsertarAlInicio(int d) {
        inicio = new NodoLista(d, inicio);
        if (fin == null) {
            fin = inicio;
        }
    }

    public void InsertarAlFinal(int d) {
        if (EstaVacia()) {
            inicio = fin = new NodoLista(d);
        } else {
            fin.siguiente = new NodoLista(d);
            fin = fin.siguiente;
        }
    }

    public int EliminarInicio() {
        int aux = inicio.dato;
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            inicio = inicio.siguiente;
        }
        return aux;
    }

    public int EliminarFin() {
        int aux = fin.dato;
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            NodoLista r = inicio;
            while (r.siguiente != fin) {
                r = r.siguiente;
            }
            fin = r;
            fin.siguiente = null;
        }
        return aux;
    }

    public boolean EstaEnLista(int dato) {
        NodoLista R = inicio;
        while (R != null && R.dato != dato) {
            R = R.siguiente;
        }
        return R != null;
    }

    public void BorrarNodo(int dato) {
        if (EstaEnLista(dato)) {
            //Primer caso - Unico Nodo
            if (inicio == fin && dato == inicio.dato) {
                inicio = fin = null;
            } else if (dato == inicio.dato) {
                inicio = inicio.siguiente;
            } else {
                NodoLista Ant, Temp;
                Ant = inicio;
                Temp = inicio.siguiente;
                while (Temp != null && Temp.dato != dato) {
                    Ant = Ant.siguiente;
                    Temp = Temp.siguiente;
                }
                if (Temp != null) {
                    Ant.siguiente = Temp.siguiente;
                    if (Temp == fin) {
                        fin = Ant;
                    }
                }
            }
            System.out.println("Dato eliminado");
            return;
        }
        System.out.println("El dato no existe");
    }

    public void MostrarLista() {
        NodoLista R = inicio;
        while (R != null) {
            System.out.println("[" + R.dato + "]");
            R = R.siguiente;
        }
        System.out.println("");
    }    
}
