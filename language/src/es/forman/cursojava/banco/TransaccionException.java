package es.forman.cursojava.banco;

/**
 * Una excepci�n sobre una transacci�n recoge los errores excepcionales que no deber�an ocurrir.
 * No he considerado como tales los errores de tipo saldo insuficiente o cuenta incorrecta, sino
 * los del tipo "reintenta ejecutar una transacci�n ya ejecutada", por ejemplo.
 * @author Miguel Angel Garcia
 *
 */
public class TransaccionException extends Exception {
	private Transaccion transaccion;
	public TransaccionException(Transaccion transaccion)  {
		this.setTransaccion(transaccion);
	}
	public void setTransaccion(Transaccion transaccion) {
		this.transaccion = transaccion;
	}
	public Transaccion getTransaccion() {
		return transaccion;
	}
}
