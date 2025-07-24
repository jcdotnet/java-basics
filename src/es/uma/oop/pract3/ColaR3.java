package es.uma.oop.pract3;

import java.util.*;

public class ColaR3 {
	LinkedList l;
	
	public ColaR3() {
		l= new LinkedList();
	}
	
	public boolean isEmpty() {
		return l.isEmpty();
    }
    
    public void add(Object o) {
      l.addLast(o);
    }
    
    public Object get() {
        Object o=null;
        try {        // tb puedo relanzarla en la cabecera
          o= l.getFirst();   // y capturarla en el main
          l.removeFirst();        
        }
        catch (IndexOutOfBoundsException e) { 
        	System.out.println(" ERROR: Cola Vacia");
           	System.exit(1); 
        }
        return o;
    }	
    
    
    public String toString() {
       String cad = "Cola: [";
       ListIterator i= l.listIterator();
        while (i.hasNext()) {
        	String prox = (String) i.next();
        	cad+=prox+" ";
        }
        cad+="]";
        return cad;    
    }
}