package es.forman.cursojava.congreso;

import java.util.*;

public class Conferencia {
         private String nombre;
         private int aforo;
         private int asistentes;
         private int hora;
         private static HashSet conferencia= new HashSet();
         private HashSet asistencia;


   public Conferencia(String nombre,int capacidad,int hora) throws CongresoException {
	  this.nombre=nombre;
	  this.asistencia= new HashSet();
	  if (capacidad>=15 && capacidad<=20)
	     this.aforo=capacidad;
	  else
		  throw new CongresoException(this.nombre+"Aforo no permitido)");
	  if ((hora>=9 && hora<=14) || (hora>=16 && hora<=19))
		  this.hora=hora;
	  else
		  throw new CongresoException(this.nombre+"Horario no permitido para la conferencia");
      if (!this.conferencia.add(nombre))
    	  throw new CongresoException(this.nombre+"Conferencia ya existe");
   
   }
   public String getNombreConferencia(){
	   return this.nombre;
   }
   
   public int getHora(){
	   return this.hora;
   }
   
   public void setAsistentes(int n) throws CongresoException {
	   if (n<=this.getAforo())
		     this.asistentes=n;
		  else
			  throw new CongresoException(this.nombre+"Aforo no permitido"); 
   }
   public int getAforo() {
	 return this.aforo;
   }
   public int getAsistentes() {
	   return this.asistentes;
   }
   public void asistir(Persona persona) throws CongresoException {
	   	  if (asiste2MismoTiempo(persona))
	   		throw new CongresoException(persona.getNombre()+" está asistiendo a otra conferencia en este momento");
		  if (((persona.getEstado()=="REGISTRADO") ||(persona.getEstado()=="ASISTENTE")) && (this.getAsistentes()<this.getAforo())){
			  this.asistencia.add(persona);
		     persona.setEstado("ASISTENTE");
	      }
		  else if ((persona.getEstado()=="NO REGISTRADO") && (this.getAsistentes()<this.getAforo())) {
	          persona.getConferencias().add(this);
	          this.setAsistentes(this.getAsistentes()+1);
			  persona.setEstado("ASISTENTE");
			  asistencia.add(persona);
		  }
		  else throw new CongresoException("Aforo lleno");
	  }
	  
	  private boolean asiste2MismoTiempo(Persona p) throws CongresoException {
	     Iterator iter= p.getConferencias().iterator();
		 while (iter.hasNext()) { 
	        Conferencia aux =(Conferencia) iter.next();
			if ((this!=aux) && (aux.getHora()==this.getHora())) {
				p.getConferencias().remove(this);
				this.setAsistentes(this.getAforo()-1);
				return true;
			}
		 }
		 return false;
	  }
	  
	  // muestra quienes estan en cada conferencia
	 public String toString() {
		 StringBuffer sb = new StringBuffer("ASISTENCIA CONFERENCIA "+this.getNombreConferencia()+"\n");
		 Iterator iterador = this.asistencia.iterator();
		 sb.append("asistentes: "); 
		 while (iterador.hasNext())  {
				Persona aux= (Persona) iterador.next();	
				sb.append(aux.getNombre()).append(", ");  
		  }
		  return sb.toString();
	 }
	 
   public boolean equals(Object o) {
	   if (o == null)
   		return false;
   	   if (!(o instanceof Conferencia || o instanceof String))
   		  return false;
   		Conferencia aux = (Conferencia)o;
   		return this.getNombreConferencia().equals(aux.getNombreConferencia());
   	}
   
  
 }