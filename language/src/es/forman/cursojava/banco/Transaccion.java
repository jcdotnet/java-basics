package es.forman.cursojava.banco;

import es.forman.cursojava.banco.cuentas.Cuenta;

public class Transaccion {
	private Cuenta[] cuentas = new Cuenta[2];
	private static final int ORIGEN = 0;
	private static final int DESTINO = 1;
	private String[] numCuenta = new String[2];
	private int estado;
	private float cantidad;	// A traspasar de una cuenta a otra.
	private Banco banco;		// Sobre el que ejecutaremos la transacción.
	private boolean debeImprimir;
	public static final int TRANSACCION_NUEVA = 0;
	public static final int CUENTA_ORIGEN_INVALIDA = 1;
	public static final int CUENTA_DESTINO_INVALIDA = 2;
	public static final int CUENTAS_VALIDAS = 3;
	public static final int DINERO_INSUFICIENTE = 4;
	public static final int TRANSACCION_REALIZADA = 5;
	public static final String[] ESTADO = {
		"Transacción nueva", 
		"Cuenta de origen no válida",
		"Cuenta de destino inválida",
		"Cuentas comprobadas pero transacción no ejecutada todavía",
		"Cuentas válidas, saldo insuficiente",
		"Transacción realizada correctamente"
	};
	
	public Transaccion(String cuentaOrigen, String cuentaDestino, float cantidad) {
		this.numCuenta[ORIGEN] = cuentaOrigen;
		this.numCuenta[DESTINO] = cuentaDestino;
		this.setCantidad(cantidad);
	}
	
	public int getEstado() {
		return this.estado;
	}
	
	public void setEstado(int estado) {
		this.estado =estado;
	}
	
	public float getCantidad() {
		return this.cantidad;
	}
	
	public void setCantidad(float cantidad)  {
		this.cantidad = cantidad;
	}
	
	/**
	 * Establece el Banco sobre el que se ejecutará la transacción.
	 * @param banco
	 */
	public void setBanco(Banco banco)  {
		this.banco = banco;
	}
	
	/**
	 * Comprueba si el banco está establecido. Una transacción sólo se puede ejecutar si se conoce el banco.
	 * @return
	 */
	public boolean isBancoNoEstablecido() {
		return this.banco == null;
	}
	
	/**
	 * Busca las cuentas en el banco. Si las encuentra, las enlaza a esta transacción y pone el estado a CUENTAS_VALIDAS.
	 * si no, pone el estado en cuenta origen y/o destino inválida.
	 * @return true si las encuentra; false si no.
	 */
	public boolean encuentraCuentas() {
		boolean resultado=false;
		if (this.isBancoNoEstablecido())
			return false;
		this.cuentas[ORIGEN] = this.banco.getCuenta(this.numCuenta[ORIGEN]);
		this.cuentas[DESTINO] = this.banco.getCuenta(this.numCuenta[DESTINO]);
		if (!this.isOrigenValido())
			this.setEstado(Transaccion.CUENTA_ORIGEN_INVALIDA);
		else if (!this.isDestinoValido())
			this.setEstado(Transaccion.CUENTA_DESTINO_INVALIDA);
		else {
			this.setEstado(Transaccion.CUENTAS_VALIDAS);
			resultado = true;
		}
		this.print();
		return resultado;
	}
	
	/**
	 * @return true si el origen es una cuenta válida, es decir el objeto cuenta[ORIGEN] se ha localizado y es no null.
	 */
	public boolean isOrigenValido() {
		return this.cuentas[ORIGEN] != null;
	}
	
	/**
	 * @return true si el destino es una cuenta válida, es decir el objeto cuenta[DESTINO] se ha localizado y es no null.
	 */
	public boolean isDestinoValido() {
		return this.cuentas[DESTINO] != null;
	}	
	
	/**
	 * Intenta ejecutar la transacción. Controla su estado para comprobar si es posible
	 * o no realizarla.
	 * @throws TransaccionException Cuando se intenta forzar la ejecución de una transacción que no está preparada
	 * para ello. Por ejemplo, una transacción no válida o no que haya sido ejecutada ya.
	 */
	public void ejecuta() throws TransaccionException {
		if (this.isBancoNoEstablecido())
			return;
		switch (getEstado())  {
			case Transaccion.TRANSACCION_NUEVA:
				if (!this.encuentraCuentas())			// Si encontrara las cuentas, pasa al siguiente CASE
					break;
			case Transaccion.CUENTAS_VALIDAS:  // Aquí ejecuta la transacción si hay saldo suficiente
				if (this.cuentas[ORIGEN].reintegra(this.getCantidad(), true) != 0)  {
					this.cuentas[DESTINO].ingresa(this.getCantidad());
					this.setEstado(Transaccion.TRANSACCION_REALIZADA);
				}
				else this.setEstado(Transaccion.DINERO_INSUFICIENTE);
				this.print();
				break;
			default:		// Casos extraños
				throw new TransaccionException(this);
		}
	}
	
	/**
	 * Sobreescribe el toString() de la clase Object para producir una salida String del objeto Transacción.
	 * Tiene en cuenta el estado en que se encuentra la transacción.
	 */
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Transaccion ");
		if (this.cuentas[ORIGEN] == null)
			sb.append(this.numCuenta[ORIGEN]);
		else
			sb.append(this.cuentas[ORIGEN].getNumero()).append(" [").append(this.cuentas[ORIGEN].getDisponible()).append("]");		
		sb.append(" a ");
		if (this.cuentas[DESTINO] == null)
			sb.append(this.numCuenta[DESTINO]);
		else
			sb.append(this.cuentas[DESTINO].getNumero()).append(" [").append(this.cuentas[DESTINO].getDisponible()).append("]");
		sb.append(" por ");
		sb.append(this.getCantidad());
		sb.append(" --> ");
		sb.append(Transaccion.ESTADO[this.getEstado()]);
		sb.append("\n");
		return sb.toString();
	}
	
	/**
	 * Controla la impresión de la transacción tras cada paso de ejecución.
	 * @param b true si queremos que imprima tras cada paso de ejecución.
	 */
	public void setPrint(boolean b)  {
		this.debeImprimir = b;
	}
	
	/**
	 * Imprime la transacción en su estado actual, sólo si se ha realizado
	 * un setPrint(true) antes.
	 *
	 */
	public void print() {
		if (this.debeImprimir)
			System.out.println(this.toString());
	}
}
