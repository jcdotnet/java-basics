package es.forman.cursojava.threads.productorconsumidor;


public class Cajon {
   
	private int numero;
	
    public Cajon() {
    }
    

	public void add(Integer num) {
		this.numero=num;
	}
	public int get() {
		return this.numero;
	}
	

}
