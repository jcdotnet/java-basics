package es.uma.oop.pract1.urna;

public class Urna {
	public final static char BLANCA = 'b';  // constantes
	public final static char NEGRA = 'n';   
	protected int bolasBlancas;        // variables miembro
	protected int bolasNegras;

	public Urna(int bb, int bn) {        //constructor de clase
		bolasBlancas = bb;
		bolasNegras  = bn;
	}
	                                         // metodos 
	public void meterBola(char color) {       
		if (color==BLANCA) bolasBlancas++;
		else               bolasNegras++;
	}
	
	public char sacarBola() {
		int total;
		int na;
		if (!quedanBolas()) {
			System.out.println("ERROR: sacarBolas(). No hay bolas");
			System.exit(0);
		}
		na = (int)Math.random()*this.totalBolas();
		if (na < bolasBlancas) {
			bolasBlancas--;
			return BLANCA;
		} else {
			bolasNegras--;
			return NEGRA;
		}
	}
	
	public boolean quedanBolas() {
		return (this.totalBolas() > 0);
	}
	
	public boolean quedanMasDeUnaBola() {
		return (this.totalBolas() > 1);
	}

	public boolean dosIguales() {
		char b1,b2;
		if (!quedanMasDeUnaBola()) {
			System.out.println("ERROR: dosIguales. no hay dos bolas");
			System.exit(0);
		}
		b1 = sacarBola();
		b2 = sacarBola();
		meterBola(b1);
		meterBola(b2);
		return (b1==b2);
	}
	
	protected int totalBolas() {
		return bolasBlancas + bolasNegras;
	}
}

