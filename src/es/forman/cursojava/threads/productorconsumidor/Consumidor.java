package es.forman.cursojava.threads.productorconsumidor;

public class Consumidor extends Thread {
    
	private Cajon cajon;
	public Consumidor(Cajon cajon) {
        this.cajon=cajon;
	}
	public void run() {
	   for (int i=0; i<100; i++) {
		   int valor= cajon.get();
		   try {
			this.sleep(500);
		} catch (InterruptedException e) {
		}
		   System.out.println("He recogido el número"+valor);
       //		 Mejor imprimir directamente en clase boton
	   }
        
	}

}
