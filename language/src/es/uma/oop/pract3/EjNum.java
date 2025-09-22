package es.uma.oop.pract3;

import java.util.*;
class EjNum  {
	static public void main(String [] args)  {
		Random r = new Random();
		// Crear la lista y mostrarla
		List l = new ArrayList();
		for(int i=0;i<100;i++)
			// l.add(new Integer(r.nextInt(100)));
			l.add(r.nextInt(100));
		System.out.println(l);
		// Sin repeticiones
		Set s = new HashSet(l);
		System.out.println(s);
		// Sin repeticiones y ordenado
		SortedSet ss = new TreeSet(l);
		System.out.println(ss);
		// Cuantas veces aparece cada número
		SortedMap m = new TreeMap();
		for(Iterator it=l.iterator();it.hasNext();) {
			Integer n = (Integer)it.next();   // itera sobre l
			Integer veces = (Integer)m.get(n); 
			if (veces==null)
				// veces = new Integer(0);
				veces = 0;
			int nveces = veces.intValue();
			// m.put(n,new Integer(nveces+1));
			m.put(n, nveces+1);
		}
		System.out.println(m);	
	}
}
			