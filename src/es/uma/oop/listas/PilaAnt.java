package es.uma.oop.listas;

public class PilaAnt {
	protected ListaAnt lista;
	
	public PilaAnt() {
		lista = new ListaAnt();
	}
	
	public boolean isEmpty() {
		return lista.isEmpty();
	}
	
	public void push(Object o) {
		lista.addFirst(o);
	}
	
	public Object pop() {
		return lista.removeFirst();
	}

	public Object top() {
		return lista.getFirst();
	}
	
	public String toString() {
		return "Pila["+lista+"]";
	}	
}