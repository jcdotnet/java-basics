package es.uma.oop.listas;

public class EmptyListaException extends Exception {
	public EmptyListaException(String s) {
		super(s);
	}
	public String toString() {
		return "ListaExcepcion:"+super.toString();
	}
}
