package es.uma.oop.pract3;

import java.util.*;

public class ColaPRIO {
	LinkedList l;
	
	public ColaPRIO() {
		l= new LinkedList();
	}
	
	public boolean isEmpty() {
		return l.isEmpty();
    }
    
    public int prio(Object o) {
        Prioridad pr =new PrioObjeto(o);
        return pr.prioridad();
    }
    
    public void add(Object o) {
       for (int i=0;i<l.size();i++) {
          if (prio(o) > prio(l.get(i))) {
               l.add(i,o);
               return;          
          }                
       }
       l.addLast(o);
    }
    
    public Object get() throws IndexOutOfBoundsException {
        Object o=null;
          o= l.getFirst();   // la excepcion tb puedo tratarla aki
          l.removeFirst();               
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