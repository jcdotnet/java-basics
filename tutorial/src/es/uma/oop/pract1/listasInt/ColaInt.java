package es.uma.oop.pract1.listasInt;

public class ColaInt extends ListaInt {
	
 public ColaInt() {
	super();
 }
 public boolean isEmpty() {
 	return super.isEmpty();
 }
 public void add (int n) {
 	super.addLast(n);
 }
 public int get() {
 	return super.removeFirst();
 }
 public String toString() {
 	return super.toString();
 }
}

// Para la Pila idem de lo mismo ..