package es.uma.oop.pract3;

import java.util.*;
 
class Palabra {
    Vector v;
    
    Palabra() {
      v= new Vector() ;
    }
    
    void add(String cad) {
      v.add(cad);
    }
    
    SortedSet palabras(int n) {
      SortedSet cto = new TreeSet(); 
       Iterator it= v.iterator();
       while (it.hasNext()) {
       	 String palabra = (String) it.next();
       	 if (palabra.length()==n)
       	   cto.add(palabra);
       }
       return cto;  
    }
}