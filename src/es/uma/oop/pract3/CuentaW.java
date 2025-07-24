package es.uma.oop.pract3;

import java.util.*;
class CuentaaW {
   String cad;
   SortedMap t;
   
   CuentaaW(String cadena) {
  	   cad=cadena;
  	   this.mete();
   }
   
   private void mete() {
   	  t =new TreeMap();
      for (int i=0;i<cad.length();i++) {
      	 Character car = new Character(cad.charAt(i));
      	 Integer frec= (Integer) t.get(car);
      	 t.put(car,frec==null?new Integer(1):new Integer(frec.intValue()+1));       
      }
   }
  	  
   int numPalabras() {
       StringTokenizer st = new StringTokenizer(cad,":;,. "); 
       return st.countTokens();
   }
   int numLetras() {
   	 Iterator it = t.keySet().iterator();
   	 int res=0;
   	 while (it.hasNext()) {
   	 	char prox= ((Character) it.next()).charValue();
   	 	if (Character.isLetter(prox))
   	 	  res++;
   	 } 
    return res;
   }
   
   int numVeces(char n){
     int res=0;
     try {
       res= ((Integer) t.get(new Character(n))).intValue(); 
     } catch (NullPointerException e) {
     	 System.out.println(" No Existe esa letra ");
     }
     return res;
   }
   
} 