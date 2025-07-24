package es.forman.cursojava.cadenas;

public class NoEsVocalException extends Exception {
		char caracterIncorrecto;
		public NoEsVocalException(char c) {
			this.caracterIncorrecto = c;
		}
		
		public String toString() {
			return "El carácter " + this.caracterIncorrecto + " recibido no es una vocal";
		}
}
