package es.uma.oop.listas;

public class ListaAnt {
	protected NodoLista tope;
	
	public ListaAnt() {
		tope = null;
	}
	
	public boolean isEmpty() {
		return (tope == null);
	}
	
	public void addFirst(Object o) {
		NodoLista nli = new NodoLista(o,tope);
		tope = nli;
	}
	
	public void add(Object o) {
		addFirst(o);
	}
	
	public void addLast(Object o) {
		NodoLista ndl = tope;
		while (ndl.sig != null)
			ndl=ndl.sig;
		ndl.sig=new NodoLista(o,null);
	}
	
	public Object getFirst() {
		Object res=null;
		if (isEmpty()) {
			System.out.println("ERROR: Lista vacia");
			System.exit(1);
		} else {
			res = tope.dato;
		}
		return res;
	}
	
	public Object getLast() {
		Object res=null;
		if (isEmpty()) {
			System.out.println("ERROR: Lista vacia");
			System.exit(1);
		} else {
			NodoLista ndl = tope;
			while (ndl.sig != null)
				ndl = ndl.sig;
			res = ndl.dato;
		}
		return res;
	}
	
	public Object removeFirst() {
		Object res=null;
		if (isEmpty()) {
			System.out.println("ERROR: Lista vacia");
			System.exit(2);
		} else {
			NodoLista ndl = tope;
			tope = tope.sig;
			res = ndl.dato;  
		}
		return res;
	}
		
	public Object removeLast() {
		Object res=null;
		if (isEmpty()) {
			System.out.println("ERROR: Lista vacia");
			System.exit(1);
		} else {
			NodoLista ndl = tope;
			if (ndl.sig==null) {
				tope = null;
				res = ndl.dato;
			} else {
				while (ndl.sig.sig != null)
					ndl = ndl.sig;
				NodoLista ondl = ndl.sig;
				ndl.sig=null;
				res = ondl.dato;
			}			
		}
		return res;
	}
	
	public String toString() {
		NodoLista ndl = tope;
		String s = "Lista(";
		while (ndl!=null) {
			s += ndl.dato+" ";
			ndl=ndl.sig;
		}
		s += ")";
		return s;
	}		 
}
		
class NodoListaAnt {
	protected Object dato;
	protected NodoListaAnt sig;
	public NodoListaAnt(Object o, NodoListaAnt s) {
		dato = o;
		sig = s;
	}
}