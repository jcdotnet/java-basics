package es.uma.oop.pract3;

public class PrioObjeto implements Prioridad {
     
     String cadena;
     
     public PrioObjeto(Object o) {
     	cadena=(String) o;
     }
     
     public int prioridad() {
       return (int) cadena.charAt(0);
     }
}