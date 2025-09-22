package es.uma.oop.pract1.urna;

class UsoUrnaTrampa {
    static public void main(String [] args) {
        UrnaTrampa u = new UrnaTrampa(32,45);
        char  c1,c2;
        while (u.quedanMasDeUnaBola()) {
            c1 = u.sacarBola();
            c2 = u.sacarBola();
            if (c1==c2)
               u.meterBola(UrnaTrampa.BLANCA);
            else
               u.meterBola(UrnaTrampa.NEGRA);
         }
         System.out.println("la bola que queda es " + u.sacarBola());
    }
}
