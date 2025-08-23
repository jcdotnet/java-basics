package es.uma.oop.entradaSalida;

/*
 * ES facilita la entrada de datos desde el teclado así
 *    como la salida de datos a pantalla.
 * También pueden utilizarse otros dispositivos de entrada y salida.
 *
 * @author (Fco. Gutierrez)
 * @version (10/10/2000)
 */

import java.io.*;
import java.text.*;

public class ES {
	//  variables de clase
	private static BufferedReader ir;
	private static PrintWriter pw;
	private static DecimalFormat N;
	private static final String spaces = "                                "+
                                       "                                "+
                                       "                                "+
                                       "                                "+
                                       "                                "+
                                       "                                "+
                                       "                                "+
                                       "                                ";
	private static final String error = 	"################################"+
																				"################################"+
																				"################################"+
																				"################################"+
																				"################################"+
																				"################################"+
																				"################################"+
																				"################################"+
																				"################################";
  public static final int LEFT=1;
  public static final int RIGHT=2;
	
	/*
	 * Inicialización de las variables de clase.
	 * ir se inicializa con la entrada estandar.
	 * pw se inicializa con la salida estandar.
	 * N es un formato para adecuarlo al espa�ol.
	 */
	static {
		ir = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(System.out);
		N = (new DecimalFormat());
		DecimalFormatSymbols dfs = N.getDecimalFormatSymbols();
		dfs.setDecimalSeparator(',');
		dfs.setGroupingSeparator('.');
		N.setDecimalFormatSymbols(dfs);
	}
	
	
	/**
	 * Cambia la entrada de datos a un nuevo dispositivo con buffer
   	 *
	 * @param  b   el nuevo dispositivo de entrada
	 */
	public static void newInput(BufferedReader b) {
		ir = b;
	}
	
	/**
	 * Cambia la salida de datos a un nuevo dispositivo.
	 *
	 * @param  p   el nuevo dispositivo de salida
	 */
	public static void newOutput(PrintWriter p) {
		pw = p;
	}
	
	/**
	 * Presenta un mensaje por la salida est�ndar.
	 *
	 * @param  s   la cadena de caracteres a mostrar
	 */
	public static void prompt (String s) {
  		if (s!=null) {
				System.out.print(s);
  			System.out.flush();
  		}
   }
	/**
	 * Presenta un mensaje por la salida.
	 * Deja el cursor justo detr�s.
	 *
	 * @param  s   la cadena de caracteres a mostrar
	 */
	public static void message (String s) {
  		pw.print(s);
  		pw.flush();
   }

	/**
	 * Presenta un mensaje por la salida.
	 * Salta de linea despu�s.
	 *
	 * @see #message(String)
	 * @param  s   la cadena de caracteres a mostrar
	 */
	public static void messageLn (String s) {
  		message(s);
  		pw.println();
		pw.flush();
    }

	/**
	 * Presenta un mensaje dado como argumento por la salida est�ndar y espera
   *  a que se introduzca una cadena de caracteres.
   *
	 * @param  prt mensaje a mostrar
	 * @return     la cadena de caracteres leida
	 */
	public static String readString (String prt) {
  		while (true) {
			prompt(prt);
			try {
				return ir.readLine();
			} catch (IOException e) {
				messageLn("Problemas E/S: Intentalo de nuevo\n");
			}
  		}
	}
	
	/**
	 * Presenta un mensaje dado como argumento por la salida estándar y espera
	 *  a que se introduzca un caracter.
	 * Controla a que solo se introduzca un caracter repitiendo
	 *  la petición cuanto sea necesario.
	 *
	 * @param  prt mensaje a mostrar
	 * @return     el caracter leido
	 */
	public static char readChar (String prt) {
  		while (true) {
			prompt(prt);
			try {
				String s=ir.readLine();
				if ((s!=null)&&(s.length()==1))
					return s.charAt(0);
				else
					prompt("Caracter erroneo: Intentalo de nuevo\n");
			} catch (IOException e) {
				prompt("Problemas E/S: Intentalo de nuevo\n");
			}
  		}
	}
	
	/**
	 * Presenta un mensaje dado como argumento por la salida estándar y espera
	 *  a que se introduzca un entero.
	 * Controla a que la entrada sea un entero repitiendo
	 *  la petición cuanto sea necesario.
	 *
	 * @param  prt mensaje a mostrar
	 * @return     el entero leido
	 */
	public static int readInt (String prt) {
  		while (true) {
			prompt(prt);
			try {
				return Integer.parseInt(ir.readLine());
	  		} catch (NumberFormatException nfe) {
	  			prompt("Entero erroneo: Intentalo de nuevo\n");
	  		} catch (IOException e) {
	  			prompt("Problemas E/S: Intentalo de nuevo\n");
	  		}
	  	}
	}
	
