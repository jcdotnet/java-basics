package es.forman.cursojava.io.jshell;

import es.forman.cursojava.io.EntradaSalida;

import java.io.File;
import java.io.IOException;

public class JShell {
    private final File root;
    private File dirActual;
	
    public JShell(){
    	File [] root= File.listRoots();
	    int i = 0;
	    while ((root[i].getAbsolutePath().charAt(0)=='A') || (root[i].getAbsolutePath().charAt(0)=='B')) 
	       i++;
		this.root= root[i];
		this.dirActual=this.root;
    }
    
    /** 
	 * simula un shell con los siguientes comandos:
	 * ls -> lista un directorio
	 * cd d -> cambia al directorio d, cd .. regresa al anterior
	 * cat archivo -> muestra por pantalla el contenido del archivo 
	 * exit -> sale de la consola
	 * @param directorio
	 * @throws IOException
	 */
	public void ejecuta() throws IOException {
		EntradaSalida io = new EntradaSalida();
		Directorio d= new Directorio();
		String comando= io.leeTeclado(this.dirActual.getAbsolutePath());
		StringBuffer nuevaRuta= new StringBuffer("");
		
		while (!(comando.equals("exit"))) {
		 String [] token =comando.split(" ");
		 
		 if (token[0].equals("ls"))
			 d.listarDetallado(this.dirActual.getAbsolutePath());
		 
		 else if (token[0].equals("cd")) {
			 if (token.length>=2){
				 
				 if (token[1].equals("..") && (!(this.dirActual.getAbsolutePath().equals(this.root.getAbsolutePath()))))
				     this.dirActual=this.dirActual.getParentFile(); 
				 else {
	
					nuevaRuta.setLength(0);
					//nuevaRuta.append(this.dirActual).append(File.pathSeparatorChar); 
					   for (int i=1; i<token.length-1; i++)  
					     nuevaRuta.append(token[i]+" ");
				       nuevaRuta.append(token[token.length-1]);
				    File f= new File(dirActual,nuevaRuta.toString()); 
				    if (!(f.exists()))
				    	System.out.println(" Ruta no v�lida");
				    else 	
				    	this.dirActual=f;
				 }
			 }
		}
		
		else if (token[0].equals("cat")) {
			if (token.length==2) {
				try {	
				 nuevaRuta.setLength(0);
				 nuevaRuta.append(this.dirActual.toString()).append("/").append(token[1]);
				 io.mostrarArchivo(nuevaRuta.toString());
				}
				catch (IOException e) {
					System.out.println("No se puede leer archivo");
				}
			}
		}
		else System.out.println("Comando no v�lido");
		comando= io.leeTeclado(this.dirActual.toString());
		}
	}
	
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		JShell shell = new JShell();
	    
		shell.ejecuta();
	}

}
