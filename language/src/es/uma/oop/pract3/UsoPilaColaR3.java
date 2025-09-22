package es.uma.oop.pract3;

import java.io.*;
class UsoPilaColaR3 {

  public static void main(String [] args) {
      ColaR3 cola= new ColaR3();
      PilaR3 pila= new PilaR3();
      BufferedReader br;
      for (int i=0; i<args.length;i++) {
        cola.add(args[i]);
        pila.push(args[i]);      
      }
      
      System.out.println(cola);
      System.out.println(pila);
      
      int opcion=0;
      br= new BufferedReader(new InputStreamReader(System.in));
      
      do  {
        System.out.print("1 saca elem de cola, 2 de la pila, 3 salir: ");
        
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
              String elm= (String) cola.get();
            System.out.println(cola);
        }
        if (opcion==2) {   
             String elm= (String) pila.pop();
            System.out.println(pila);
        }      
      }
      while (opcion!=3);
  }
}