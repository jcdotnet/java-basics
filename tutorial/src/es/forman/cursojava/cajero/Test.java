package es.forman.cursojava.cajero;
public class Test {
    public static void main(String [] args) {    
       int pin;
       Cajero cajero= new Cajero();
       
       //  CASO A
       System.out.println("CASO A: ");
       Cliente cliente= new Cliente("10211314f");
       CuentaAhorro cuentaA= new CuentaAhorro(cliente);
       CuentaCorriente cuentaC = new CuentaCorriente(cliente);
       cuentaC.setPin(6666);
       cuentaC.ingresaDinero(2500f,cuentaA);
       cuentaA.ingresaDinero(4000f,cuentaA);
       System.out.println("Apertura de cuenta corriente");
       System.out.println("Saldo Actual en CC: "+cuentaC.consultaSaldo());
       System.out.println("Saldo Actual en Cuenta Ahorro: "+cuentaA.consultaSaldo());
       
      /* do {
               System.out.println("Introduce el Pin");          
               pin= 
       } while (!cajero.identiFicaCliente(cuentaC,pin));
       */
       if (cuentaC.retiraDinero(1500f,cuentaA,null)) 
           System.out.println("\nReintegro realizado con exito");
       else  System.out.println("\nNo se ha podido realizar el reintegro"); 
           System.out.println("Saldo Actual en CC: "+cuentaC.consultaSaldo());
           System.out.println("Saldo Actual en Cuenta Ahorro: "+cuentaA.consultaSaldo());
          
       
       if (cuentaC.transferencia(cuentaA,500f)) 
          System.out.println("\nTransferencia realizada correctamente a Cuenta Ahorro"); 
       else System.out.println("No se ha podido efectuar la transferencia a Cuenta Ahorro");
          System.out.println("Saldo Actual en CC: "+cuentaC.consultaSaldo());
          System.out.println("Saldo Actual en Cuenta Ahorro: "+cuentaA.consultaSaldo());
           
       if (cuentaC.transferencia(cuentaA,800f)) 
           System.out.println("Transferencia realizada correctamente a Cuenta Ahorro");   
       else System.out.println(" \nNo se ha podido efectuar la transferencia a cuenta ahorro");
          System.out.println("Saldo Actual en CC: "+cuentaC.consultaSaldo());
          System.out.println("Saldo Actual en Cuenta Ahorro: "+cuentaA.consultaSaldo());
         
       if (cuentaC.retiraDinero(1500f,cuentaA,null)) 
               System.out.println("\nReintegro realizado con exito");
       else   System.out.println("\nNo se ha podido realizar en reintegro");         
               System.out.println("Saldo Actual en CC: "+cuentaC.consultaSaldo());
               System.out.println("Saldo Actual en Cuenta Ahorro: "+cuentaA.consultaSaldo());
          
       if (cuentaC.retiraDinero(3000f,cuentaA,null)) 
               System.out.println("\nReintegro realizado con exito");
       else    System.out.println("\nNo se ha podido realizar el reintegro");   
               
               System.out.println("Saldo Actual en CC: "+cuentaC.consultaSaldo());
               System.out.println("Saldo Actual en Cuenta Ahorro: "+cuentaA.consultaSaldo());
    
       cuentaC.ingresaDinero(1500f,cuentaA);
       System.out.println("\nIngreso realizado");
       System.out.println("Saldo Actual en CC: "+cuentaC.consultaSaldo());
       System.out.println("Saldo Actual en Cuenta Ahorro: "+cuentaA.consultaSaldo());
       if (cuentaC.retiraDinero(4000f,cuentaA,null)) 
               System.out.println("\nReintegro realizado con exito");
       else  System.out.println("\nNo se ha podido realizar el reintegro");   
               System.out.println("Saldo Actual en CC: "+cuentaC.consultaSaldo());
               System.out.println("Saldo Actual en Cuenta Ahorro: "+cuentaA.consultaSaldo());
          
       
       
       //   CASO B, CLIENTE 2
       System.out.println("\nCASO B:");
       Cliente cliente2= new Cliente("835293829d");
       CuentaAhorro cuentaA2 = new CuentaAhorro(cliente2);
       CuentaCorriente cuentaC2 = new CuentaCorriente(cliente2);
       cuentaC2.setPin(6666);
       cuentaA2.ingresaDinero(0f,cuentaA2);
       cuentaC2.ingresaDinero(2000f,cuentaA2); 
       System.out.println("Apertura de cuenta corriente");
       System.out.println("Saldo Actual en CC: "+cuentaC2.consultaSaldo());
       System.out.println("Saldo Actual en Cuenta Ahorro: "+cuentaA2.consultaSaldo());
       /*
       do {
               System.out.println("Introduce de nuevo el Pin");
               pin=
       } while (!cajero.identiFicaCliente(cuentaC2,pin));
       */
       if (cuentaC2.retiraDinero(800f,cuentaA2,null))
               System.out.println("\nReintegro realizado con exito");
       else    System.out.println("\nNo se ha podido efectuar el reintegro");
       System.out.println("Saldo Actual en CC: "+cuentaC2.consultaSaldo());
       System.out.println("Saldo Actual en Cuenta Ahorro: "+cuentaA2.consultaSaldo());
       if (cuentaC2.retiraDinero(400f,cuentaA2,null))
               System.out.println("\nReintegro realizado con exito");
       else    System.out.println("\nNo se ha podido efectuar el reintegro");
       System.out.println("Saldo Actual en CC: "+cuentaC2.consultaSaldo());
       System.out.println("Saldo Actual en Cuenta Ahorro: "+cuentaA2.consultaSaldo());
       
       Cuenta cuentaCredito2= new CuentaCredito(cliente2,cuentaC2,cuentaA2);
       System.out.println("\nSolicito cuenta credito");
       System.out.println("Saldo Actual en CC: "+cuentaC2.consultaSaldo());
       System.out.println("Saldo Actual en Cuenta Ahorro: "+cuentaA2.consultaSaldo());
       System.out.println("Saldo Actual en Cuenta Credito: "+cuentaCredito2.consultaSaldo());
       if (cuentaC2.retiraDinero(400f,cuentaA2,cuentaCredito2))
               System.out.println("\nReintegro realizado con exito");
       else    System.out.println("\nNo se ha podido efectuar el reintegro");
       System.out.println("Saldo Actual en CC: "+cuentaC2.consultaSaldo());
       System.out.println("Saldo Actual en Cuenta Ahorro: "+cuentaA2.consultaSaldo());
       System.out.println("Saldo Actual en Cuenta Credito: "+cuentaCredito2.consultaSaldo());
       if (cuentaC2.retiraDinero(2500f,cuentaA2,cuentaCredito2)) 
               System.out.println("\nReintegro realizado con exito");
       else    System.out.println("\nNo se ha podido efectuar el reintegro");
       System.out.println("Saldo Actual en CC: "+cuentaC2.consultaSaldo());
       System.out.println("Saldo Actual en Cuenta Ahorro: "+cuentaA2.consultaSaldo());
       System.out.println("Saldo Actual en Cuenta Credito: "+cuentaCredito2.consultaSaldo());
       
       cuentaC2.ingresaDinero(7000f,cuentaA2);
       System.out.println("\nIngreso realizado");
       System.out.println("Saldo Actual en CC: "+cuentaC2.consultaSaldo());
       System.out.println("Saldo Actual en Cuenta Ahorro: "+cuentaA2.consultaSaldo());
       System.out.println("Saldo Actual en Cuenta Credito: "+cuentaCredito2.consultaSaldo());
       cuentaC2.setNivelMaximo(2500f,cuentaA2);
       System.out.println("\nCambio valor minimo saldo en cc");
       System.out.println("Saldo Actual en CC: "+cuentaC2.consultaSaldo());
       System.out.println("Saldo Actual en Cuenta Ahorro: "+cuentaA2.consultaSaldo());
       System.out.println("Saldo Actual en Cuenta Credito: "+cuentaCredito2.consultaSaldo());
       
       
       //     CASO C
       System.out.println("\nCASO C: ");
       Cliente cliente3= new Cliente("00000000A");
       CuentaAhorro cuentaA3 = new CuentaAhorro(cliente3);
       CuentaCorriente cuentaC3 = new CuentaCorriente(cliente3);
       cuentaC3.setPin(6666);
       cuentaA3.ingresaDinero(3000f,cuentaA3);
       cuentaC3.ingresaDinero(1000f,cuentaA3);
      
       Cuenta cuentaCredito3= new CuentaCredito(cliente3,cuentaC3, cuentaA3);
       System.out.println("Apertura de cuenta corriente y de credito");
       System.out.println("Saldo Actual en CC: "+cuentaC3.consultaSaldo());
       System.out.println("Saldo Actual en Cuenta Ahorro: "+cuentaA3.consultaSaldo());
       System.out.println("Saldo Actual en Cuenta Credito: "+cuentaCredito3.consultaSaldo());
       /*
       do {
               System.out.println("Introduce de nuevo el Pin");
               pin= 
       } while (!cajero.identiFicaCliente(cuentaC3,pin));
       */
       if (cuentaC3.retiraDinero(8000f,cuentaA3,cuentaCredito3))
               System.out.println("\nReintegro realizado con exito");
       else    System.out.println("\nNo se ha podido efectuar el reintegro");
       System.out.println("Saldo Actual en CC: "+cuentaC3.consultaSaldo());
       System.out.println("Saldo Actual en Cuenta Ahorro: "+cuentaA3.consultaSaldo());
       System.out.println("Saldo Actual en Cuenta Credito: "+cuentaCredito3.consultaSaldo());
       if (cuentaC3.retiraDinero(7000f,cuentaA3,cuentaCredito3))
               System.out.println("\nReintegro realizado con exito");
       else    System.out.println("\nNo se ha podido efectuar el reintegro");
       System.out.println("Saldo Actual en CC: "+cuentaC3.consultaSaldo());
       System.out.println("Saldo Actual en Cuenta Ahorro: "+cuentaA3.consultaSaldo());
       System.out.println("Saldo Actual en Cuenta Credito: "+cuentaCredito3.consultaSaldo());
       if (cuentaC3.retiraDinero(5000f,cuentaA3,cuentaCredito3))
               System.out.println("\nReintegro realizado con exito");
       else    System.out.println("\nNo se ha podido efectuar el reintegro");
       System.out.println("Saldo Actual en CC: "+cuentaC3.consultaSaldo());
       System.out.println("Saldo Actual en Cuenta Ahorro: "+cuentaA3.consultaSaldo());
       System.out.println("Saldo Actual en Cuenta Credito: "+cuentaCredito3.consultaSaldo());
    }
}