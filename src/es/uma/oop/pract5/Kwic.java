package es.uma.oop.pract5;

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
		String linea;
	   	snc = new TreeSet (); 
		while ((linea =br.readLine ())!= null) {
			StringTokenizer st = new StringTokenizer(linea," ,.;:");
			while (st.hasMoreTokens()) {
				snc.add (st.nextToken().toUpperCase());
			}
		}
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
		dic= new TreeMap();
		String titulo;
		while ((titulo =br.readLine ())!= null) {		
		    StringTokenizer st= new StringTokenizer (titulo, " ,;:.");
			while (st.hasMoreTokens()) {
				String p= st.nextToken();
				if (!snc.contains (p.toUpperCase())) {
					Tk tk= new Tk(titulo,p);
					LinkedList l = (LinkedList)dic.get(p);
					if (l==null) {
					    l= new LinkedList();
					    l.add(tk);
					    dic.put(p,l); 
					}
					ListIterator li = l.listIterator(); //paraInsOrd
			        boolean dentro=false;
					while (li.hasNext()){
					    int res = tk.compareTo(li.next());
					    if (res==0) {
					       dentro=true; 
					       break;  
					    }    // break= sale del bucle
					    if (res<0) {
						   int x=li.nextIndex();
						   l.add(x,tk);
						   dentro=true;
					       break;					    						  
					     }	
				     }    								       					
				if (!dentro)    // es pq hemos llegado al final
	                 l.addLast(tk);			
				}
			}
		}
	}
	
	public void creaSalida(String salida) {
		try {
			FileWriter fw= new FileWriter (salida);
			PrintWriter pw= new PrintWriter (fw);
			creaSalida(pw);
		}catch (IOException e) {
			System.out.println("ERROR de E/S. "+e.getMessage());
			System.exit(1);
		}				
	}
	
	public void creaSalida(PrintWriter pw) {
		Iterator i = dic.keySet().iterator();
		while (i.hasNext()){
			String pal =(String)i.next();			
			LinkedList ll = (LinkedList)dic.get(pal);	 
			   for (int x=0;x<ll.size();x++){
			    	Tk tit = (Tk)ll.get(x);
		    		pw.println(tit.posTk()+" | "+tit.preTk());			
			   }		   			
		}
	}
}