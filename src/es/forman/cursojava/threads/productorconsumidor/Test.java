package es.forman.cursojava.threads.productorconsumidor;

public class Test {

	
	public static void main(String[] args) {
		CajonSincronizado cajon = new CajonSincronizado();
		Productor p= new Productor(cajon);
		p.start();
		Consumidor c = new Consumidor(cajon);
		c.start();
        // main termina aqui, pero el programa sigue ejecutandose
	    // hasta que finalicen todas sus hebras
	}

}
