package es.uma.oop.pract1.punto;

class PruebaPixel1 {
    public static void main(String [] args) {
        Pixel x = new Pixel(4,3,(byte)2);
        Punto p = new Punto(4,3);
        double d1,d2;
        d1 = x.distancia(1,1); // de pixel
        d2 = p.distancia(1,1); // de punto
        System.out.println("Distancia pixel:" + d1);
        System.out.println("Distancia punto:" + d2);
    }
}


