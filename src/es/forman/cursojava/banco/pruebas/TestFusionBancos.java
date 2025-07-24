package es.forman.cursojava.banco.pruebas;


import es.forman.cursojava.banco.cuentas.*;

public class TestFusionBancos {

	/**
	 * @param args
	 */
        // probar con Banco2,BancoSet y Banco3
	public static void main(String[] args) {
		// Inicialización
		Banco2 banco= new Banco2("BBVA");
		banco.addCuenta(new CuentaCorriente(2300.0f, "0182.0000"));
		banco.addCuenta(new CuentaCorriente(1500.0f, "0182.0001"));
		banco.addCuenta(new CuentaCorriente(1870.0f, "0182.0002"));
		banco.addCuenta(new CuentaCorriente(2310.0f, "0182.0003"));
		banco.addCuenta(new CuentaCorriente(543.0f, "0182.0004"));
		banco.addCuenta(new CuentaCorriente(8900.0f, "0182.0005"));
		Banco2 banco2 = new Banco2("La Caixa");
		banco2.addCuenta(new CuentaCorriente(1300.0f, "2100.0000"));
		banco2.addCuenta(new CuentaCorriente(1400.0f, "2100.0001"));
		banco2.addCuenta(new CuentaCorriente(1670.0f, "2100.0002"));
		banco2.addCuenta(new CuentaCorriente(310.0f, "2100.0003"));
		banco2.addCuenta(new CuentaCorriente(5430.0f, "2100.0004"));
		
		// Operaciones
		banco.fusiona(banco2);
		System.out.println(banco);
	}

}
