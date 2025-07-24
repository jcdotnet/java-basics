package es.forman.cursojava.cadenas;

public class DriverCadenas {

	/**
	 * @param args
	 * @throws NoEsVocalException 
	 */
	public static void main(String[] args) {
		String prueba= "Gracias, por su visita";
		Cadenas cadena = new Cadenas();
		System.out.println(cadena.numPalabras(prueba));
		System.out.println(cadena.transponerVocales(prueba));
		System.out.println(cadena.cambiarOrden(prueba));
		try {
		  System.out.println(cadena.siguienteVocal('a'));
		  System.out.println(cadena.siguienteVocal('x'));
		}
		catch (NoEsVocalException e) {
			System.out.println(e);
			/* o si no implementamos NoEsVocalException, pej:
			System.out.println("Error: Nos has introducido una vocal");
			Diferentes formas de tratarlas, aunque conviene
			implementar la clase de la excepcion para obtener
			una informacion mas detallada del error ocurrido
			*/
		}
		

	}

}
