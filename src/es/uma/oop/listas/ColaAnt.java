package es.uma.oop.listas;

public class ColaAnt {
	protected ListaAnt lista;
	
	public ColaAnt() {
		lista = new ListaAnt();
	}
	
	public boolean isEmpty() {
		return lista.isEmpty();
	}
	
	public void add(Object o) {
		lista.addFirst(o);
	}
	
	public Object get() {
		return lista.removeLast();
	}
	
	public String toString() {
		return "Cola["+lista+"]";
	}	 
}
