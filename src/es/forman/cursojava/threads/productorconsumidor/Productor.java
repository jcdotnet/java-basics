package es.forman.cursojava.threads.productorconsumidor;

public class Productor extends Thread {
     
	private Cajon cajon;
	public Productor(Cajon cajon) {
        this.cajon=cajon;
	}
	public void run() {
		// TODO Auto-generated method stub
		 for (int i=0; i<100; i++) {
		    int valor= (int)(Math.random()*100);
			cajon.add(valor);
		    try {
				this.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    System.out.println("He puesto el número"+valor);
		    // Mejor imprimir directamente en clase boton
		}
	}

}
