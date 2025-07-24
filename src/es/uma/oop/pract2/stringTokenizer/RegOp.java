package es.uma.oop.pract2.stringTokenizer;

import es.uma.oop.listas.Pila;
import es.uma.oop.listas.EmptyPilaException;

class RegOp {
    protected String [] ops ={"+","-","*","/"};
    protected Pila datos;
    
    // nuestro tipo es una pila de operandos
    public RegOp() {
        datos = new Pila();
    }
    
    // esOperacion recibe una cadena y dev true si es un signo
    // de puntuacion
    public boolean esOperacion(String s) {
        boolean es = false;
        for(int i = 0 ; i<ops.length; i++) 
            if (s.equals(ops[i]))
                es = true;
        return es;
    }
    
    // tomaDigito mete la cadena q se pasa como param
    // en la cola, lo mete como double
    public void tomaDigito(String s) throws RegOpException {
        try {
            //datos.push(new Double(s));
            datos.push(Double.valueOf(s));
        } catch (NumberFormatException e) {
            throw new RegOpException("Numero mal formado");
        }
    }    
    
    // recibe como param un operador y opera con los dos elem q 
    // tengamos en la cola
    public void opera(String s) throws RegOpException {
        try {	
            double y = ((Double)datos.pop()).doubleValue();
            double x = ((Double)datos.pop()).doubleValue();
            if (s.equals("+"))
                datos.push(new Double(x+y));
            else if (s.equals("-"))
                datos.push(new Double(x-y));
            else if (s.equals("*"))
                datos.push(new Double(x*y));
            else if (s.equals("/"))
                datos.push(new Double(x/y));
        } catch (NumberFormatException e) {
            throw new RegOpException("Numero mal formado");
        } catch (EmptyPilaException e) {
            throw new RegOpException("Expresion mal construida");
        }
    }
    
    // resultado saca un elem  de la cola 
    // para ello debe representar un double
    // y debe quedar un  elem en la cola 
    public double resultado() throws RegOpException {
        try {
            return ((Double)datos.pop()).doubleValue();
        } catch (NumberFormatException e) {
            throw new RegOpException("Numero mal formado");
        } catch (EmptyPilaException e) {
            throw new RegOpException("Expresionmal construida");
        }
    }       
}