package es.forman.cursojava.banco.pruebas;

import es.forman.cursojava.banco.cuentas.CuentaCorriente;

public class TestHash {
	public static void main(String[] args){
		
		CuentaCorriente c1=new CuentaCorriente(150f,"2");
		CuentaCorriente c2=new CuentaCorriente(150f,"2");
		
		Banco3 b=new Banco3("Banco");
		b.addCuenta(c1);
		b.addCuenta(c2);
		b.addCuenta(c2);
		
		b.borraCuenta(c1);
		
		b.borraCuenta(c2);
		
	
	}
	
	
	
	
}
