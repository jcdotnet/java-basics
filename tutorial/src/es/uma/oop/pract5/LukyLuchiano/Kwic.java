package es.uma.oop.pract5.LukyLuchiano;

import java.io.*;
import java.util.*;
public class Kwic {
	private Set snc;
	private SortedMap dic;
	
	public void creaNoClaves(String noClaves) {
		try {
			BufferedReader br= new BufferedReader(new FileReader(noClaves));
			creaNoClaves(br);
			br.close();
		} catch (IOException e) {
		System.out.println(e.getMessage());
		System.exit(1);
		}
	}
	public void creaNoClaves(BufferedReader br) throws IOException {
		String noclave;
		snc = new TreeSet ();
		while ((noclave =br.readLine ())!= null) {
			//String noclave = br.readLine();
			StringTokenizer st = new StringTokenizer(noclave," ,.;:");
			
			while (st.hasMoreTokens()) {
				snc.add (st.nextToken().toUpperCase());
			}
		}
		//System.out.println(snc);
	}
	public void creaEntradas(String entrada) {
		try {
			BufferedReader br= new BufferedReader(new FileReader(entrada));
			creaEntradas(br);
			br.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
	}
	public void creaEntradas(BufferedReader br) throws IOException {
		dic = new TreeMap();
		String entrada;
		Vector v = new Vector();
		while ((entrada =br.readLine ())!= null) {
			v.addElement(entrada.toUpperCase());
		}
		//System.out.println(v);
		for (int i=0; i<v.size(); i++) {
			String tit=((String)v.elementAt(i)).toUpperCase();
			StringTokenizer st= new StringTokenizer (tit, " ,;:.");
			while (st.hasMoreTokens()) {
				String p= st.nextToken();
				if (!snc.contains (p)) {
					Tk tk= new Tk(tit.toUpperCase(),p);
					
					if (dic.containsKey(p)){
						LinkedList l = (LinkedList)dic.get(p);
						ListIterator li = l.listIterator();
						boolean echo=true;
						
						while (li.hasNext()&&(echo)){
							Object o =li.next();
							int res = tk.compareTo(o);
							
							if (res>0){
								echo=true;
							}else if (res<0){
								int x = li.nextIndex();
								l.add(x-1,tk);
								echo = false;
							}else {
								echo=false;
							}	
						}
						if (echo) {
							l.addLast(tk);
						}
						
					}else{
						
						LinkedList l= new LinkedList();
						l.add(tk);
						dic.put(p,l);
						
					}
					
				}
			}
		}System.out.println(dic);
	}
	public void creaSalida(String salida) {
		try {
			FileWriter fw= new FileWriter (salida);
			PrintWriter pw= new PrintWriter (fw,true);
			creaSalida(pw);
		}catch (IOException e) {
			System.out.println("ERROR de E/S. "+e.getMessage());
			System.exit(1);
		}
		
		
	}
	public void creaSalida(PrintWriter pw) {
		Iterator i = dic.keySet().iterator();
		while (i.hasNext()){
			//String clave = (String)i.next();
			LinkedList ll = (LinkedList)dic.get(i.next());
			int lng = ll.size();
			for (int x=0;x<lng;x++){
				Tk tit = (Tk)ll.get(x);
				System.out.println(tit.posTk()+" | "+tit.preTk());
				pw.println(tit.posTk()+" | "+tit.preTk());
				
			}
			
		}
	}
}