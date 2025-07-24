package es.forman.cursojava.threads.productorconsumidor;

public class CajonSincronizado extends Cajon{

	 
	private int numero;
	private boolean disponible;
	
    public CajonSincronizado() {
 
    }
    
	public synchronized void add(Integer num) {
		 if (disponible) {	
			try {
				wait();
			} catch (InterruptedException e) {}
		 }
		 else {
		  this.numero=num;
		  disponible=true;
		  notify();  // no exige que haya hecho antes un wait
		 
		 }		   
	}
	public synchronized int get() {
		if(!disponible) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		disponible=false;
		notify();
		return this.numero;
	}

}
