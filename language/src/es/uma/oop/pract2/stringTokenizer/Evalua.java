package es.uma.oop.pract2.stringTokenizer;

import java.util.StringTokenizer;

public class Evalua {
    public static void main (String args[]) {
        RegOp rg = new RegOp();
        StringTokenizer s = null;
        try {
            s = new StringTokenizer(args[0]," ,:;");
            while (s.hasMoreTokens()) {
                String t = s.nextToken();
                if (rg.esOperacion(t))
                    rg.opera(t);
                else 
                    rg.tomaDigito(t);
            }
            System.out.println("Resultado = "+rg.resultado());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ERROR: hay que dar la expresion");
            System.exit(0);
        } catch (RegOpException e) {
            System.out.println("ERROR: "+e.getMessage());
            System.exit(0);
        }
    }
}