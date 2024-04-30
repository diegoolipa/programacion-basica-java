/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package switchcase;

/**
 *
 * @author Alumno
 */
public class DATOS {
    
   /** int (val_numero) numeros naturales enteros entre positvos y negativo
    * float (val_numero) numeros reales entre positovos y negativos
    * double (val_numero) numero universales 
    * char (cadena) referido a las letras y textos
    * logico (and / or / not )
    * signos de operacion aritmeticos ->  '+','-','*','/'
    * operados logicos -> '<', '>', '==', '!='
    
    
    */ 
    int n1, n2, Resultado;
    
    public void suma(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    
    private int Operacion(){
        Resultado = n1+n2;
        return Resultado;
    }
    
    public int Mostrar(){
        return Operacion();
    }
}
