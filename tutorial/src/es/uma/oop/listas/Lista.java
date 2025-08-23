package es.uma.oop.listas;

import java.util.Enumeration;

public class Lista {
	protected NodoLista nodo;
	
	public Lista() {
		nodo = null;
	}
	
	public boolean isEmpty() {
		return (nodo == null);
	}
	
	public void addFirst(Object o) {
		nodo= new NodoLista(o,nodo);  
	    //NodoLista nli = new NodoLista(o,nodo);
	    //nodo = nli;
    } 
	
	public void add(Object o) {
		addFirst(o);
	}
	
	public void addLast(Object o) {
		NodoLista aux = nodo;
		while (aux.sig != null)
		  aux=aux.sig;
		  aux.sig =new NodoLista(o,null);
	}
	
	public Object getFirst() throws EmptyListaException {
		Object res=null;
                try {
			res = nodo.dato;
                } catch (NullPointerException e) {
                        throw new EmptyListaException("getFirst: Lista vacia");
                }
		return res;
	}
	// TAMBIEN
	// if this.isEmpty() {
	//	  throw new EmptyListaException("Lista Vacia");
	//     return;
	// }
	// return nodo.dato; 
		
	public Object getLast() throws EmptyListaException {
		Object res=null;
        try {
		   NodoLista aux = nodo;
		   while (aux.sig != null)
		 	   aux = aux.sig;
		   res = aux.dato;
         } catch (NullPointerException e) {
			   throw new EmptyListaException("getLast: Lista vacia");
         }
		 return res;
	}
	
	// TAMBIEN
	// if (nodo==null) {
	//	 throw new EmptyListaException("getLast: Lista vacia");
	//    return null;
	//  while (aux.sig!=null)
	//       aux = aux.sig;
	//  return aux.dato;
	
	public Object removeFirst() throws EmptyListaException {
		Object res=null;
         try {
			NodoLista ndl = nodo;
			nodo = nodo.sig;
			res = ndl.dato;  
			// En C++ habria que devolver ndl
          }
          catch (NullPointerException e) {
                throw new EmptyListaException("removeFirts: Lista vacia");
          }
		 return res;
	}
		
	// AQUI IGUAL QUE EN LOS OTROS DOS
	
	public Object removeLast() throws EmptyListaException {
		Object res=null;
          try {
			NodoLista aux = nodo;
			if (aux.sig==null) {
				nodo = null;
				res = aux.dato;
				// En C++ habria que devolver ndl
			} else {
				while (aux.sig.sig != null)
					aux = aux.sig;
				NodoLista ondl = aux.sig;
				aux.sig =null;
				res = ondl.dato;
				// En C++ habria que devolver ondl
			  }			
           } 
           catch (NullPointerException e) {
                        throw new EmptyListaException("removeLast: Lista vacia");
                }
		  return res;
	}
	
	public Enumeration elements() {
		return new ListaEnum(nodo);
	}
	
	public String toString() {
		NodoLista ndl = nodo;
		String s = "Lista(";
		while (ndl!=null) {
			s += ndl.dato +" ";
			ndl=ndl.sig;
		}
		s += ")";
		return s;
	}		 

}
		


class ListaEnum implements Enumeration {
	NodoLista nodo;
	public ListaEnum(NodoLista n) {
		nodo = n;
	}
	
	public boolean hasMoreElements() {
		return nodo!=null;
	}
	
	public Object nextElement() {
		Object res = nodo.dato;
		nodo = nodo.sig;
		return res;
	}
}
		
