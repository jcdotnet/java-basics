package es.forman.cursojava.start;
import es.forman.cursojava.formas.*;
public class Numeros {
               
        public static void main(String [] args) {
                
          int x = 100;
          int y = 30;
          float z= 1.5f;
          System.out.println((float) x/y);
          System.out.println((int) z*x);
          Circulo circ= new Circulo(7.7f);
          System.out.println("Superficie: "+circ.getSuperficie());
          System.out.println("Diametro: "+circ.getLongitud());
          System.out.println("Cuadrado ajustado tiene de lado: "+circ.devuelveMinimoCuadrado().getLado());
        }
}