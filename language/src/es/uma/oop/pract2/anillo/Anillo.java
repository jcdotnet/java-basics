package es.uma.oop.pract2.anillo;

public class Anillo {
	protected NodoAnillo senalado;
	protected NodoAnillo marcado;
	
	public void inserta(Object o) {
		senalado = new NodoAnillo(o,senalado);
	}
	
	public void borra() {
		NodoAnillo sen = senalado;
		if (sen==null) { // no hay
			System.out.println("(borra) ERROR: No hay elementos");
			System.exit(0);
		}
		if (sen==sen.siguiente) { // solo hay uno
			senalado = null;
			marcado = null;
		} else { // hay mas de uno
			sen. anterior.siguiente = sen.siguiente;
			sen.siguiente.anterior = sen.anterior;
			senalado = sen.siguiente;
			if (marcado == sen)
				marcado = null;
		}
	}
	public void marca() {
		marcado = senalado;
	}
	public void rotaDerecha() {
		if (senalado == null) {
			System.out.println("(rotaDerecha) ERROR: No hay elementos");
			System.exit(0);
		}
		senalado = senalado.siguiente;
	}
	public void rotaIzquierda() {
		if (senalado == null) {
			System.out.println("(rotaIzquierda) ERROR: No hay elementos");
			System.exit(0);
		}
		senalado = senalado.anterior;
	}
	public void rotaHastaMarca() {
		if (marcado == null) {
			System.out.println("(rotarHastaMarca) ERROR: No hay elemento marcado");
			System.exit(0);
		}
		marcado = senalado;
	}
	public Object getSenalado() {
		if (senalado==null) {
			System.out.println("(getSe�alado) ERROR: No hay elemento senalado");
			System.exit(0);
		}
		return senalado.informacion;
	}
	public boolean esVacia() {
		return senalado == null;
	}
	public boolean esMarcado() {
		return senalado == marcado;
	}				
}

class NodoAnillo {
	NodoAnillo anterior;
	NodoAnillo siguiente;
	Object informacion;
	
	public NodoAnillo(Object o,NodoAnillo sen) {
		informacion = o;
		if (sen==null) {
			anterior = this;
			siguiente = this;
		} else {
			this.siguiente = sen.siguiente;
			this.anterior = sen; 
			sen.siguiente.anterior = this;
			sen.siguiente = this;
		}
	}
}

	