	/**
	 * Presenta un mensaje dado como argumento por la salida estandar y espera
	 *  a que se introduzca un double.
	 * Controla a que la entrada sea un double repitiendo
	 *  la petición cuanto sea necesario.
	 *
	 * @param  prt mensaje a mostrar
	 * @return     el double leido
	 */
	public static double readDouble (String prt) {
  		while (true) {
			prompt(prt);
			try {
				return Double.parseDouble(ir.readLine());
			} catch (NumberFormatException nfe) {
				prompt("Double erroneo: Intentalo de nuevo\n");
			} catch (IOException e) {
				prompt("Problemas E/S: Intentalo de nuevo\n");
			}
		}
	}

	/**
	 * Escribe una cadena por la salida tenendo en cuenta que la
	 * longitud y alineación previstas como argumentos.
	 * Deja el cursor justo detrás de la cadena.
	 * Muestra la cadena "Error en alineación" si la alineación no es correcta.
	 *
	 * @param  s     cadena a sacar por la salida
	 * @param  len   longitud reservada para la salida. ###.. si se pasa
	 * @param  align alineación. ES.LEFT a izquierda y ES.RIGHT a derecha
	 */
	public static void writeString (String s, int len, int align) {
		String ss = s;
		if (ss.length() <= len)
			if (align == RIGHT)
				ss = spaces.substring(0,len-ss.length()) + ss;
			else if (align == LEFT)
				ss = ss+spaces.substring(0,len-ss.length());
			else
				ss = ("Error en alineacion").substring(0,len);
		else
			ss = error.substring(0,len);
		pw.print(ss);
		pw.flush();
  }

  /**
	 * Escribe una cadena por la salida teniendo en cuenta la
	 * longitud, y alineacion previstas como argumentos.
	 * Salta de línea después.
	 * Muestra la cadena "Error en alineación" si la alineación no es correcta.
	 *
	 * @see #writeString(String,int,int)
	 * @param  s     cadena a sacar por la salida
	 * @param  len   longitud reservada para la salida. ###.. si se pasa
	 * @param  align alineación. ES.LEFT a izquierda y ES.RIGHT a derecha
	 */
	public static void writeStringLn (String s, int len, int align) {
		writeString (s,len,align);
		pw.println();
		pw.flush();
	}
	/**
	 * Escribe una caracter por la salida teniendo en cuenta la
	 * longitud, y alineación previstas como argumentos.
	 * Deja el cursor justo detrás del caracter.
	 *
	 * @see #writeString(String,int,int)
	 * @param  c     caracter a sacar por la salida
	 * @param  len   longitud reservada para la salida. ###.. si se pasa
	 * @param  align alineación. ES.LEFT a izquierda y ES.RIGHT a derecha
	 */
	public static void writeChar (char c, int len, int align) {
		//writeString ((new Character(c)).toString(), len, align); // Character(char) is deprecated since version 9
		writeString ((Character.valueOf(c)).toString(), len, align);
	}

	/**
	 * Escribe una caracter por la salida teniendo en cuenta la
	 * longitud, y alineación previstas como argumentos.
	 * Salta de línea después.
	 *
	 * @see #writeStringLn(String,int,int)
	 * @param  c     caracter a sacar por la salida
	 * @param  len   longitud reservada para la salida. ###.. si se pasa
	 * @param  align alineación. ES.LEFT a izquierda y ES.RIGHT a derecha
	 */
	public static void writeCharLn (char c, int len, int align) {
		//writeStringLn ((new Character(c)).toString(), len, align); // Character(char) is deprecated since version 9
		writeStringLn ((Character.valueOf(c)).toString(), len, align);
	}

	/**
	 * Escribe un entero por la salida teniendo en cuenta la
	 * longitud prevista como argumento.
	 * Deja el cursor justo detrás del entero.
	 *
	 * @see #writeInt(int,int)
	 * @param  number entero a sacar por la salida
	 * @param  len    longitud reservada para la salida. ###.. si se pasa
	 */
	public static void writeInt (int number, int len) {
		writeInt(number, len, false);
	}
	
	/**
	 * Escribe un entero por la salida teniendo en cuenta la
	 * longitud prevista como argumento.
	 * Salta una línea después.
	 *
	 * @see #writeInt(int,int)
	 * @param  number entero a sacar por la salida
	 * @param  len    longitud reservada para la salida. ###.. si se pasa
	 */
	public static void writeIntLn (int number, int len) {
		writeInt (number, len, false);
		pw.println();
		pw.flush();
	}
	
