package es.uma.oop.pract3.pr1;

import es.uma.oop.listas.Pila;
import es.uma.oop.listas.EmptyPilaException;
import java.util.Enumeration;

class EjPila {
	public static void main(String [] args) {
		Pila pi = new Pila();
		
		System.out.println(pi);
		
		for(int i=0;i<8;i++) {
			pi.push(new Integer(i));
		}
		
		System.out.println(pi);
		
		for(int i=0;i<9;i++) {
			try {
				System.out.println(pi.top());
				System.out.println(pi.pop());
			} catch (EmptyPilaException e) {
				System.out.println(e);
			}
		}
		System.out.println(pi);
		Enumeration e = pi.elements();
		while (e.hasMoreElements()) 
			System.out.println(e.nextElement());
	}
}	