package es.uma.oop.pract3;

import java.io.*;
class UsoColaPRIO {

  public static void main(String [] args) {
      ColaPRIO cola= new ColaPRIO();
      BufferedReader br;
      for (int i=0; i<args.length;i++) {
        cola.add(args[i]);
      }
      
      System.out.println(cola);
      
      int opcion=0;
      br= new BufferedReader(new InputStreamReader(System.in));
      
      do  {
        System.out.print("1 saca elem de cola 2 para salir: ");
        try {  
          opcion=Integer.parseInt(br.readLine()); }
        catch (IOException e) {
        	System.out.println(" ERROR E/S"); 
        }
        catch (NumberFormatException e) {
        	System.out.println("Numero mal introducido");
        	continue;  
        }
        if (opcion==1) {
            String elm;
            try {
                 elm= (String) cola.get();
            }
            catch (IndexOutOfBoundsException e) { 
        	System.out.println(" ERROR: Cola Vacia");
        	continue; }
        	 System.out.println(cola);
        }   
      }
      while (opcion!=2);
  }
}