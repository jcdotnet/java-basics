package es.uma.oop.pract3;

class usoPalabra {
  public static void main(String [] args) {
    Palabra pal =new Palabra();
    pal.add("freaky");
    pal.add("es");
    pal.add("personaje");
    pal.add("antonio");
    pal.add("pepe");
    pal.add("ana");
    pal.add("maria");
    pal.add("negro");
    pal.add("blanco");
    pal.add("sexo");
    pal.add("poo");
    int n;
    try {
      n= Integer.parseInt(args[0]);    
    } catch (IndexOutOfBoundsException e) {
    	System.out.println(" eRRoR: escribe usoPalabra argumento1 ");
        return;   
    }
    System.out.println(pal.palabras(n));	
  }
}