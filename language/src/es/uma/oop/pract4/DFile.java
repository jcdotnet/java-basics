package es.uma.oop.pract4;

import java.io.*;       // 26-1-2001
import java.util.*;

public class DFile {

 public static void main(String [] args) {
   	 String fich;
   	 try {
   	 	fich=args[0];
   	 } catch (IndexOutOfBoundsException e) {
   	 	System.out.println("Escriba DFile fichero"); 
        return;  	 
   	 }
   	 FileInputStream f;
   	 SortedMap t=new TreeMap();
   	 try {  
   	   f= new FileInputStream(fich);	   
   	   int lectura= f.read();
   	   while (lectura!=-1) {
   	     char car= (char) lectura;
   	     if (Character.isLetter(car)) {
   	         Character key= new Character(car);
   	         Integer apar= (Integer) t.get(key);
   	         t.put(key,apar==null?new Integer(1):new Integer(apar.intValue()+1));
   	     }      	       
   	     lectura=f.read(); 
   	   }
   	   f.close();
   	   System.out.println("Estructura: \n"+t);
   	   
   	 } catch (IOException e) {
   	 	System.out.println("Error e/s: "+e.getMessage()); 
   	 	return;
   	 }
   } 
}