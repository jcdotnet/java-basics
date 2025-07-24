package es.uma.oop.pract1.listasInt;

class NodoInt {
  protected int dato;
  protected NodoInt sig;
  
  public NodoInt(int n, NodoInt s) {
  	dato = n;
  	sig = s;
  }
}  