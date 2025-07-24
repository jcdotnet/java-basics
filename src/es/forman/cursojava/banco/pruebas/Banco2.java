package es.forman.cursojava.banco.pruebas;

import es.forman.cursojava.banco.cuentas.Cuenta;

import java.util.*;

/**
 * Representa un Banco o Caja de Ahorros.
 * @author Miguel Angel Garcia
 *
 */

// CAMBIAMOS IMPLEMENTACION DE ARRAY A ARRAYLIST
public class Banco2 {
	private ArrayList cuentas;
	private String identificadorBanco;
	
	/**
	 * 
	 * @param numeroCuentas
	 * @param identificadorBanco
	 * @deprecated No usar este constructor ya q no necesitamos 
	 * necesitamos saber el numero de cuentas a priori
	 */
	public Banco2(int numeroCuentas, String identificadorBanco) {
		this.cuentas = new ArrayList();
		this.identificadorBanco = identificadorBanco;
	}
	public Banco2(String identificadorBanco) {
		this(10,identificadorBanco);
	}
	
	public String getIdentificador() {
		return this.identificadorBanco;
	}
	
	public int getNumeroCuentas() {
		return this.cuentas.size();
	}
	public void borraCuenta(Cuenta c) {
         /* al tener equals definido para CuentaCorriente, sino
           tendriamos que recorrer y comparar por numero cuenta */
	        this.cuentas.remove(c);
	}
	public boolean addCuenta(Cuenta c) {  // TODO throws BancoCompletoException {	
			return this.cuentas.add(c);
		
	}
	
	/**
	 * Busca una cuenta por el n�mero proporcionado; si no la encuentra, devuelve null.
	 * @param numeroCuenta
	 * @return
	 */
	public Cuenta getCuenta(String numeroCuenta)  {
		if (numeroCuenta == null ||  numeroCuenta.equals(""))
			return null;
		boolean encontrado = false;
	    Cuenta cuentaDestino = null;
		for (int i=0; i<this.cuentas.size()&& i <= this.cuentas.size()&& cuentaDestino == null; i++) {  
			/* al tener sobreescrito equals en Cuenta podria
			 * comparar directamente las cuentas en vez de 
			 * usar el equals de String, */
			if (numeroCuenta.equals(((Cuenta) cuentas.get(i)).getNumero()))
				cuentaDestino = ((Cuenta) cuentas.get(i));
		}
		return cuentaDestino;
	}
	/*
	 Usando iteradores:
	 public Cuenta getCuenta(String numeroCuenta)  {
		if (numeroCuenta == null ||  numeroCuenta.equals(""))
			return null;
		boolean encontrado = false;
	    Cuenta cuentaDestino = null;
		Iterador iter= cuentas.iterador();
		while (iter.hasNext())
		    Cuenta aux=(Cuenta) iter.next();
			/* podria comparar las cuentas directamente al tener hecho el equals de cuentas /*
			if (numeroCuenta.equals(aux.getNumero()))
				cuentaDestino = aux;
		}
		return cuentaDestino;
	}
	*/
	
	/* Mediante enhanced FOR */
    /*
    public Cuenta getCuenta(String numeroCuenta)  {
	if (numeroCuenta == null ||  numeroCuenta.equals(""))
			return null;
	boolean encontrado = false;
	Cuenta cuentaDestino = null;
	for (CuentaCorriente aux:this.cuentas) {
    	// aqui s� uso el equals de Cuenta, no de strings
    	if (aux.equals(numeroCuenta))  {
    		cuentaDestino = aux;
    		break;
    	}
    }
    return cuentaDestino;
    }*/
	
	/**
     * reescribimos toString para representar al objeto
     * @return
     */
	public String toString() {
	 StringBuffer sb= new StringBuffer();
	 Iterator iterador = this.cuentas.iterator();
		while (iterador.hasNext())
			sb.append(iterador.next()).append("\n");
		return sb.toString();			
	}
	
	// devuelve la coleccion (las cuentas del banco)
	public ArrayList getCuentas(){
		return this.cuentas;
	}
	
	// fusiona 2 bancos: une todas sus cuentas
	public void fusiona(Banco2 banco2) {
		this.cuentas.addAll(banco2.getCuentas());
	}
}
