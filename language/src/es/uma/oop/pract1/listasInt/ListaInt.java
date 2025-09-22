package es.uma.oop.pract1.listasInt;

public class ListaInt {
protected NodoInt lista;

public ListaInt() {
   lista=null;
}
   
public boolean isEmpty() {
	 return lista==null;
}

public void addFirst(int n) {
	lista = new NodoInt(n,lista);
}

public void add(int n) {
	this.addFirst(n);
}

public void addLast(int n) {
	if (lista==null)
	  this.addFirst(n);
	else {
	  NodoInt p = lista;	
	  while (p.sig !=null) 
	    	p=p.sig;
	  p.sig = new NodoInt(n,p.sig);
	}
}

public int getFirst() {
	return lista.dato;
}

public int getLast() {
	NodoInt p = lista;
	while (p.sig!=null) 
	   p=p.sig;
	return p.dato;
}
 
public int removeFirst() {
	int res;
	res= lista.dato;
	lista=lista.sig;	  
	return res;
}

public int removeLast() {
	int res;
	NodoInt p= lista;
	while (p.sig.sig!=null) 
		p=p.sig;
	res= p.sig.dato;
	p.sig=null;
	return res;
}

public String toString() {
	String cadena;
	cadena="( ";
	NodoInt p=lista;
    while (p!=null) {
    	cadena+=p.dato;
    	cadena+=" ";
    	p=p.sig;
    }
    cadena+= " )";
    return cadena;
}

}