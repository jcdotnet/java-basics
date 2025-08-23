package es.uma.oop.pract1.listasInt;

class pruCola {
	public static void main(String [] args) {
		
		ColaInt cola = new ColaInt();
		int elm;
		
		cola.add(1);
		cola.add(2);
		cola.add(3);
		System.out.println("cola: "  + cola);
		elm = cola.get();
		System.out.println("saco un elm: " + cola);
	}
}
	
