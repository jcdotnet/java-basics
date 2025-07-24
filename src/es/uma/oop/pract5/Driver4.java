import java.io.*;

class Driver4 {
     public static void main(String [] args) {
     	LineaFF lf;
        PrintWriter enPant= new PrintWriter(System.out,true);
     	try {
     	  lf= new LineaFF("texto.txt","palabras.txt");
     	  lf.volcarInfo(enPant);
     	  // lf.volcarInfo("salida2.txt");
        } catch (IOException e) {
        	System.out.println("Error E/S");
        	return;
        }
    }
}