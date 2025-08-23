package es.uma.oop.pract3.pr1;

import es.uma.oop.listas.*;
import java.util.Enumeration;
class EjLista {
	public static void main(String [] args) {
		Lista li = new Lista();
		
		System.out.println(li);
		
		for(int i=0;i<8;i++) {
			//li.addFirst(new Integer(i));
			//li.addLast(new Integer(i));
			li.addFirst(i);
			li.addLast(i);
		}
		
		System.out.println(li);
		
		for(int i=0;i<10;i++) {
			try {
				System.out.println(li.removeFirst());
				System.out.println(li.removeLast());
			} catch (EmptyListaException e) {
				System.out.println(e);
			}
		}

		System.out.println(li);

		for(int i=0;i<8;i++) {
			//li.addFirst(new Integer(i));
			//li.addLast(new Integer(i));
			li.addFirst(i);
			li.addLast(i);
		}

		System.out.println(li);
		
		Enumeration e = li.elements();
		while (e.hasMoreElements()) 
			System.out.println(e.nextElement());
			
		System.out.println(li);
			
	}
}	