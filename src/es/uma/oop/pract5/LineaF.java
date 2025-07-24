package es.uma.oop.pract5;

import java.io.*;    // JoSe CarLos Roman Rubio ITSistemas
import java.util.*;

class LineaF { 
  SortedSet cto;
  SortedMap tabla;
  
  LineaF(String fich) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader(fich));
    mete(br);
    br.close();   
  }
  
  private void mete(BufferedReader buf) throws IOException {
     tabla = new TreeMap();    
     for (int i=1;true;i++) {
     	String linea= buf.readLine();
     	if (linea==null) return;
     	StringTokenizer stk = new StringTokenizer(linea," ;:,.");
     	while (stk.hasMoreTokens()) { 
     	    String pal= stk.nextToken();
     	    cto= (SortedSet)tabla.get(pal);
     	    if (cto==null) 
              cto= new TreeSet();                 	    
     	      if (cto.add(new Integer(i)))
     	         tabla.put(pal,cto);
     	}  
     }  
  }
  
  void volcarInfo(String fichSalida) throws IOException {    
      PrintWriter pw =new PrintWriter(new FileWriter(fichSalida));
      this.volcarInfo(pw);
      pw.close(); 
  } 
  
  SortedMap sacarTabla() {    // no lo pide en el ejercicio...
       return tabla;
  }
  
  void volcarInfo(PrintWriter pw) {
      Iterator it = tabla.entrySet().iterator();
      while (it.hasNext()) {
         Map.Entry tupla = (Map.Entry) it.next();
         pw.print(tupla.getKey() +":    ");
         Iterator it2= ((SortedSet)tupla.getValue()).iterator();
         while (it2.hasNext()) {
         	int nLin= ((Integer) it2.next()).intValue();
         	pw.print(nLin+" ");
         }
         pw.println("");
      }  
  }

}