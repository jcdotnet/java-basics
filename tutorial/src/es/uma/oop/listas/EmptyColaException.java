package es.uma.oop.listas;

public class EmptyColaException extends Exception {
	public EmptyColaException(String s) {
		super(s);
	}
	public String toString() {
		return "ColaExcepcion:"+super.toString();
	}
}
