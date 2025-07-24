package es.forman.cursojava.banco.bancomap;

import es.forman.cursojava.banco.cuentas.CuentaCorriente;

public class TestFusionBancos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Inicialización
		Banco banco= new Banco("BBVA");
		banco.addCuenta(new CuentaCorriente(2300.0f, "0182.0000"));
		banco.addCuenta(new CuentaCorriente(1500.0f, "0182.0001"));
		banco.addCuenta(new CuentaCorriente(1870.0f, "0182.0002"));
		banco.addCuenta(new CuentaCorriente(2310.0f, "0182.0003"));
		banco.addCuenta(new CuentaCorriente(543.0f, "0182.0004"));
		banco.addCuenta(new CuentaCorriente(8900.0f, "0182.0005"));
		Banco bancoOpado = new Banco("La Caixa");
		bancoOpado.addCuenta(new CuentaCorriente(1300.0f, "2100.0000"));
		bancoOpado.addCuenta(new CuentaCorriente(1400.0f, "2100.0001"));
		bancoOpado.addCuenta(new CuentaCorriente(1670.0f, "2100.0002"));
		bancoOpado.addCuenta(new CuentaCorriente(310.0f, "2100.0003"));
		bancoOpado.addCuenta(new CuentaCorriente(5430.0f, "2100.0004"));
		
		// Operaciones
		banco.fusiona(bancoOpado);
		System.out.println(banco);
	}

}
