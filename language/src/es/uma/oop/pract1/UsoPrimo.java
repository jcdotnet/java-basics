package es.uma.oop.pract1;

public class UsoPrimo {
	public static void main(String [] args) {
		Primo dos = new Primo(2);
		int tope = Integer.parseInt(args[0]);
		for(int i = 3; i< tope; i++)
			dos.inserta(i);
		Primo p = dos;
		while (p!=null) {
			System.out.print(p.primo()+"*");
			p = p.sigPrimo();
		}
	}
}
		