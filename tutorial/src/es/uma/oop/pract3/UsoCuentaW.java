package es.uma.oop.pract3;

import java.io.*;
class usoCuentaW {
	public static void main(String [] args) throws IOException { 
       System.out.print("Introduce una frase -> ");
       BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
       String frase = br.readLine();
       
       CuentaaW c = new CuentaaW(frase);
       System.out.println("numero de palabras: "+c.numPalabras());
	   System.out.println("numero de letras: "+c.numLetras());
	     
	   System.out.print("introduce una letra-> ");
	   char let;
       try { 
          let= br.readLine().charAt(0);
       } catch (IndexOutOfBoundsException e) {
          	 System.out.println(" Introduce un letra canio");
	     	return;
       }  
	   System.out.println("num veces q aparece: "+c.numVeces(let));
                 
 	  
	}
}