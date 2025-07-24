package es.uma.oop.pract3.llave;

import java.util.*;
public class Cerradura {
	static final int TOPEBOMBIN=10;
	static final int MAXCORTES=4;
	protected int nBom;
	protected Set [] bombin;
	public Cerradura(int b) {
		nBom = b;
		bombin = new Set[b];
		for(int i = 0;i<b;i++)
			bombin[i]=new HashSet();
	}
	public void apertura(int b, int p) {
		Integer i = new Integer(p);
		bombin[b].add(i);
		if (bombin[b].size()>MAXCORTES)
			bombin[b].remove(i);
	}
	public boolean seAbreCon(Llave l) {
		if (l.pines() != nBom)
			return false;
		boolean sol = true;
		int i=0;
		while (i<nBom && sol) {
			sol = seAbreBombin(bombin[i].iterator(),l.pin(i));
			i++;
		}
		return sol;
	}
	private boolean seAbreBombin(Iterator i, int p) {
		boolean b = false;
		while (i.hasNext() && !b) 
			b = ((Integer)i.next()).intValue()+p==TOPEBOMBIN;
		return b;
	}
}
	
