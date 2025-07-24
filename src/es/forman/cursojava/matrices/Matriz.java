package es.forman.cursojava.matrices;

/* implementamos matrices como arrays, igual que lo podiamos 
 * haber hecho con colecciones, etc, esto es la lógica de
 * negocio y el usuario no tiene que saber lo que es un array
 * simplemente crea la matriz, y usa la interfaz que le damos,
 * le importa un pimiento como est� implementada, eso solo lo 
 * sabemos nosotros
 */

public class Matriz {

	  private int[][] array;

	  
	
	public Matriz (int n, int m) {	
		this.array= new int [n][m];	
	}
	
	public void set(int x, int y, int valor) throws DimensionException{
		if (x>this.getNumFilas() || (y>this.getNumCols()))
			throw new DimensionException(this,1);
		this.array[x][y]=valor;
	}
	
	public int get(int posX, int posY) throws DimensionException {
		if (posX>this.getNumFilas() || (posY>this.getNumCols()))
			throw new DimensionException(this,1);
		return this.array[posX][posY];
	}
	
	public int getNumFilas () {
		return this.array.length;
	}
	
	public int getNumCols () {
		return this.array[0].length;
	}

	public void imprimeAConsola() throws DimensionException {
		 for (int i=0; i < this.getNumFilas(); i++) {
		     for (int j=0; j < this.array[i].length; j++) {
		    	 System.out.print(this.get(i,j)+" ");
		     }
		     System.out.print("\n");
		 }
		 System.out.print("\n\n");	
	}
	
	public boolean equals(Matriz m) throws DimensionException {
		if (m==null)
		   throw new DimensionException(m,2);
		if ((this.getNumFilas()!=m.getNumFilas())||(this.getNumCols()!=m.getNumCols()))
		   return false;
		for (int i=0; i < this.getNumFilas(); i++) {
		   for (int j=0; j < this.getNumCols(); j++) {
		    	 if (this.get(i,j)!= m.get(i,j)) 
		    		 return false;
		   }
		}
		return true;
	}
		
	public void suma(Matriz m) throws  DimensionException {
	  int suma;
	  if (m!=null) {
	    if (this.getNumFilas()!=m.getNumFilas() || this.getNumCols()!=m.getNumCols()) 
		    throw new DimensionException(m,1);	
	    for (int i=0; i < getNumFilas(); i++) {
		  for (int j=0; j < this.array[i].length; j++) {
		          suma= this.get(i,j)+ m.get(i,j);
		          this.array[i][j]=suma;
	      }	    
	    }
	  }
	  else throw new DimensionException(this,2);
	}
	
	/* multiplicacion de matrices, 
	 * importante: tenemos que tener en cuenta
	 * que los arrays son estáticos, y que el resultado de la
	 * multiplicacion puede variar sus dimensiones, para ello
	 * creamos un array con las dimensiones finales que al final
	 * se destrir automáticamente, el usuario ni sabe que los
	 * arrays son estaticos ni les importa, de como lo hacemos
	 * nos encargamos nosotros, logica de negocio, él simplemente
	 *  recibe una matriz con su dimension adecuada, de como lo 
	 *  hagamos nos encargamos nosotros, y le damos la API para
	 *  poder interactuar con el objeto matriz
	 */
    public void multiplica(Matriz m) throws DimensionException {
     if (m==null) 	
    	 throw new DimensionException(this,2);
     else {
    	 if (this.getNumCols()!=m.getNumFilas()) 
 		    throw new DimensionException(m,1);
    	 int [][] resultado= new int [this.getNumFilas()][m.getNumCols()];
    	 
         
		  for (int i=0; i < this.getNumFilas(); i++) {
		    	for (int j=0;j<this.getNumCols();j++)  {
			      int suma= 0;
			      for (int k=0;k<this.getNumCols();k++)
		    		suma+=this.get(i,k)* m.get(k,j); 
		    	  resultado[i][j]=suma;	    	  
		        }	         
		  }
	      
     
  
         // ahora hacemos que la matriz original apunte a resultado
         this.array=resultado;   
    } 
    
  }
}
