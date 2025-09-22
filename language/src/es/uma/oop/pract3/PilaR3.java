package es.uma.oop.pract3;

import java.util.*;

public class PilaR3 {
	LinkedList l;
	
	public PilaR3() {
		l= new LinkedList();
	}
	
	public boolean isEmpty() {
		return l.isEmpty();
    }
    
    public void push(Object o) {
      l.addFirst(o);
    }
    
    public Object top() {
        Object o=null;
        try {        // tb puedo relanzarla en la cabecera
          o= l.getFirst();   // y capturarla en el main
        }
        catch (IndexOutOfBoundsException e) { 
        	System.out.println(" ERROR: Pila Vacia");
        		System.exit(1); 
        }
        return o;
    }	
    
    
    public Object pop() {
        Object o=null;
        try {
           o= l.getFirst();
           l.removeFirst();
        }
        catch (IndexOutOfBoundsException e) {
        	System.out.println(" ERROR: Pila Vacia");
        	System.exit(1);       
        }
        return o;
    }	
    
    public String toString() {
       String cad = "Pila: [";
       ListIterator i= l.listIterator();
        while (i.hasNext()) {
        	String prox = (String) i.next();
        	cad+=prox+" ";
        }
        cad+="]";
        return cad;    
    }
}