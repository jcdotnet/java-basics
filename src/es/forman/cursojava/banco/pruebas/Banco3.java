package es.forman.cursojava.banco.pruebas;

import es.forman.cursojava.banco.cuentas.*;

import java.util.*;

/**
 * Representa un Banco o Caja de Ahorros.
 * CAMBIAMOS IMPLEMENTACION DE ARRAY A MAPS GENERICOS
 * @author Miguel Angel Garcia
 *
 */

// 
public class Banco3 implements Iterable {
	private HashMap <String,CuentaCorriente> cuentas;
	private String identificadorBanco;
	
	/**
	 * 
	 * @param numeroCuentas
	 * @param identificadorBanco
	 * @deprecated No usar este constructorl usar colecciones en          * vez de arrays no necesitamos especificar el tamaño (nº             * cuentas) 
	 * 
	 */
	public Banco3(int numeroCuentas, String identificadorBanco) {
		this.cuentas = new HashMap<String, CuentaCorriente> ();
		this.identificadorBanco = identificadorBanco;
	}
	public Banco3(String identificadorBanco) {
		this(10,identificadorBanco);
	}
	
	public String getIdentificador() {
		return this.identificadorBanco;
	}
	
	public int getNumeroCuentas() {
		return this.cuentas.size();
	}
	public void borraCuenta(Cuenta c) {
	        this.cuentas.remove(c.getNumero());
	}
	public String addCuenta(CuentaCorriente c) {  // TODO throws BancoCompletoException {
		  
		CuentaCorriente cAnt= this.cuentas.put(c.getNumero(), c);
		if (cAnt==null)
			return "insert OK de"+c.getNumero();
		else
			return "update Ok de la cuenta"+c.getNumero();
		
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
	    Iterator iter=cuentas.keySet().iterator();
	    while (iter.hasNext())  {
	    	Cuenta aux=(Cuenta) iter.next();
			if (numeroCuenta.equals(aux.getNumero()))
				cuentaDestino = aux;
		}
		return cuentaDestino;
	}
        
        /*con enhanced for*/
       /*for (CuentaCorriente cuentaActual:this.cuentas){
	   if (cuentaactual.equals(numeroCuenta)){
		cuentaDestino=cuentaActual;
		break;
	   }
	}
        */
	/* otra forma: acceso directo (solo para maps)
	 * return this.get(numeroCuenta); 
	 */ 
	
	
	/* hacer el toString para probarlo despues*/
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
	
	public void fusiona(Banco3 banco2) {
		this.cuentas.putAll(banco2.getListaCuentas());
	}

        // hacemos que banco sea Iterable, como las colecciones
	public Iterator iterator() {
		return this.cuentas.values().iterator();
	}
}
