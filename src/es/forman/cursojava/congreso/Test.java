package es.forman.cursojava.congreso;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 try {	
		Conferencia c1 = new Conferencia("Conferencia 1",20,13);
		Conferencia c2 = new Conferencia("Conferencia 2",16,11);
		Conferencia c3 = new Conferencia("Conferencia 3",15,9);
		Conferencia c4 = new Conferencia("Conferencia 4",20,11);
	    //Conferencia c5 =new Conferencia("Conferencia 5",10,9); // daria error por aforo 	

	
		 Persona juan= new Persona("Juan");
		 Persona jose= new Persona("Jose");
		 Persona maria= new Persona("Maria");
		 Persona ana= new Persona("Ana");
		 jose.registrarConferencia(c1);
		 jose.registrarConferencia(c2);
		 jose.registrarConferencia(c3);
		 
		 juan.registrarConferencia(c4);
		 // juan.registrarConferencia(c4); // daria error (registrar en misma conferencia)
		 
		 maria.registrarConferencia(c1);
		 maria.registrarConferencia(c2);
		 maria.registrarConferencia(c3);
		 //maria.registrarConferencia(c4); // daria error (misma hora c2)
		 maria.cancelaConferencia(c3); 
		 

		 c1.asistir(jose);
		 c2.asistir(jose);
		 c3.asistir(jose);
		 //c4.asistir(jose); // error pq ahora esta en c2
		 c1.asistir(maria);
		 c2.asistir(maria);
		 c3.asistir(maria);
		
		 c1.asistir(ana);
		 c2.asistir(ana);
		 c3.asistir(ana);
		 c4.asistir(ana);
		 
		 System.out.println(jose);
		 System.out.println(juan);
		 System.out.println(maria);
		 System.out.println(ana);
		 System.out.println(c1);
		 System.out.println(c2);
		 System.out.println(c3);
		 System.out.println(c4);
	 }
	 catch (CongresoException e) { 
	    System.out.println(e);
	 }
	   
	 
	}

}
