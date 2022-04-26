/* 
* @author Isaac Jimenez Escalante
* @author Andrés Josue Picado Monge 
* @author Nicole Hernandez Muñoz 
*/ 
package cinemagaly; 
import javax.swing.*; 
import java.util.*; 
import java.math.*; 
public class CineMagaly { 
  
 static final int BoletoEco = 120; 
 static final int BoletoVIP = 250; 
 
 public static void main(String[] args) { 
 int opcion = 0; 
 String[] val = new String[30] ; 
 int statu = 1;  
 int cantPersonEC = 0; 
 int cantPersonVIP = 0; 
 int dineroEC = 0; 
 int dineroVIP = 0; 
 double total= 0;
 double totalConIva= 0;
 double iva=0;
 int cedula;
 int edad;
 String nombre;
 
int limite,p;
limite = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personas"));
for(p = 1; p <= limite; p++){
 nombre= (JOptionPane.showInputDialog("Digite su nombre: "));
 cedula= Integer.parseInt(JOptionPane.showInputDialog("Digite su numero de cedula: "));
 edad= Integer.parseInt(JOptionPane.showInputDialog("Digite su edad: "));

 while (statu == 1){ 
 opcion=(int)Integer.parseInt(JOptionPane.showInputDialog("\nBienvenido al sistema de CINE MAGALY, por favor ingrese el digito de  clase que desee comprar\n"+ 
 "1. Asiento Economico $ 120\n"+ 
 "2. Asiento VIP $ 250")); 
  
 switch(opcion){  
  
 case 1: 
 Random rnd2 = new Random(); 
 int AsientoEC = rnd2.nextInt(19); 
 JOptionPane.showMessageDialog(null,"Se le asignó el asiento número: " +  (AsientoEC-1) + " en la clase Económica"); 
 if (val[AsientoEC-1] == null){ 
 val[AsientoEC-1] = "EC"; 
 } else{ 
 JOptionPane.showMessageDialog(null, "El asiento " + (AsientoEC + 1) + " se  encuentra ocupado " ); 
 } 
 statu=(int)Integer.parseInt(JOptionPane.showInputDialog("\nSi desea continuar  ingrese 1 sino ingrese 0\n")); 
 break; 
  
 case 2: 
 Random rnd1 = new Random(); 
 int AsientoEJ = rnd1.nextInt(29 -20 + 1) + 20;

 JOptionPane.showMessageDialog(null, "Se le asignó el asiento número: " +  (AsientoEJ-1) + " en la clase VIP" ); 
 if (val[AsientoEJ-1] == null){ 
 val[AsientoEJ-1] = "EJ"; 
 } else{ 
 JOptionPane.showMessageDialog(null,"El asiento " + val[AsientoEJ+1] + " se  encuentra ocupado " ); 
 } 
 statu=(int)Integer.parseInt(JOptionPane.showInputDialog("\nSi desea continuar  ingrese 1 sino ingrese 0\n")); 
 break; 
 } 
 } 
  
 for (int i = 0 ; i <= val.length-1 ; i ++){ 
 if (val[i] != null){ 
 if(val[i] == "EC"){ 
 cantPersonEC = cantPersonEC + 1; 
 } 
 else 
 { 
 cantPersonVIP = cantPersonVIP + 1; 
 }  
  
 } 
 } 
 dineroEC = BoletoEco * cantPersonEC; 
 dineroVIP = BoletoVIP * cantPersonVIP; 
 total= dineroEC + dineroVIP;
 iva= total*0.13;
 totalConIva= total + iva;


  
 JOptionPane.showMessageDialog(null, "FACTURA ELECTRONICA" + 
         "\n" +
         "\nNombre del cliente: " + nombre +
         "\nCedula del cliente: " + cedula +
         "\n-------------------------------------------------------" +
         "\nCantidad de Boletos en clase Economica: " + cantPersonEC +
         "\nSubtotal de boletos en clase Economica: $ " + dineroEC + 
         "\n-------------------------------------------------------" +
         "\nCantidad de Boletos en clase VIP: " + cantPersonVIP +
         "\nSubtotal de boletos en clase VIP: $ " + dineroVIP +
         "\n-------------------------------------------------------" +
         "\nIVA (13%): $ " + iva +
         "\nEl total facurado es de: $ " + totalConIva +
         "\n" +
         "\nGRACIAS POR COMPRAR CON CINE MAGALY");  
 }  
 }
}
