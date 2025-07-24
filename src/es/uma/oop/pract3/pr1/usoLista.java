package es.uma.oop.pract3.pr1;

import es.uma.oop.listas.*;
import es.uma.oop.entradaSalida.*;

class usoLista{
	public static void main (String arg[]){
	   Lista l = new Lista();
       int n;
	
	   n=ES.readInt("Introduce el entero,(0 para finalizar):");
	   while (n!=0) {		
		 l.add(new Integer(n)); //new pq convierto int en obj
		 n=ES.readInt("Introduce el entero,(0 para finalizar):");
	   }
	   System.out.println(l);  // busca autom.el metodo toString 
	}                 
}