package es.forman.cursojava.banco;

import es.forman.cursojava.banco.cuentas.Cuenta;

/**
 * Representa un Banco o Caja de Ahorros.
 * @author Miguel Angel Garcia
 *
 */
public class Banco {
	private Cuenta[] cuentas;
	private int ultimaCuenta;
	private String identificadorBanco;
	
	public Banco(int numeroCuentas, String identificadorBanco) {
		this.cuentas = new Cuenta[numeroCuentas];
		this.identificadorBanco = identificadorBanco;
	}
	
	public String getIdentificador() {
		return this.identificadorBanco;
	}
	
	public int getNumeroCuentas() {
		return this.cuentas.length;
	}
	
	public void addCuenta(Cuenta c) {  // TODO throws BancoCompletoException {
		if (ultimaCuenta < this.cuentas.length)  {
			this.cuentas[ultimaCuenta] = c;
			ultimaCuenta++;
		}
	}
	
	/**
	 * Busca una cuenta por el número proporcionado; si no la encuentra, devuelve null.
	 * @param numeroCuenta
	 * @return
	 */
	public Cuenta getCuenta(String numeroCuenta)  {
		if (numeroCuenta == null ||  numeroCuenta.equals(""))
			return null;
		boolean encontrado = false;
	    Cuenta cuentaDestino = null;
		for (int i=0; i<this.cuentas.length && i <= this.ultimaCuenta && cuentaDestino == null; i++)   {
			if (numeroCuenta.equals(cuentas[i].getNumero())) 
				cuentaDestino = cuentas[i];
		}
		return cuentaDestino;
	}
}
