
package aperacionesconcadenas;

public class AperacionesConCadenas {
    public static void main(String[] args) {
        String Nombres = "Diego Frank";
        String Apellidos = "Lipa Choque";
        
        //Concatenar
        String NombreCompleto = Nombres +" "+ Apellidos;
        System.out.println("Nombre Completo: "+ NombreCompleto);
        
        //Mayusculas
        String NombreCompleto1 = Nombres +" "+ Apellidos;
        System.out.println("Nombre Completo: "+ NombreCompleto1.toUpperCase());
        
        //Minisculas
        String NombreCompleto2 = Nombres +" "+ Apellidos;
        System.out.println("Nombre Completo: "+ NombreCompleto2.toLowerCase());
        
        //Contar canedas
        String NombreCompleto3 = Nombres +" "+ Apellidos;
        System.out.println("Cantidad de Caracteres: "+ NombreCompleto3.length());
        
        
        //Cortar una cadena
        String NombreCompleto4 = Nombres +" "+ Apellidos;
        //["Diego","Frank","Lipa","Choque"]
        String[] NombreCortado = NombreCompleto4.split(" ");
        //System.out.println(NombreCortado[1]);
        
//        for(int i = 0 ; i < NombreCortado.length ; i++){
//            System.out.println(NombreCortado[i]);
//        }
        
        for(String nombre : NombreCortado){
            System.out.println(nombre);
        }
        
        //Equals
        //boolean comparacion = Nombres.equals(Apellidos);
        boolean comparacion = Nombres == Apellidos;
        System.out.println("Comparacion: "+comparacion);
        
        //Imterpolacion de variables
        String n = "Diego";
        String a = "Lipa";
        int e = 100;
        
        String mensaje = String.format("Mi nombre es %s y mi apellido es %s y tengo %d años", n,a, e );
        System.out.println(mensaje);
    }       
    
}
