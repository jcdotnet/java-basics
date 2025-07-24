package es.forman.cursojava.banco.pruebas;


import es.forman.cursojava.banco.cuentas.CuentaCorriente;

public class TestBanco2 {

	/**
	 * @param args
	 */
	
	// cambiar a distintas implementaciones de banco:
	// Banco2, Banco3 y BancoSet
	public static void main(String[] args) {
		Banco2 banco = new Banco2("0182.0010");
		CuentaCorriente c1 = new CuentaCorriente(100.0f, "0001");
		System.out.println(banco.addCuenta(c1));
		CuentaCorriente c2 = new CuentaCorriente(100.0f, "0002");
		System.out.println(banco.addCuenta(c2));
		CuentaCorriente c3 = new CuentaCorriente(100.0f, "0003");
		System.out.println(banco.addCuenta(c3));
		CuentaCorriente c4 = new CuentaCorriente(100.0f, "0004");
		System.out.println(banco.addCuenta(c4));
		CuentaCorriente c5 = new CuentaCorriente(100.0f, "0005");
		System.out.println(banco.addCuenta(c5));
		System.out.println(banco.addCuenta(c2));
		banco.borraCuenta(c1);
		System.out.println(banco.addCuenta(c1));
		System.out.println(banco.addCuenta(c1));
		System.out.println(banco.addCuenta(c1));
		//banco.borraCuenta(c3);
		System.out.println(banco);
		
		
		/*
		/* Otra forma: Podemos crear un iterador en banco
		cuyo cuerpo ser�a: return this.cuentas.iterator();
		y recorrer las cuentas, mostrandolas por pantalla
		-> toString tiene q estar sobreescrito en Cuenta 
	    *
	
		Iterator iterator = banco.iterator();
		System.out.println("------------------");
		while (iterator.hasNext())
			System.out.println(((CuentaCorriente)(iterator.next())).toString());
	   */
	}  
}
