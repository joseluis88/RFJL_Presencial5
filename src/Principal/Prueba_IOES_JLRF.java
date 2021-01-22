/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import static Utilidades.IO_ES_JLRF.*;

/**
 *
 * @author JOSÉ LUIS CURSOS DAW
 */
public class Prueba_IOES_JLRF {

    /**
     * @param args the command line arguments
     */
public static void main (String[] args){
        
       System.out.println("Vamos a proceder a leer números enteros, siga las instrucciones");
        
       System.out.println(leerInteger());
        
       System.out.println(leerInteger("Hola, dime un número entero: "));
        
       System.out.println(leerInteger("Dime un entero mayor que 3: ", 3));
        
       System.out.println(leerInteger("Dime un entero entre 22 y 88: ", 22 , 88));
        
       System.out.println("Vamos a proceder a leer números reales, siga las instrucciones:");
        
       System.out.println(leerEnteroLargo());
        
       System.out.println(leerEnteroLargo("Un número largo tipo long: "));
        
       System.out.println(leerReal ());
        
       System.out.println(leerReal ("Un número real tipo float: "));
        
       System.out.println(leerReal ("Un número real tipo float mayor que 23: ", 23));
        
       System.out.println(leerRealLargo ());
        
        System.out.println(leerRealLargo ("Un número real largo tipo doble: "));
        
        System.out.println("Vamos a proceder a leer cadenas, siga las instrucciones:");
        
        System.out.println(leerCadena ());
        
        System.out.println(leerCadena ("Escribe lo que quieras: "));
        
        System.out.println(leerCadena ("Escribe solo 15 caracteres: ", 15));
        
        System.out.println(leerCaracter ());
        
        System.out.println(leerCaracter ("Escribe cualquier caracter"));
        
       System.out.println("Vamos a proceder a leer booleanos, siga las instrucciones:");
        
        System.out.println(leerBooleano ());
        
        System.out.println(leerBooleano ("¿Escribe (SI, si, Si o NO, no, No) por favor?"));
        
        System.out.println("Vamos a proceder a escribir por teclado:");
        
       escribir ("Me tiene loco la programación.");
        
        escribirLN("Escribe lo que quieras para que se imprima a continuación: ");
        
    
    }
    
}

