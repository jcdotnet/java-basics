import java.io.*;
import java.util.*;

class LineaFF {
  SortedMap t;
  SortedSet c;
  
   // LineaFF -> lee fichero y almacena en memoria las palabras 
   // importantes junto con las lineas dnd aparece
   LineaFF(String fichEntrada,String palabras) throws IOException{
      BufferedReader br= new BufferedReader(new FileReader(fichEntrada));
      BufferedReader br2= new BufferedReader(new FileReader(palabras));
      trata(br,br2);
      br.close();
      br2.close();  
   }
   
   private void trata(BufferedReader br1,BufferedReader br2) throws IOException  {       
       t = new TreeMap();
       noSigACto(br2);
       for (int i=1;true; i++) {
          String linea=br1.readLine();
          if (linea==null) return;
          StringTokenizer st=new StringTokenizer(linea," :;,.");
          while (st.hasMoreTokens()) {
          	  String pal= st.nextToken();
          	  if (!c.contains(pal)) {
          	     SortedSet cto=(SortedSet) t.get(pal);
          	     if (cto==null)
          	       cto=new TreeSet();
          	     if (cto.add(new Integer(i)))
          	       t.put(pal,cto);  
          	  }
          }
       } 
   }
   
   private void noSigACto(BufferedReader br) throws IOException {
        c=new TreeSet();
        String linea;
        while ((linea= br.readLine()) !=null) {
          StringTokenizer st= new StringTokenizer(linea,"., ;:");
          while (st.hasMoreTokens()) {
          	   String token= st.nextToken();
          	   c.add(token);
           }
         }
   }
          	   	
   
   // volcarInfo -> escribe en fichero de salida la informacion
   // de LineaFF  
   void volcarInfo(String fichSalida) throws IOException {
   	  PrintWriter pw= new PrintWriter(new FileWriter(fichSalida));
      volcarInfo(pw);
      pw.close();
   }
   
   // volcarInfo -> escribe en el printWriter la informacion
   void volcarInfo(PrintWriter pw) throws IOException {
      Iterator it= t.entrySet().iterator();
      while (it.hasNext()) {
      	 Map.Entry tupla= (Map.Entry)it.next();
         pw.print(tupla.getKey()+":  ");
         Iterator it2= ((SortedSet)tupla.getValue()).iterator();
         while (it2.hasNext()) {
         	int lin= ((Integer)it2.next()).intValue();
         	pw.print(lin+" ");
         }
         pw.println(" ");           
      }      	
   }
}
     // tb se puede hacer el ejercicio:
     // como hija de LineaF: class LineaFF extends LineaF
     // el constructor seria:   super(fichEntrada)
     //                         br2= .... 
     //                         eliminaPalsNoClaves(br2)
     //                         br2.close()
     //  y en eliminaPalsNoClaves uso containKey and remove(key)
