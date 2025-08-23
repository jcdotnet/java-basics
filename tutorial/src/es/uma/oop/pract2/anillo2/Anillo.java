package es.uma.oop.pract2.anillo2;

public class Anillo {
	protected NodoAnillo marcado;
	protected NodoAnillo senalado;
	
	public Anillo(){
		marcado=null;
		senalado=null;
	}
	
	public boolean EsVacio (){
		return (senalado==null);
	}
	
	public void Insertar(Object o){
		if (EsVacio()){
			NodoAnillo n =  new NodoAnillo(o,null,null);
			senalado = n;
			senalado.sig=senalado;
			senalado.ant=senalado;
			
		}else {
			NodoAnillo n =  new NodoAnillo(o,senalado.sig,senalado);
			senalado.sig.ant=n;
			senalado.sig=n;
			senalado=n;
		}
	}
		
	public String toString() {
	  String s= new String();
	  if (!EsVacio()){
	    s = "Anillo(";
	  	marcado = senalado;
		s += marcado.dato+" ";
		marcado=marcado.sig;
		while (marcado!=senalado){
			s += marcado.dato+" ";
			marcado=marcado.sig;
		}
		s += ")";
	  }  
	  return s;
		  
	}	 
	
	public void Borra(){
		//duda
		if (marcado==senalado)
			marcado=null;
		
		if (!EsVacio()){
			if (senalado.sig==senalado)
				senalado=null;
			else{
				senalado.ant.sig=senalado.sig;
				senalado.sig.ant=senalado.ant;
				senalado=senalado.sig;
			}
		}
	}
	
	public void Marca(){
		marcado=senalado;
	}
	
	public void RotaDerecha(){
		senalado=senalado.ant;
	}
	
	public void RotaIzquierda(){
		senalado=senalado.sig;
	}
	public void RotaHastaMarca(){
		if (marcado==null) 
			senalado=marcado;
		else{
			if ((numNodos()/2)>difer()){
				while (marcado!=senalado){
					RotaDerecha();
				}
			}else{
				while (marcado!=senalado){
					RotaIzquierda();
				}
			}
		}
	
	
	}
	int numNodos(){
		if (!EsVacio()) {
			NodoAnillo aux = senalado;
			int x =1;
			while (aux.sig!=senalado) {
				 aux=aux.sig;
				 x++;
			}
	
			return x;
		}else{
			return 0;
		}
	}
	int difer(){
		if ((!EsVacio())&&(marcado !=senalado)) {
			NodoAnillo aux = senalado;
			int x =1;
			while (aux.sig!=marcado) {
				 aux=aux.sig;
				 x++;
			}

			return x;
		}else{
			return 0;
		}
	}
	
			
		
		
}
	

class NodoAnillo {
	protected Object dato;
	protected NodoAnillo sig;
	protected NodoAnillo ant;
	
	public NodoAnillo(Object o, NodoAnillo s, NodoAnillo a) {
		dato = o;
		sig = s;
		ant = a;
	}
}