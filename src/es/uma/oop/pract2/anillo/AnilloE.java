package es.uma.oop.pract2.anillo;

public class AnilloE extends Anillo {
	public void rotaDerecha(int n) {
		for(int i = 0; i< n ; i++)
			this.rotaDerecha();   // al no poner argumentos llama
	}                             // al del padre ??
}
		
	