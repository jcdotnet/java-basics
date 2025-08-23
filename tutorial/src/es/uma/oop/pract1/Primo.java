package es.uma.oop.pract1;

public class Primo {     // estruct: lista q no puede estar vacia
	private int valor;         
	private Primo sig;
	
	public Primo(int num) {
		valor = num;
		sig = null;
	}
	
	public void inserta(int num) {
		if (num%valor==0)
		   return; 
	    if (sig==null)
		   sig = new Primo(num);
		else
			sig.inserta(num);
	}
	
	public int primo() {   // oper para poder recorrer la lista
		return valor;
	}
	
	public Primo sigPrimo() {
		return sig;
	}
}		