	/**
	 * Escribe un entero por la salida teniendo en cuenta la
	 * longitud prevista como argumento.
	 * Utiliza '.' para separar miles.
	 * Deja el cursor justo detrás del entero
	 *
	 * @see #writeInt(int,int)
	 * @param  number entero a sacar por la salida
	 * @param  len    longitud reservada para la salida. ###.. si se pasa
	 */
	public static void writeIntG (int number, int len) {
		writeInt(number, len, true);
	}

	/**
	 * Escribe un entero por la salida teniendo en cuenta la
	 * longitud prevista como argumento.
	 * Utiliza '.' para separar miles.
	 * Salta de línea después.
	 *
	 * @see #writeIntG(int,int)
	 * @param  number entero a sacar por la salida
	 * @param  len    longitud reservada para la salida. ###.. si se pasa
	 */
  	public static void writeIntGLn (int number, int len) {
		writeIntG (number, len);
		pw.println();
		pw.flush();
	}

	/**
	 * Escribe un entero por la salida teniendo en cuenta la
	 * longitud prevista y si debe separar los miles con '.' como argumentos
	 *
	 * @param  number entero a sacar por la salida
	 * @param  len    longitud reservada para la salida. ###.. si se pasa
	 * @param  group  variable booleana que indica si se hacen grupos o no
	 */
	private static void writeInt (int number, int len, boolean group) {
		N.setGroupingUsed(group);
		N.setMaximumFractionDigits(0);
		String num = N.format(number);
		if (num.length() <= len)
			num = spaces.substring(0,len-num.length()) + num;
		else
			num = error.substring(0,len);
		pw.print(num);
		pw.flush();
	}

	
	/**
	 * Escribe un double por la salida teniendo en cuenta la
	 * longitud y decimales previstos como argumentos.
	 * Deja el cursor justo detrás del double
	 *
	 * @see #writeDouble(double,int,int)
	 * @param  number double a sacar por la salida
	 * @param  len    longitud reservada para la salida. ###.. si se pasa
	 */
	public static void writeDouble (double number, int len, int frac) {
		writeDouble(number, len, frac, false);
	}
	
	/**
	 * Escribe un double por la salida teniendo en cuenta la
	 * longitud y decimales previstos como argumentos.
	 * Salta una l�nea después.
	 *
	 * @see #writeDouble(double,int,int)
	 * @param  number double a sacar por la salida
	 * @param  len    longitud reservada para la salida. ###.. si se pasa
	 */
	public static void writeDoubleLn (double number, int len, int frac) {
		writeDouble (number, len, frac);
		pw.println();
		pw.flush();
	}

	/**
	 * Escribe un double por la salida teniendo en cuenta la
	 * longitud y decimales previstos como argumentos.
	 * Utiliza '.' para separar miles.
	 * Deja el cursor justo detrás del double.
	 *
	 * @see #writeDouble(double,int,int)
	 * @param  number double a sacar por la salida
	 * @param  len    longitud reservada para la salida. ###.. si se pasa
	 */
	public static void writeDoubleG (double number, int len, int frac) {
		writeDouble(number, len, frac, true);
	}

	/**
	 * Escribe un double por la salida teniendo en cuenta la
	 * longitud y decimales previstos como argumentos.
	 * Utiliza '.' para separar miles.
	 * Salta de l�nea despu�s
	 *
	 * @see #writeDoubleG(double,int,int)
	 * @param  number double a sacar por la salida
	 * @param  len    longitud reservada para la salida. ###.. si se pasa
	 */
	public static void writeDoubleGLn (double number, int len, int frac) {
		writeDoubleG(number, len, frac);
		pw.println();
		pw.flush();
	}

	/**
	 * Escribe un double por la salida teniendo en cuenta la
	 * longitud prevista, los decimales y si utiliza '.' para separar miles como argumento.
	 *
	 * @param  number double a sacar por la salida
	 * @param  len    longitud reservada para la salida. ###.. si se pasa
	 * @param  group  variable booleana que indica si se hacen grupos o no
	 */
	private static void writeDouble (double number, int len, int frac, boolean group) {
		N.setGroupingUsed(group);
		N.setMaximumFractionDigits(frac);
		N.setMinimumFractionDigits(frac);
		String num = N.format(number);
		if (num.length() <= len)
			num = spaces.substring(0,len-num.length()) + num;
		else
			num = error.substring(0,len);
		pw.print(num);
		pw.flush();
	}

	/**
	 * Escribe espacios en la salida.
	 * Deja el cursor detrás del último espacio.
	 *
	 * @param  len    n�mero de espacios que se envian a la salida.
	 */
	public void writeSpaces(int len) {
		pw.print(spaces.substring(0,len));
		pw.flush();
	}
}
