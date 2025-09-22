package es.forman.cursojava.banco.clientes;

import es.forman.cursojava.banco.cuentas.IFCuenta;

public class Cliente {
	private String nombre;
	private String dni;
	private IFCuenta cuenta;
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDni() {
		return dni;
	}
	public void setCuenta(IFCuenta cuenta) {
		this.cuenta = cuenta;
	}
	public IFCuenta getCuenta() {
		return cuenta;
	}
}
