// Autor: Jose Carlos Roman Rubio
package es.uma.oop.pract3;

import java.util.*;

class WUR  {
  SortedSet repes, unicos;
  private SortedMap t;
    
  protected WUR( String cadena) {
    StringTokenizer pals = new StringTokenizer(cadena," ;:,.");
    t= new TreeMap();
    
    while (pals.hasMoreTokens()) {
      String palabra= pals.nextToken();
      Integer frec = (Integer) t.get(palabra);
      if (frec==null)
        //t.put(palabra,new Integer(1));
        t.put(palabra,1);
      else 
       	//t.put(palabra,new Integer(frec.intValue()+1));
        t.put(palabra, frec.intValue()+1);
    }
    repes= new TreeSet();
    unicos= new TreeSet();
    Iterator i = t.keySet().iterator();
    while (i.hasNext()) {
       String elem = (String) i.next();
        if ( ((Integer) t.get(elem)).intValue()==1)  
        	 unicos.add(elem);   
        else
             repes.add(elem);
    }
  }
  
  SortedSet duplicados() {
  	  return repes;
  }		
  SortedSet noDuplicados(){
      return unicos; 
  }
}