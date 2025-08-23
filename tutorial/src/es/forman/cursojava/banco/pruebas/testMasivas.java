package es.forman.cursojava.banco.pruebas;
import es.forman.cursojava.banco.cuentas.CuentaCorriente;

public class testMasivas {
	public static void main(String[] args){
		
		CuentaCorriente c1=new CuentaCorriente(100f,"1");
		CuentaCorriente c2=new CuentaCorriente(150f,"2");
		CuentaCorriente c3=new CuentaCorriente(300f,"3");
		
		Banco2 b1=new Banco2("Banco1");
		b1.addCuenta(c1);
		b1.addCuenta(c2);
		b1.addCuenta(c3);
		
		
		CuentaCorriente c4=new CuentaCorriente(100f,"4");
		CuentaCorriente c5=new CuentaCorriente(150f,"5");
		CuentaCorriente c6=new CuentaCorriente(300f,"6");
		
		Banco2 b2=new Banco2("Banco2");
		b2.addCuenta(c4);
		b2.addCuenta(c5);
		b2.addCuenta(c6);
		
		//b1.uneBanco(b2);
		
		
	}
}
