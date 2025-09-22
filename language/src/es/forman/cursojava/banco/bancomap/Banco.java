package es.forman.cursojava.banco.bancomap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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
	private HashMap<String,CuentaCorriente> cuentas;
	private String identificadorBanco;

	public Banco(String identificadorBanco) {
		// Empleo 10 como valor porque si no le paso nada, por defecto el tamaño del ArrayList es 10 (ver JavaDoc de J2SE)
		this(10, identificadorBanco);
	}

	/**
	 * 
	 * @param numeroCuentas
	 * @param identificadorBanco
	 * @deprecated No usar este constructor, ya no necesitamos especificar el tamaño.
	 */
	public Banco(int numeroCuentas, String identificadorBanco) {
		this.cuentas = new HashMap<String, CuentaCorriente> ();
		this.identificadorBanco = identificadorBanco;
	}
	
	public String getIdentificador() {
		return this.identificadorBanco;
	}
	
	public int getNumeroCuentas() {
		return this.cuentas.size();
	}
	
	public String addCuenta(CuentaCorriente c) {  // TODO throws BancoCompletoException {
		CuentaCorriente cuentaAntigua = this.cuentas.put(c.getNumero(), c);
		if (cuentaAntigua == null)
			return "Insert OK de " + c.getNumero();
		else
			return "Update OK de la cuenta " + cuentaAntigua.getNumero();
	}
	
	/**
	 * Busca una cuenta por el número proporcionado; si no la encuentra, devuelve null.
	 * @param numeroCuenta
	 * @return
	 */
	public Cuenta getCuenta(String numeroCuenta)  {
		if (numeroCuenta == null ||  numeroCuenta.equals(""))
			return null;
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
	    /* Forma 3: enhanced FOR 
	    for (CuentaCorriente cuentaActual:this.cuentas.values()) {
	    	if (cuentaActual.equals(numeroCuenta))  {
	    		cuentaDestino = cuentaActual;
	    		break;
	    	}
	    }
		*/
	    /* Forma 4: Acceso directo (solo para Maps) */
		return this.cuentas.get(numeroCuenta);
	}
	
	public void borraCuenta(Cuenta cuentaABorrar) {
		if (cuentaABorrar==null)
			return;
		this.cuentas.remove(cuentaABorrar.getNumero());
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		/* Forma 1
		Iterator iterador = this.cuentas.values().iterator();
		while (iterador.hasNext())
			sb.append(((CuentaCorriente)iterador.next()).toString()).append("\n");
		sb.append("*****");
		*/
		Iterator iterador = this.cuentas.entrySet().iterator();
		while (iterador.hasNext())  {
			Map.Entry pareja = (Map.Entry)iterador.next();
			sb.append(pareja.getKey()).append(" ").append(pareja.getValue());
		}
		return sb.toString();
	}
	
	public Map<String,CuentaCorriente> getListaCuentas() {
		return this.cuentas;
	}
	
	public void fusiona(Banco bancoOpado) {
		this.cuentas.putAll(bancoOpado.getListaCuentas());
	}

	public Iterator iterator() {
		return this.cuentas.values().iterator();
	}
}
