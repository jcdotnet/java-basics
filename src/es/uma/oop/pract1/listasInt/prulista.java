package es.uma.oop.pract1.listasInt;

class prulista {
	public static void main (String args []){
		int a;
		ListaInt l;
		l=new ListaInt();
		l.add(1);
		l.addFirst(7);
		l.addLast(9);
		l.addLast(4);
		l.addFirst(8);
		System.out.println("Lista de 5 elementos:" + l);
		a=l.removeFirst();
		System.out.println("Quito el primero "+ a);
		System.out.println(l);
		a=l.removeLast();
		System.out.println("Quito ahora el ultimo" +a);
		System.out.println(l);
		a=l.getLast();
		System.out.println("El ultimo elm ahora es: " + a);
		System.out.println(" \n La lista debe quedar ( 719 ) ");
	}
}
	