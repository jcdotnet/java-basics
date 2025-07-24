package es.uma.oop.pract1.urna;

public class UsoUrna2 {
    static public void main(String [] args) {
        Urna u;
        char  c1,c2;
		int bb,bn;
		bb = Integer.parseInt(args[0]);
		bn = Integer.parseInt(args[1]);
		u = new Urna(bb,bn);
        while (u.quedanMasDeUnaBola()) {
            c1 = u.sacarBola();
            c2 = u.sacarBola();
            if (c1==c2)
               u.meterBola(Urna.BLANCA);
            else
               u.meterBola(Urna.NEGRA);
         }
         System.out.println("la bola que queda es " + u.sacarBola());
    }
}
