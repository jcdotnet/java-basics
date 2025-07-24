package es.uma.oop.pract1.urna;

public class UsoUrna {
    static public void main(String [] args) {
        Urna u = new Urna(32,45);
        char  c1,c2;
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
