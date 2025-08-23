package es.forman.cursojava.banco.bancoset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import es.forman.cursojava.banco.cuentas.Cuenta;
import es.forman.cursojava.banco.cuentas.CuentaCorriente;

/**
 * Representa un Banco o Caja de Ahorros.
 * Implementado con ArrayList
 * @author Miguel Angel Garcia
 *
 */
public class Banco implements Iterable {
	private TreeSet<CuentaCorriente> cuentas;
	private String identificadorBanco;

	public Banco(String identificadorBanco) {
		this(10, identificadorBanco);		// Empleo 10 como valor porque si no le paso nada, por defecto el tama�o del ArrayList es 10 (ver JavaDoc de J2SE)
	}

	/**
	 * 
	 * @param numeroCuentas
	 * @param identificadorBanco
	 * @deprecated No usar este constructor, ya no necesitamos especificar el tama�o.
	 */
	public Banco(int numeroCuentas, String identificadorBanco) {
		this.cuentas = new TreeSet();
		this.identificadorBanco = identificadorBanco;
	}
	
	public String getIdentificador() {
		return this.identificadorBanco;
	}
	
	public int getNumeroCuentas() {
		return this.cuentas.size();
	}
	
	public boolean addCuenta(CuentaCorriente c) {  // TODO throws BancoCompletoException {
		return this.cuentas.add(c);
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
	    /* Forma 1: 
		for (int i=0; i<this.cuentas.size() && cuentaDestino == null; i++)   {
			if (numeroCuenta.equals(((Cuenta)(this.cuentas.get(i))).getNumero())) 
				cuentaDestino = (Cuenta)this.cuentas.get(i);
		}
		*/
	    /* Forma 2: mediante un Iterator
		Iterator itera = this.cuentas.iterator();
		while (itera.hasNext() && cuentaDestino == null)  {
			Cuenta cuentaActual = (Cuenta)itera.next();
			if (cuentaActual.equals(numeroCuenta))
				cuentaDestino = cuentaActual;
		}
		*/
	    /* Forma 3: enhanced FOR */
	    for (CuentaCorriente cuentaActual:this.cuentas) {
	    	if (cuentaActual.equals(numeroCuenta))  {
	    		cuentaDestino = cuentaActual;
	    		break;
	    	}
	    }
		
		return cuentaDestino;
	}
	
	public void borraCuenta(Cuenta cuentaABorrar) {
		if (cuentaABorrar==null)
			return;
		this.cuentas.remove(cuentaABorrar);
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		Iterator iterador = this.cuentas.iterator();
		while (iterador.hasNext())
			sb.append(((CuentaCorriente)iterador.next()).toString()).append("\n");
		sb.append("*****");
		// Si queremos repetir la iteraci�n, deberemos obtener el iterador de nuevo.
		//iterador = this.cuentas.iterator();		// Lo devuelve apuntando de nuevo al principio.
		//sb.append(iterador.next());
		return sb.toString();
	}
	
	public TreeSet<CuentaCorriente> getListaCuentas() {
		return this.cuentas;
	}
	
	public void fusiona(Banco bancoOpado) {
		this.cuentas.addAll(bancoOpado.getListaCuentas());
	}

	public Iterator iterator() {
		return this.cuentas.iterator();
	}
}
