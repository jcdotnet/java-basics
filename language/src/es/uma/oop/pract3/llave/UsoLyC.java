package es.uma.oop.pract3.llave;

public class UsoLyC  {
	static public void main(String [] args)  {
		Llave l1 = new Llave(4);
		Llave l2 = new Llave(4);
		Cerradura c = new Cerradura(4);
		
		// Construimos la cerradura
		c.apertura(0,3);
		c.apertura(0,5);
		c.apertura(1,4);
		c.apertura(2,5);
		c.apertura(2,8);
		c.apertura(3,9);
		// Construimos la llave 1
		l1.lima(0,7);
		l1.lima(1,7);
		l1.lima(2,5);
		l1.lima(3,2);
		// Construimos la llave 2
		l2.lima(0,3);
		l2.lima(1,4);
		l2.lima(2,8);
		l2.lima(3,9);
		boolean b1 = c.seAbreCon(l1);
		boolean b2 = c.seAbreCon(l2);
		if (b1)
			System.out.println("Se abre con la primera llave");
		else		
			System.out.println("No se abre con la primera llave");
		if (b2)
			System.out.println("Se abre con la segunda llave");
		else		
			System.out.println("No se abre con la segunda llave");
	}
		
}