package es.forman.cursojava.matrices;

public class DimensionException extends Exception {
	Matriz incorrecta;
	String excepcion;
	
	public DimensionException(Matriz m, int tipo) {
		this.incorrecta=m;
		if (tipo==1) 
			this.excepcion="ERROR DIMENSION MATRIZ";
		else if (tipo==2) 
			this.excepcion="MATRIZ VACIA";
		
	}
    public String toString() {
    	return "Excepcion: "+ excepcion;
    }
	public Matriz devuelveMatrizErronea() {
		if  (this.incorrecta!=null) {
			return this.incorrecta;
			
		}
		return null;
		
	}
    
}
