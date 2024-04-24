package operadoresaritmeticos;
public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int variableUno = 50;
        int variableDos = 20;
        
        //Incremento
        //variableUno = variableUno + 1;
        variableUno ++ ;
        System.out.println("Incremento: "+variableUno);
        
        //Decremento
        //variableDos = variableDos - 1;
        variableDos -- ;
        System.out.println("Decremento: "+variableDos);
        
        //Suma
        int resultadoSuma = variableDos + variableUno;
        System.out.println("Suma: "+resultadoSuma);
        
        //Resta
        int resultadoResta = variableDos - variableUno;
        System.out.println("Resta: "+resultadoResta);
        
        //Multiplicación
        int resultadoMulti = variableDos * variableUno;
        System.out.println("Multiplicación: "+resultadoMulti);
    
    
        //División
        int resultadoDivi = variableUno / variableDos ;
        System.out.println("División: "+resultadoDivi);
    
        //Modulo
        int resultadoModulo = variableUno % variableDos ;
        System.out.println("Modulo: "+resultadoModulo);
    }

    
}
