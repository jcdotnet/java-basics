package es.uma.oop.pract5;

public class Tk implements Comparable {
protected String palabra;
protected String titulo;
	public Tk(String t, String p) {
		titulo = t;
		palabra = p;
	}
	public String preTk() {
		int i = titulo.indexOf(palabra);
		if (i<1)
			return "";
		return titulo.substring(0,i-1);
	}
	public String posTk() {
		int i = titulo.indexOf(palabra);
		if (i<0)
			return titulo;
		return titulo.substring(i);
	}
	public boolean equals(Tk tk) {
	if (titulo.equalsIgnoreCase(tk.titulo))
		return palabra.equalsIgnoreCase(tk.palabra);
	else
		return false;
	}
	public int compareTo(Object o) {
		Tk tk = (Tk)o;
	int i = palabra.compareToIgnoreCase(tk.palabra);
	if (i!=0)
		return i;
	else
		return titulo.compareToIgnoreCase(tk.titulo);
	}
}