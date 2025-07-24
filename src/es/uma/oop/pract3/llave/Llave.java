package es.uma.oop.pract3.llave;

public class Llave {
	static final int TOPEPIN=10;
	protected int nPin;
	protected int [] pin;
	public Llave(int n) {
		nPin = n;
		pin = new int[n];
		for (int i=0;i<n;i++)
				pin[i]=TOPEPIN;
	}
	public void lima(int p, int c) {
		if (pin[p]<c)
			pin[p]=0;
		else
			pin[p] = pin[p] - c;
	}
	public int pines() {
		return nPin;
	}
	public int pin(int i) {
		return pin[i];
	}
}