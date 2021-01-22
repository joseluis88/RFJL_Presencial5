/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author JOSÉ LUIS CURSOS DAW
 */
public class IO_ES_JLRF {
    /**
     * Para pedir al usuario que introduzca un número entero.
     * @return num entero.
     */

public static int leerInteger(){  
    
            int num = 0;
            boolean correcto = false;
            do {
                Scanner sc=new Scanner(System.in);
                correcto=true;
                try {
                    System.out.println("Introduce un número entero integer, por favor: ");
                    num = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("ERROR: en la inserción,");
                    correcto = false;
                }
            } while (!correcto);
            System.out.println("El número introducido es: ");
        return num;
}

/**
 * Para pedir al usuario que introduzca un número entero.
 * @param numero
 * @return numero entero que introduce el usuario.
 */
 public static int leerInteger(String numero) {  

      int x = 0;
      boolean numeroValido = false;

      do {

         Scanner sc = new Scanner(System.in);

         System.out.println(numero);
         String s = sc.nextLine();

         if (s != null) {
            try {
               x = Integer.parseInt(s);
               numeroValido = true;
            } catch (NumberFormatException e) {System.out.println("ERROR: en la inserción, el número introducido no es válido");
            }
         } else {
            numeroValido = true;
         }
      } while (!numeroValido);
      System.out.println("El número introducido es: ");
      return  x;
      
 }
 
 
 /**
 * Pide al usuario numero mayor que el introducido
 * @param numero
 * @param min
 * @return Un numero entero para el usuario.
 */
public static int leerInteger(String numero, int min) { 

      int x;
              do {
            Scanner entrada = new Scanner(System.in);
            try {
                System.out.println(numero);
                x = entrada.nextInt();
            } catch (InputMismatchException e) {
               
                x = min - 1;
                entrada.next();
            }
 
            if (!(x >= min)) {
                System.out.println("ERROR: en la inserción, el número introducido no es válido" + min );
            }
 
        } while (!(x >= min));
              System.out.println("El número introducido es: ");
        return x;
    }

/**
 * Pide al usuario numero dentro de un rango introducido.
 * @param numero
 * @param min
 * @param max
 * @return Un numero entero para el usuario.
 */
public static int leerInteger(String numero, int min, int max) {

      int x;
      
      //Rangos de numeros
      if(min>max){
          int num=min;
          min=max;
          max=num;
      }
      
              do {
            Scanner entrada = new Scanner(System.in);
            try {
                System.out.println(numero);
                x = entrada.nextInt();
            } catch (InputMismatchException e) {
               
                x = max + 1;
                entrada.next();
            }
 
            if (!(x >= min && x <=max)) {
                System.out.println("ERROR: en la inserción, el número introducido no es válido" + min );
            }
 
        } while (!(x >= min && x <= max ));
              System.out.println("El número introducido es: ");
        return x;
    }
   
 /**
  * Lee por teclado un numero introducido largo y  lo devuelve.
  * @return numero largo
  */
public static long leerEnteroLargo(){  

        long num = 0;
        boolean correcto = false;
        
        do {
            System.out.println("Introduce un número entero tipo long: ");
            Scanner entrada=new Scanner(System.in);
            String s = entrada.nextLine();
            
            if (s != null) {
                try {
                    num = Long.parseLong(s);
                    correcto = true;
                } catch (NumberFormatException e) {
                    System.out.println("ERROR: en la inserción, valor no correcto, introduce un número entero long");

                }
         } else {
            correcto = true; 
         }
      } while (!correcto);
        System.out.println("El número introducido es: ");
      return num;
}

/**
 * Lee por teclado un numero introducido largo y  lo devuelve.
 * @param numero
 * @return x es un numero long
 */
 public static long leerEnteroLargo(String numero) { 

      long x = 0;
      boolean numeroValido = false;

      do {

         Scanner sc = new Scanner(System.in);

         System.out.println(numero);
         String s = sc.nextLine();

         if (s != null) {
            try {
               x = Integer.parseInt(s);
               numeroValido = true;
            } catch (NumberFormatException e) {System.out.println("ERROR: en la inserción, el número introducido no es válido");
            }
         } else {
            numeroValido = true;
         }
           } while (!numeroValido);
        System.out.println("El número introducido es: ");
      return x;
 }
        
/**
 * Numero que lee real y devuelve lo leido.
 * @return numero real float
 */
public static float leerReal(){ 

        float x = 0;
        boolean correcto = false;
        
        do {
            System.out.println("Introduce un numero real tipo float: ");
            Scanner entrada=new Scanner(System.in);
            String s = entrada.nextLine();
            
            if (s != null) {
                try {
                    x = Float.parseFloat(s);
                    correcto = true;
                } catch (NumberFormatException e) {
                    System.out.println("ERROR: en la inserción, introduce un número real float: ");

                }
         } else {
            correcto = true;
         }
      } while (!correcto);
        System.out.println("El número introducido es: ");
      return x;
}

