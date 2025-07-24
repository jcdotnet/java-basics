package es.uma.oop.listas;

import java.util.Enumeration;

public class Cola {
	protected Lista lista;
	
	public Cola() {
		lista = new Lista();
	}
	
	public boolean isEmpty() {
		return lista.isEmpty();
	}
	
	public void add(Object o) {
		lista.addFirst(o);
	}
	
	public Object get() throws EmptyColaException {
		Object res=null;
		try {
			res=lista.removeLast();
		} catch (EmptyListaException e) {
			throw new EmptyColaException("get: Cola vacia");
		}
		return res;
	}
	
	public Enumeration elements() {
		return new ListaEnum(lista.nodo);
	}

	public String toString() {
		return "Cola["+lista+"]";
	}
}

