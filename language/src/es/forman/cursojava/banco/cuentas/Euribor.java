package es.forman.cursojava.banco.cuentas;

public class Euribor {
	private static float valor = 0.02f;
	public static float getValorActual() {
		return valor;
	}
	
	public static void setValorActual(float nuevoValor) {
		valor = nuevoValor;
	}
	
	public static void variaValorActual(float nuevoValor) {
		valor += nuevoValor;
	}
}
