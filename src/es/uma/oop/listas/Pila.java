package es.uma.oop.listas;

import java.util.Enumeration;
public class Pila {
	protected Lista lista;
	
	public Pila() {
		lista = new Lista();
	}
	
	public boolean isEmpty() {
		return lista.isEmpty();
	}
	
	public void push(Object o) {
		lista.addFirst(o);
	}
	
	public Object pop() throws EmptyPilaException {
		Object res = null;
		try {
			res = lista.removeFirst();
		} catch (EmptyListaException e) {
			throw new EmptyPilaException("pop: Pila vacia");
		}
		return res;
	}

	public Object top() throws EmptyPilaException {
		Object res = null;
		try {
			res = lista.getFirst();
		} catch (EmptyListaException e) {
			throw new EmptyPilaException("top: Pila vacia");
		}
		return res;
	}

	public Enumeration elements() {
		return new ListaEnum(lista.nodo);
	}

	public String toString() {
		return "Pila["+lista+"]";
	}	
}
