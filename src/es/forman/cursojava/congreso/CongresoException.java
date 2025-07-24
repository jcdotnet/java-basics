package es.forman.cursojava.congreso;

public class CongresoException extends Exception {
    private String error;
	public CongresoException(String error) {
		this.error=error;
	}
	
	public String toString() {
		return "EXCEPCION: "+this.error;
	}
}
