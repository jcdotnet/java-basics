package es.uma.oop.pract3.pr1;

import es.uma.oop.listas.Cola;
import es.uma.oop.listas.EmptyColaException;
import java.util.Enumeration;
class EjCola {
	public static void main(String [] args) {
		Cola co = new Cola();
		
		System.out.println(co);
		
		for(int i=0;i<8;i++) {
			co.add(new Integer(i));
		}
		
		System.out.println(co);
		
		for(int i=0;i<3;i++) {
			try {
				System.out.println(co.get());
			} catch (EmptyColaException e) {
				System.out.println(e);
			}
		}
		System.out.println(co);
		Enumeration e = co.elements();
		while (e.hasMoreElements())
			System.out.println(e.nextElement());
	}
}	