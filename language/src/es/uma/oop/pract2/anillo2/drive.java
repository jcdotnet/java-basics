package es.uma.oop.pract2.anillo2;

class drive{
	public static void main(String arg []){
		Anillo a = new Anillo();
//		a.Insertar(new Integer(1)); // Integer(int) is deprecated since JDK 9
//		a.Insertar(new Integer(2));
//		a.Insertar(new Integer(3));
//		a.Insertar(new Integer(4));
//		a.Insertar(new Integer(5));
//		a.Insertar(new Integer(6));
//		a.Insertar(new Integer(7));
		a.Insertar(1);
		a.Insertar(2);
		a.Insertar(3);
		a.Insertar(4);
		a.Insertar(5);
		a.Insertar(6);
		a.Insertar(7);
		a.Marca();
		System.out.println(a.numNodos());
		System.out.println(a.difer());
		a.RotaIzquierda();
		System.out.println(a);
		System.out.println(a.marcado.dato);
		a.RotaIzquierda();
		System.out.println(a.marcado.dato);
		System.out.println(a);
		a.RotaIzquierda();
		System.out.println(a.marcado.dato);
		System.out.println(a.difer());
		System.out.println(a);
		a.RotaHastaMarca();
		System.out.println(a);
	}

}