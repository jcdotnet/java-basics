package es.uma.oop.listas;

public class EmptyPilaException extends Exception {
	public EmptyPilaException(String s) {
		super(s);
	}
	public String toString() {
		return "PilaExcepcion:"+super.toString();
	}
}