package es.forman.cursojava.cadenas;

public class UtilMiguelAngel {

	private boolean esSeparador(char c) {
		return (c == ' ' || c == ',' || c == ';' || c == '.' || c == '!'); 
	}
	
	public int getNumPalabras(String s) {
		if (s == null)
			return 0;
		int contador = 1;
		boolean caracterAnteriorEsSeparador = false;
		for (int i=0; i<s.length(); i++)  {
			boolean caracterActualEsSeparador = this.esSeparador(s.charAt(i));
			if (caracterActualEsSeparador && !caracterAnteriorEsSeparador)  {
				contador++;
				caracterAnteriorEsSeparador = true;
			} else if (!caracterActualEsSeparador)
				caracterAnteriorEsSeparador = false;
		}
		return contador;
	}
	
	/**
	 * Faltar�a por traducir las vocales con acentos; s�lo es cuesti�n de a�adir nuevas cl�usulas al switch.
	 * @param s
	 * @return
	 */
	public String cambiaVocales(String s) {
		if (s == null)
			return null;
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<s.length(); i++)
			switch (s.charAt(i)) {
			case 'a': 
				sb.append('e');
				break;
			case 'A': 
				sb.append('E');
				break;
			case 'e': 
				sb.append('i');
				break;
			case 'E': 
				sb.append('I');
				break;
			case 'i': 
				sb.append('o');
				break;
			case 'I': 
				sb.append('O');
				break;
			//case '�':
			//	sb.append('�');
			//	break;
			case 'o': 
				sb.append('u');
				break;
			case 'O': 
				sb.append('U');
				break;
			case 'u': 
				sb.append('a');
				break;
			case 'U': 
				sb.append('A');
				break;
			default:
				sb.append(s.charAt(i));
			}
		return sb.toString();
	}
	
	public String cambiaOrdenPalabras(String s) {
		if (s == null)
			return null;
		StringBuffer sbDestino = new StringBuffer();
		StringBuffer sbOrigen = new StringBuffer(s);
		int pos = 0;
		while ((pos = sbOrigen.lastIndexOf(" ")) != -1)  {
			sbDestino.append(sbOrigen.substring(pos)).append(" ");
			sbOrigen.delete(pos, sbOrigen.length());
		}
		sbDestino.append(sbOrigen);
		return sbDestino.toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UtilMiguelAngel utilidades = new UtilMiguelAngel();
		String s = "Gracias, por su visita";
		System.out.println("\"" + s + "\" tiene " + utilidades.getNumPalabras(s) + " palabras");
		System.out.println("Cambiando las vocales: " + utilidades.cambiaVocales(s));
		System.out.println("Cambiando las palabras de orden: " + utilidades.cambiaOrdenPalabras(s));
		String[] s1 = { null, "Curso de Java en Forman;muy util  ;! Sí señor"};
		for (int i=0; i< s1.length; i++) {
			System.out.println("\"" + s1[i] + "\" tiene " + utilidades.getNumPalabras(s1[i]) + " palabras");
			System.out.println("Cambiando las vocales: " + utilidades.cambiaVocales(s1[i]));
			System.out.println("Cambiando las palabras de orden: " + utilidades.cambiaOrdenPalabras(s1[i]));
		}
	}

}
