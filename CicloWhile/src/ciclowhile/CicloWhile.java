
package ciclowhile;

import java.util.Scanner;

public class CicloWhile {

    public static void main(String[] args) {
        boolean salir = false;
        Scanner scanner = new Scanner(System.in);

        while(!salir){
            System.out.println("==============================");
            System.out.println("Bienvenido a ......");
            System.out.println("1.- Saludar");
            System.out.println("2.- Despedir");
            System.out.println("3.- Cobrar");
            System.out.println("4.- Escapar");
            System.out.println("5.- Salir");
            System.out.println("==============================");
            int Opcion = scanner.nextInt();
            switch (Opcion) {
                case 1:
                    System.out.println("Buenos Días");
                    break;
                case 2:
                    int[] numeros = {1,2,3,4,5};
                    Object[] numerosLetras = {12, "Diego", 123.21, true, "Marco"};
                    //for simplificado
                    for(Object nl : numerosLetras){
                        System.out.println(nl);
                    }
                    //for normal
                    for(int n=0;n<numeros.length;n++){
                        if(numeros[n] == 2 && numeros[n] == 3){
                            System.out.println("Numero encontrado");
                        }else if(numeros[n] == 3){
                            System.out.println("No encontrado");
                        }else{
                            System.out.println("No encontrado");
                        }
                        System.out.print(numeros[n]);
                    }
                    System.out.println("Chauuu... Vuelva Pronto");
                    break;
                case 3:
                    System.out.println("Quiero que me pagues");
                    break;
                case 4:
                    System.out.println("Se escapo......");
                    break;
                case 5:
                    salir = true;
                    System.out.println("Gracias por usar nuestro Menú");
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }
            
        }
        scanner.close();    
    }
    
}
