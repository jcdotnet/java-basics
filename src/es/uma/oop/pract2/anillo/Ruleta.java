package es.uma.oop.pract2.anillo;

public class Ruleta {
	protected AnilloE anillo;
	
	public Ruleta() {
		anillo = new AnilloE();
		for(int i=0; i<37;i++) {
			//anillo.inserta(new Integer(i)); // Deprecated in JDK 9
			anillo.inserta(Integer.valueOf(i));
			anillo.rotaDerecha((int)(Math.random()*37));
		}
	}
	public int gira() {
		anillo.rotaDerecha((int)(Math.random()*37));
		return ((Integer)anillo.getSenalado()).intValue();
	}
	public int bola() {
		this.gira();
		anillo.marca();
		int s = this.gira();
		anillo.rotaHastaMarca();
		anillo.rotaDerecha(s);
		return ((Integer)anillo.getSenalado()).intValue();
	}		
}