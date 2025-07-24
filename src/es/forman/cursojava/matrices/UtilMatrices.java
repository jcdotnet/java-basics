package es.forman.cursojava.matrices;

public class UtilMatrices {

	
	public static void main(String[] args) throws DimensionException {
		int alto=2;
		int ancho=2;
		System.out.println(" Matriz 1: ");
		Matriz m= new Matriz(alto,ancho);
		for (int i=0;i<alto;i++) {
			for (int j=0;j<ancho;j++) 
			  m.set(i,j,(int)(Math.random()*10));
		}
		
		m.imprimeAConsola();
		
		System.out.println(" Matriz 2: ");
		Matriz m2= new Matriz(alto,ancho);
		for (int i=0;i<alto;i++) {
			for (int j=0;j<ancho;j++) 
			  m2.set(i,j,(int)(Math.random()*10));
		}
		m2.imprimeAConsola();
	    try  {
	       System.out.print("¿iguales? ");
		   System.out.println(m.equals(m2));
	       System.out.println("Suma: ");
	       m.suma(m2);
		   m.imprimeAConsola();
		   System.out.println("Multiplicacion: ");
		   m.multiplica(m2);
		   m.imprimeAConsola();
	    } catch (DimensionException e) {
	    	System.out.println(e);
	    	System.out.println("Error con la matriz:");
	        Matriz erronea= e.devuelveMatrizErronea();
	        erronea.imprimeAConsola();
	    }
	}
}


