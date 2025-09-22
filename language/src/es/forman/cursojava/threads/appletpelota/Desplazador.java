//package es.forman.cursojava.threads.appletpelota;
//
//public class Desplazador extends Thread {
//
//	Pelota pelota;
//    AppletPelota applet;
//	public Desplazador(Pelota pelota,AppletPelota ball) {
//		this.pelota=pelota;
//		this.applet=ball;
//	}
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		while (true) {
//			pelota.desplaza();
//			try {
//				this.sleep(30);
//                applet.repaint();
//			} catch (InterruptedException e) {}
//		}
//	}
//
//}
///*
// * repaint() hacerlo solo cuando haya un cambio, para q no este
// * todo el rato actualizando y machaque cpu
// * repaint() en verdad llama a la funcion update(Graphics lienzo)
// * y lo que hace es borrar el lienzo y llamar a paint
// * el usar repaint() muchas veces hace que nos e mueva suavemente
// * sino parapadeando, para evitar eso en vez de usar repaint()
// * podemos sobreescribir el metodo update, y hacer que no borre
// * todo, solo borramos lo q nos intetresa y lo colocamos en su
// * lugar
// * */
