import java.io.*;

class Driver2 {
	
 public static void main(String [] args) throws IOException {
    System.out.print("Introduce nombre archivo: ");
    InputStreamReader isr= new InputStreamReader(System.in);
    BufferedReader br= new BufferedReader(isr);
    String nombre= br.readLine();
    
    CuentaWF cwf = new CuentaWF(nombre);
    System.out.println(cwf.cuenta());
 }

}
     
       