package es.forman.cursojava.cadenas;

public class Cadenas {

	private boolean separador(char c) {
		return (c == ' ' || c == '.' || c == ',' || c == ';' || c == '!'); 
	}
	
	public int numPalabras(String s) {
		int longitud=1;
		StringBuffer sb= new StringBuffer(s);
		for (int i=0; i<sb.length(); i++) {
			if (separador(sb.charAt(i)) && (!separador(sb.charAt(i-1))))
			   longitud++;
		}
		return longitud;
	}
	
	public String transponerVocales(String s){
		StringBuffer sb= new StringBuffer(s);
		for (int i=0; i<sb.length(); i++) {
			switch (sb.charAt(i)) {
			case 'a': sb.setCharAt(i,'e'); break; 
			case 'e': sb.setCharAt(i,'i'); break; 
			case 'i': sb.setCharAt(i,'o'); break; 
			case 'o': sb.setCharAt(i,'u'); break; 
			case 'u': sb.setCharAt(i,'a'); break; 
			} 
		}
		return sb.toString();
	}
	
	public String cambiarOrden(String s){
		StringBuffer sb= new StringBuffer(s);
		StringBuffer nuevo= new StringBuffer(); 
		int end=sb.length();
		for (int i=sb.length()-1;i>0; i--) {
			if (separador(sb.charAt(i)) && (!separador(sb.charAt(i+1)))) {	
			    nuevo.append(sb.substring(i+1,end));
			    nuevo.append(' ');
			    end=i;
			 }
		}		 
		nuevo.append(sb.substring(0,end));
		return nuevo.toString();
	}
		
		
    public char siguienteVocal(char vocal) throws NoEsVocalException {
    	switch (vocal) {
		case 'a': vocal='e'; break; 
		case 'e': vocal='i'; break; 
		case 'i': vocal='o'; break; 
		case 'o': vocal='u'; break; 
		case 'u': vocal='a'; break;
		// se deben poner tambien las mayusculas
		default:  
			// propago la excepcion y que la maneje otro 
			throw new NoEsVocalException(vocal); 
		} 
    	return vocal;
    }
}
