package u3e6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
    ClaseLista lista = new ClaseLista();
    Scanner V = new Scanner(System.in);
    
    boolean salir = false;
    int dato;
    do {
        salir = false;
        System.out.println(
                "Metodos de una lista"
                + "\n[1]insertar al inicio"
                + "\n[2]insertar al final"
                + "\n[3]quitar del inicio"
                + "\n[4]quitar del final"
                + "\n[5]quitar un dato en especifico"
                + "\n[6]mostrar si la lista esta vacia"
                + "\n[7]mostrar la lista"
                + "\n[8]salir");
                
        int opc = V.nextInt();
        
        switch (opc) {
            case 1:
                System.out.println("inserte un dato");
                dato = V.nextInt();
                lista.InsertarAlInicio(dato);
                break;
                
            case 2:
                System.out.println("inserte un dato");
                dato = V.nextInt();
                lista.InsertarAlFinal(dato);
                break;
                
            case 3:
                if (!lista.EstaVacia()) {
                    System.out.println("Dato eliminado: " + lista.EliminarInicio());
                } else {
                    System.out.println("La lista esta vacia");
                }
                break;
                
            case 4:
                if (!lista.EstaVacia()) {
                    System.out.println("Dato eliminado: " + lista.EliminarFin());
                } else {
                    System.out.println("La lista esta vacia");
                }
                break;
                
            case 5:
                if (!lista.EstaVacia()) {
                    System.out.println("Ingrese el dato a eliminar");
                    dato = V.nextInt();
                    lista.BorrarNodo(dato);
                } else {
                    System.out.println("La lista esta vacia");
                }
                break;
                
            case 6:
                if (lista.EstaVacia()) {
                    System.out.println("La lista esta vacia");
                } else {
                    System.out.println("La lista no esta vacia");
                }
                break;
                
            case 7:
                if (!lista.EstaVacia()) {
                    lista.MostrarLista();
                } else {
                    System.out.println("La lista esta vacia");
                }
                break;
                
            case 8:
                salir = true;
                break;
                
            default:
                System.out.println("Opcion no valida");
        }
        System.out.println("");
    } while (!salir);
}
}
