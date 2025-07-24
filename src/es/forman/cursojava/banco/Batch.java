package es.forman.cursojava.banco;

/**
 * Proceso batch. Conjunto de transacciones a aplicar sobre una serie de cuentas.
 * El cometido de esta clase es controlar el bucle de ejecuci�n de las transacciones, comprobando si se pueden o no
 * realizar y reintentando en caso necesario. Adem�s es el que notifica a cada transacci�n, el Banco sobre el cual
 * debe ejecutarse �sta.
 * @author Miguel Angel Garcia
 *
 */
public class Batch {
	private Transaccion[] transaccion;
	private int ultimaTransaccion;
	private Banco banco;  // relacion directa con objeto banco
	private boolean debeImprimir;
	
	public Batch(int numeroTransacciones) {
		this.transaccion = new Transaccion[numeroTransacciones];
	}
	
	public void addTransaccion(Transaccion t) {
		this.transaccion[ultimaTransaccion] = t;
		ultimaTransaccion++;
	}
	
	public int getNumeroTransacciones() {
		return this.ultimaTransaccion;
	}
	
	public int getMaxTransacciones() {
		return this.transaccion.length;
	}
	
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
	/**
	 * Si el banco ha sido asignado a este batch job, lo asigna a la transacci�n que recibe.
	 * @param trans
	 */
	public void asignaBanco(Transaccion trans)  {
		if (this.banco != null)
			trans.setBanco(this.banco);
	}
	
	public void setPrint(boolean b)  {
		this.debeImprimir = b;
	}
	
	/**
	 * Ejecuta todas las transacciones pendientes del batch actual.
	 * @param reintenta si es true, indica que una vez terminado el batch, debe intentar
	 * volver a ejecutar todas las transacciones que quedaron pendientes
	 *
	 */
	public void ejecuta(boolean reintenta) {
		int numCambios;
		do {
			numCambios = 0;
			for (int i=0; i<this.transaccion.length && i < this.ultimaTransaccion; i++) {
				this.transaccion[i].setPrint(true);
				this.asignaBanco(transaccion[i]);						// Le asigna el banco a la transacci�n.
				try {
					transaccion[i].ejecuta();
					if (transaccion[i].getEstado() == Transaccion.TRANSACCION_REALIZADA)
						numCambios++;
				}
				catch (TransaccionException te)  {
					// Si llega aqu�, se ha producido un error no esperado
					System.out.println("ERROR al intentar la transacci�n");
					System.out.println(te.getTransaccion().toString());		// OJO Esto puede ser peligroso: si getTransaccion diera null, producir�a una nueva excepci�n, dif�cil de depurar
				}
				System.out.println("****************");
			}
		} while (reintenta && numCambios > 0);
	}
}
