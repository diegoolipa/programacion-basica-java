/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package switchcase;

import java.util.Scanner;
public class Ingreso {
    
    public static void main(String[] args){
        Scanner teclado =  new Scanner(System.in);
        int n1, n2;
        
        DATOS obj = new DATOS();
        
        System.out.println("Ingrese un numero: ");
        n1 = teclado.nextInt();
        
        System.out.println("Ingrese un numero: ");
        n2 = teclado.nextInt();
        
        obj.suma(n1,n2);
        
        System.out.println("la suma es: "+obj.Mostrar());
       
        
        
    }
       
}
