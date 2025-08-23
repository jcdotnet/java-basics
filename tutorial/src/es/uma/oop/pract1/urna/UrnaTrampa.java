package es.uma.oop.pract1.urna;

public class UrnaTrampa extends Urna {
	private static final double PROBCAMBIO = 0.2;
	private static final int TOPE=10;
	private int contadorBS;
    
    UrnaTrampa(int bb, int bn)     {
       	super(bb,bn);
		contadorBS=0;
    }
    public char sacarBola() {
        char c = super.sacarBola();
		contadorBS++;
		if (contadorBS==TOPE) {
			contadorBS = 0;
        	if (Math.random()< PROBCAMBIO)  {
				int temp = bolasBlancas;
				bolasBlancas = bolasNegras;
				bolasNegras = temp;
			}
		}
       return c;
    }
}