 /**
  * Lee por teclado un numero introducido real y lo devuelve.
  * @param numero
  * @return devuelve numero real del tipo float.
  */
  public static float leerReal(String numero) { 

     float x = 0;
      boolean numeroValido = false;

      do {

         Scanner sc = new Scanner(System.in);

         System.out.println(numero);
         String s = sc.nextLine();

         if (s != null) {
            try {
               x = Integer.parseInt(s);
               numeroValido = true;
            } catch (NumberFormatException e) {System.out.println("ERROR: en la inserción, el número introducido no es válido");
            }
         } else {
            numeroValido = true;
         }
           } while (!numeroValido);
        System.out.println("El número introducido es: ");
      return x;
 }
  
/**
 * Lee por teclado un numero introducido real y pide que sea mayor que el introducido.
 * @param numero
 * @param min
 * @return devuelve numero real
 */
public static float leerReal(String numero, int min) { 

     float x = 0;
     float numeroValido = (float) min;

      do {

         Scanner sc = new Scanner(System.in);

         System.out.println(numero);
         String s = sc.nextLine();

         if (s != null) {
            try {
               x = Integer.parseInt(s);
               
           } catch (NumberFormatException e) {System.out.println("ERROR: en la inserción, el número introducido no es válido");
           x=numeroValido -1;
           sc.next();
           }
         } 
         if(! (x >=numeroValido)){
          System.out.println("ERROR: en la inserción, el número introducido no es válido, introduce un numero real mayor que: " + min);
      }
           } while (! (x >=numeroValido));
        System.out.println("El número introducido es: ");
      return x;
 }

/**
 * Numero que lee real y devuelve lo leido.
 * @return numero real double
 */
public static double leerRealLargo(){   //Bien

        double num = 0;
        boolean correcto = false;
        
        do {
            System.out.println("Introduce un número real tipo float: ");
            Scanner sc=new Scanner(System.in);
         
            String s = sc.nextLine();
            
            if (s != null) {
                try {
                    num = Float.parseFloat(s);
                    correcto = true;
                } catch (NumberFormatException e) {
                    System.out.println("ERROR: en la inserción, valor no correcto, introduce un número real float");
                }
         } else {
            correcto = true;
         }
      } while (!correcto);
        System.out.println("El número introducido es: ");
      return num;
}

public static double leerRealLargo(String numero) {

     double x = 0;
      boolean numeroValido = false;

      do {

         Scanner sc = new Scanner(System.in);

         System.out.println(numero);
         String s = sc.nextLine();

         if (s != null) {
            try {
               x = Integer.parseInt(s);
               numeroValido = true;
            } catch (NumberFormatException e) {System.out.println("ERROR: en la inserción, el número introducido no es válido");
            }
         } else {
            numeroValido = true;
         }
           } while (!numeroValido);
        System.out.println("El número introducido es: ");
      return x;
 }

/**
 * Para leer cadenas de caracteres.
 * @return devuelve cadena de caracteres introducida por el usuario.
 */
public static String leerCadena() {
    
        System.out.println("Introduce una cadena: ");
        Scanner s = new Scanner(System.in);

        String cadena = s.next();
        
        s.nextLine(); // Para limpiar el buffer

        System.out.println("La cadena introducida es: " );
        return cadena;
    }

/**
 * Para leer cadenas de caracteres.
 * @param mensaje
 * @return cadena de caracteres introducida por el usuario.
 */
public static String leerCadena(String mensaje) {
        
        System.out.println(mensaje);
        
        Scanner s = new Scanner(System.in);

        String cadena = s.next();
        
        s.nextLine(); // Para limpiar el buffer

        System.out.println("La cadena introducida es: " );
        return cadena;
    }

/**
 * Para leer cadenas de caracteres con longitud maxima.
 * @param mensaje
 * @param longitud
 * @return cadena de caracteres introducida por el usuario.
 */

public static String leerCadena(String mensaje, int longitud) { 
        
       String cadena = "";
        
       do{
           System.out.println(mensaje);
           Scanner s = new Scanner(System.in);
           cadena = s.nextLine();
        if(!(cadena.length() < longitud)){
            System.out.println("Error, de longitud maxima es de " + longitud + " caracteres: ");
        }
        
       }while (!(cadena.length() < longitud));     
       System.out.println("El mensaje introducido es: ");
        return cadena;
    }

/**
 * Lee un caracter de tipo char.
 * @return devuelve el primer caracter.
 */

public static char leerCaracter() {
 
        System.out.println("Introduce los caracteres que quieras: ");
        Scanner entrada=new Scanner(System.in);
        char caracter = entrada.next().charAt(0);
        System.out.println("Solo se te va a mostrar el primer caracter: ");
        return caracter; 
    }


/**
 * Lee un caracter de tipo char.
 * @param mensaje
 * @return devuelve el primer caracter.
 */
public static char leerCaracter(String mensaje) {
 
        char caracter = 0;
        String cadena;
        boolean caracterValido = false;

        Scanner teclado = new Scanner(System.in);

        do {

            System.out.println(mensaje);

            cadena = teclado.nextLine();

            if (cadena.length() != 1 || cadena.length() == 0) {

                System.out.println("Introduce solo un caracter: ");

            } else {

                caracter = cadena.charAt(0);
                caracterValido = true;

            }
        } while (!caracterValido);
        System.out.print("El caracter que has introducido es: ");
        return caracter;

    }


/**
 * Pide un booleano al usuario, y valida que este correcto.
 * @return Devuelve el booleano introducido por el usuario.
 */

