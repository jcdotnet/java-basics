package es.uma.oop.pract5.Profe;

import java.util.*;
import java.io.*;
public class LineaF {
	protected SortedMap mapa;
	public LineaF(String fichero) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(fichero));
			creaMapa(br);
			br.close();
		} catch (IOException e) {
			System.out.println("ERROR de E/S"+e.getMessage());
			System.exit(0);
		}
	}
	
	public void creaMapa(BufferedReader br)  throws IOException {
		int numLinea = 1;
		String linea = br.readLine();
		mapa = new TreeMap();
		while (linea!=null) {
			StringTokenizer st = new StringTokenizer(linea," .,;:-");
			while (st.hasMoreTokens()) {
				String palabra = st.nextToken();
				SortedSet ss = (SortedSet)mapa.get(palabra);
				if (ss==null) {
					ss = new TreeSet();
					mapa.put(palabra,ss);
				}
				ss.add(new Integer(numLinea));
			}
			linea=br.readLine();
			numLinea++;
		}
	}
	
	public void salida(String fichero) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter(fichero),true);
			salida(pw);
			pw.close();
		} catch (IOException e) {
			System.out.println("ERROR de E/S"+e.getMessage());
			System.exit(0);
		}
	}
	
	public void salida(PrintWriter pw) {
		Iterator it = mapa.keySet().iterator();
		while (it.hasNext()) {
			String palabra = (String)it.next();
			pw.print(palabra+":\t");
			SortedSet ss = (SortedSet)mapa.get(palabra);
			Iterator is = ss.iterator();
			while (is.hasNext())
				pw.print(is.next()+" ");
			pw.println();
		}
	}
}
		
			
