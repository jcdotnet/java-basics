package es.forman.cursojava.banco;

import es.forman.cursojava.banco.cuentas.CuentaCorriente;

public class TestTransacciones {
	
	private void inicializaBanco(Banco b) {
		for (int i=0; i<b.getNumeroCuentas(); i++)  {
			float cantidad = (float)(1000 + 2000*Math.random());
			String numeroCuenta = b.getIdentificador() + "0000" + String.valueOf(i);
			b.addCuenta(new CuentaCorriente(cantidad, numeroCuenta));
		}
	}
	
	private void inicializaBatch(Banco b, Batch ba) {
		ba.setBanco(b);
		Transaccion trans;
		trans= new Transaccion(b.getIdentificador() + "00001",
				b.getIdentificador() + "00002", 2000.0f);
		ba.addTransaccion(trans);
		trans= new Transaccion(b.getIdentificador() + "00002",
				b.getIdentificador() + "00004", 2500.0f);
		ba.addTransaccion(trans);
		trans= new Transaccion(b.getIdentificador() + "00006",
				b.getIdentificador() + "00021", 1500.0f);
		ba.addTransaccion(trans);
		trans= new Transaccion(b.getIdentificador() + "00027",
				b.getIdentificador() + "00003", 4000.0f);
		ba.addTransaccion(trans);
		trans= new Transaccion(b.getIdentificador() + "00001",
				b.getIdentificador() + "00005", 1000.0f);
		ba.addTransaccion(trans);
		trans= new Transaccion(b.getIdentificador() + "00001",
				b.getIdentificador() + "00006", 1500.0f);
		ba.addTransaccion(trans);
		trans= new Transaccion(b.getIdentificador() + "00008",
				b.getIdentificador() + "00019", 1800.0f);
		ba.addTransaccion(trans);
	}
	
	public static void main(String[] args) {
		Banco banco = new Banco(20, "1234.5678.90.");
		Batch batchJob = new Batch(20);
		TestTransacciones test = new TestTransacciones();
		test.inicializaBanco(banco);
		test.inicializaBatch(banco, batchJob);
		batchJob.setPrint(true);
		batchJob.ejecuta(false);		// Ejecuta sin iteración => 1 sólo intento / transacción.
	}

}