    public static boolean leerBooleano() { 
 
        String cadena;
        boolean resultado = false;
        boolean bandera = false;
        System.out.println("Introduce un valor booleano (SI, si, Si, NO, no y No): ");
        Scanner teclado = new Scanner(System.in);

        do {

            cadena = teclado.nextLine();

            if (cadena.matches("SI|si|Si")) {

                resultado = true;
                bandera = true;

            } else {
                if (cadena.matches("NO|no|No|")) {
                    resultado = false;
                    bandera = true;
                } else {
                    System.out.println("No ha introducido un valor correcto, introduce el valor correcto: ");
                }

            }
        } while (!bandera);
        System.out.println("El booleano introducido es: ");
        return resultado;

    }


    

    
    /**
     * Pide un booleano al usuario, y valida que este correcto.
     * @param mensaje
     * @return Devuelve el booleano introducido por el usuario.
     */
    public static boolean leerBooleano(String mensaje) { 
 
        String cadena;
        boolean resultado = false;
        boolean bandera = false;

        Scanner teclado = new Scanner(System.in);

        do {

            System.out.println(mensaje);

            cadena = teclado.nextLine();

            if (cadena.matches("SI|si|Si")) {

                resultado = true;
                bandera = true;

            } else {
                if (cadena.matches("NO|no|No")) {
                    resultado = false;
                    bandera = true;
                   
                } else {
                    System.out.println("No ha introducido un valor correcto");
                }

            }
        } while (!bandera);

        System.out.println("El booleano introducido es: ");
        return resultado;

    }
    
    
/**
 *  Muestra un mensaje al usuario
 * @param mensaje que le va a salir al usuario 
 */
public static void escribir(String mensaje) { 

        System.out.print(mensaje);
        System.out.println("");
}

/**
 * Muestra un mensaje al usuario con un salto de linea
 * @param mensajeSalto que le va a salir al usuario con un salto de linea. 
 */
public static void escribirLN(String mensajeSalto) { 
    
       String texto;
        System.out.println(mensajeSalto);

        Scanner teclado = new Scanner(System.in);
        texto = teclado.nextLine();
        System.out.println("El mensaje introducido es: " + texto);
        
    }
}    


