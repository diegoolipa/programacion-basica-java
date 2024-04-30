
package estructuradatos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EstructuraDatos {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            boolean salir = false;
            while(!salir){
                System.out.println("Estructura de datos");
                System.out.println("1.- Array");
                System.out.println("2.- ArrayList");
                System.out.println("3.- HasMap");
                System.out.println("4.- Salir");

                System.out.print("Ingrese una opcion: ");
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Bienvenido a la ED Array");
                        int[] edades = {12,40,30,50,7,5,60,70,100};
                        String[] nombres = {"Daniel","Marcos","Diego","Ariel"};

                        //Logitud del array
                        System.out.println("Logitud edades: "+ edades.length);
                        System.out.println("Logitud nombres: "+ nombres.length);

                        //Cambiar un valor
                        edades[1] = 38;
                        nombres[3] = "David";
                        System.out.println("Nuevo dato edad:" + edades[1]);
                        System.out.println("Nuevo dato nombre:" + nombres[3]);

                        //Convertir un array a String
                        System.out.println(Arrays.toString(edades));
                        System.out.println(Arrays.toString(nombres));

                        //Clonar
                        int[] edadesClon = edades.clone();
                        System.out.println("Array clonado: " + Arrays.toString(edadesClon));

                    case 2:
                        System.out.println("Bienvenido a ArrayList");

                        ArrayList<String> ListaNombres = new ArrayList<>();

                        //Agregar datos a la Lista
                        ListaNombres.add("David");
                        ListaNombres.add("Marco");
                        ListaNombres.add("Julio");

                        //Logitud de la Lista
                        System.out.println("Tamaño Lista: "+ListaNombres.size());

                        //Remover un elemeto de la lista
                        ListaNombres.remove(2);

                        //Obtener un elemento de la lista
                        System.out.println("Elemento Optenido: "+ListaNombres.get(1));

                        //Comprobar si la lista esta vacia
                        System.out.println("Lista vacia?: "+ListaNombres.isEmpty());

                        //Comprobar si un elemento existe
                        System.out.println("Existe: "+ListaNombres.contains("David"));
                        break;
                    case 3:
                        System.out.println("Bienvenido a HashMap");

                        Map<String,Integer> edades1 = new HashMap<>();

                        //Insertando Data
                        edades1.put("Diego",20);
                        edades1.put("Marco",12);
                        edades1.put("Javier",60);
                        edades1.put("Pedro",50);

                        //Eliminar un Dato
                        edades1.remove("Pedro");

                        //Recuperar un Valor
                        System.out.println("Edad Diego: " + edades1.get("Diego"));

                        //Longitud del Mapa
                        edades1.size();

                        //Imprimir las llaves (key)
                        for(String key : edades1.keySet()){
                            System.out.println("Llave: "+key);
                        }
                        //Imprimir los valores (value)
                        for(Integer value : edades1.values()){
                            System.out.println("Valor: "+value);
                        }

                        // Imprimir las llaves y los valores
                        for(Map.Entry<String,Integer> lv : edades1.entrySet()){
                            System.out.println("llave: " + lv.getKey() + " Valor: "+ lv.getValue());
                        }
                        break;
                    default:
                        System.out.println("Elija uan opcion válida");
                        break;
                }

            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Ocurrio un error "+e.getMessage());
        } finally {
            System.out.println("Gracias por usar el programa");
        }
        

    }
    
}
