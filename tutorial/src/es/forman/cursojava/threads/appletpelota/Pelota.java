//package es.forman.cursojava.threads.appletpelota;
//
//public class Pelota {
//
//	private int x;
//	private int y;
//	private int direccion;
//
//	public Pelota () {
//		this.x=(int)(Math.random()*AppletPelota.LIMITE);
//		this.y=(int)(Math.random()*AppletPelota.LIMITE);
//	    this.direccion= (int) (Math.random()*4);
//	}
//	public void desplaza() {
//		if (direccion==0) { //arriba-derecha
//			if (this.getCoordenadaX()==0)
//				direccion=1; //cambio pabajo-derecha
//			else if (this.getCoordenadaY()==AppletPelota.LIMITE)
//				direccion=2; // cambio parriba-izquierda
//			else {
//			   // sigue por su camino
//			   this.setCoordenadaX(this.getCoordenadaX()-1);
//			   this.setCoordenadaY(this.getCoordenadaY()+1);
//			}
//
//		}
//		else if (direccion==1) { // pabajo-derecha
//			if (this.getCoordenadaY()==AppletPelota.LIMITE)
//				direccion=2; //cambio pabajo-izquierda
//			else if (this.getCoordenadaX()==AppletPelota.LIMITE)
//				direccion=0; // cambio parriba-derecha
//			else {
//			   // sigue por su camino
//			   this.setCoordenadaX(this.getCoordenadaX()+1);
//			   this.setCoordenadaY(this.getCoordenadaY()+1);
//			}
//		}
//		else if (direccion==2) {   //pabajo izquierda
//			if (this.getCoordenadaX()==AppletPelota.LIMITE)
//				direccion=3; //cambio parriba izquierda
//			else if (this.getCoordenadaY()==0)
//				direccion=1; // cambio pabajo derecha
//			else {
//			   // sigue por su camino
//			   this.setCoordenadaX(this.getCoordenadaX()+1);
//			   this.setCoordenadaY(this.getCoordenadaY()-1);
//			}
//		}
//
//
//		else if  (direccion==3) { // parriba-izquierda
//			if (this.getCoordenadaY()==0)
//				direccion=1; //cambio pabajo derecha
//			else if (this.getCoordenadaX()==0)
//				direccion=0; // cambio parriba-derecha
//			else {
//			   // sigue por su camino
//			   this.setCoordenadaX(this.getCoordenadaX()-1);
//			   this.setCoordenadaY(this.getCoordenadaY()-1);
//			}
//		}
//
//
//	}
//
//	public int getCoordenadaX() {
//		return this.x;
//	}
//	public int getCoordenadaY() {
//		return this.y;
//	}
//	public void setCoordenadaX(int x) {
//	   this.x=x;
//	}
//	public void setCoordenadaY(int y) {
//	   this.y=y;
//	}
//
//}
