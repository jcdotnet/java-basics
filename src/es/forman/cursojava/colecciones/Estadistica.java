package es.forman.cursojava.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Estadistica {
	
	public double getMedia(Collection<Double> c) {
		if (c==null || c.size() == 0)
			return 0.0;
		double resultado = 0.0;
		for (Iterator<Double> i=c.iterator(); i.hasNext();)
			resultado += i.next().doubleValue();
		return resultado/c.size();
	}
	
	/**
	 * Recibe una Collection y devuelve la mediana.
	 * @param c
	 * @return
	 */
	public double getMediana(Collection<Double> c) {
		if (c==null || c.size() == 0)
			return 0.0;
		ArrayList<Double> copiaOrdenada = Collections.list(Collections.enumeration(c));
		Collections.sort(copiaOrdenada);
		System.out.println(copiaOrdenada);
		Iterator i=copiaOrdenada.iterator();
		for (int contador=0; i.hasNext() && contador < copiaOrdenada.size()/2; contador++)
			i.next();
		return ((Double)i.next()).doubleValue();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Double> lista = new ArrayList<Double>();
		for (int i=0; i<args.length; i++)
			try {
				lista.add(Double.valueOf(args[i]));
			}
			catch (NumberFormatException ne) {
				System.out.println(args[i] + " no es un número; ignorándolo");
			}
		Estadistica estadistica = new Estadistica();
		System.out.println(estadistica.getMedia(lista));
		//Collections.sort(lista);
		System.out.println(lista);
		System.out.println(estadistica.getMediana(lista));
	}

}
