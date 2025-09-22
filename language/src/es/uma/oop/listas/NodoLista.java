package es.uma.oop.listas;

public class NodoLista {
	protected Object dato;
	protected NodoLista sig;
	public NodoLista(Object o, NodoLista s) {
		dato = o;
		sig = s;
	}
}