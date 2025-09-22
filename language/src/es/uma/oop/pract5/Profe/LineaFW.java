package es.uma.oop.pract5.Profe;

import java.util.*;
import java.io.*;
public class LineaFW extends LineaF {
	protected SortedSet noClaves;
	public LineaFW(String fichero, String noC) {
		super(fichero);
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(noC));
			eliminaNoClaves(br);
			br.close();
		} catch (IOException e) {
			System.out.println("ERROR de E/S"+e.getMessage());
			System.exit(0);
		}
	}
	public void eliminaNoClaves(BufferedReader br)  throws IOException {
		String linea = br.readLine();
		while (linea!=null) {
			StringTokenizer st = new StringTokenizer(linea," .,;:-");
			while (st.hasMoreTokens()) {
				String palabra = st.nextToken();
				if (mapa.containsKey(palabra))
					mapa.remove(palabra);
			}
			linea=br.readLine();
		}
	}
}

	

