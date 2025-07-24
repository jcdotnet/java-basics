package es.forman.cursojava.congreso;

import java.util.*;

public class Persona {
	 private String nombre, apellidos, dni, movil,ocupacion;
	 private String estado;
	 private HashSet conferencia;


 public Persona(String nombre) {  // pasando de poner lo demás, supongo nombres no repetidos
       this.nombre=nombre;
       estado= "NO REGISTRADO";
       conferencia= new HashSet();
 }
 
 public String getNombre(){
	 return this.nombre;
 }
 
 public String getEstado(){
   return this.estado;
 }
 public void setEstado(String estado) {
	this.estado=estado; 
 }
 public HashSet getConferencias() {
    return this.conferencia;
 }
 
 public void registrarConferencia(Conferencia c) throws CongresoException {
	 if (c.getAsistentes()<c.getAforo()) {
	     if (mismaHora(c))
	    	 throw new CongresoException(this.nombre+" ya esta registrado en otra conferencia a esa hora");
		 else if (this.conferencia.add(c)) {
		   estado="REGISTRADO";
		   c.setAsistentes(c.getAsistentes()+1);
		 }
		 else throw new CongresoException(this.nombre+" ya registrada en esta conferencia");
	 }
	 else throw new CongresoException("Conferencia "+c.getNombreConferencia()+" llena, no se puede registrar"); 
 }
 public void cancelaConferencia(Conferencia c) throws CongresoException {
	 if (c==null) throw new CongresoException("No existe dicha conferencia");
	 if (this.getConferencias().remove(c))
		 c.setAsistentes(c.getAsistentes()-1);
	 else throw new CongresoException("No existe dicha conferencia");
		 
 }
 private boolean mismaHora(Conferencia c) {
	 Iterator iter=this.getConferencias().iterator();
	 while (iter.hasNext()) {
		 Conferencia aux= (Conferencia) iter.next();
	     if (aux.getHora()==c.getHora())
	    	 return true;
	 }
	 return false; 
 }
 
 // Lista el programa de conferencias previstas para una persona
 public String toString() {
	 StringBuffer sb= new StringBuffer();
	 sb.append("Programa previsto para "+this.getNombre());
	 sb.append("\n");
	 Iterator iter= this.conferencia.iterator();
	 while (iter.hasNext()) {
		 Conferencia aux=(Conferencia) iter.next();
		 sb.append("Conferencia: "+ aux.getNombreConferencia());
		 sb.append(" , Hora: "+aux.getHora()).append("\n");	 
	 }
	 return sb.toString();
 }
 
}