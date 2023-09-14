/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosjava;

/**
 *
 * @author Dell
 */
public class FundamentosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("VARIABLES");
        int edad = 37;
        String nombre = "Pablo";
        double salario = 200 ;
        
        System.out.println("Soy"  +  nombre + "tengo" + edad + "años y mi sueldo es de" + salario);
        
        System.out.println("Nombre:" + nombre);
        System.out.println("Edad:" + edad);
        System.out.println("Salario:" + salario);
        
        System.out.println("----------------------");
        System.out.println("ESTRUCTURA DE CONTROL - CONDICIONALES");
        
        edad = 38;
        if (edad >=18 ){
            System.out.println("Es mayor de 18");
        }
        if (edad >= 38){
            System.out.println("No esta en el rango de edad");
        }
        else{
            System.out.println("Es menor de 18");
        }
        
        System.out.println("BUCLE FOR");
        
        
        
        for (int i = 0; i < 10; i++) {
           System.out.println("Numeros:" + i);  
        }
{
            for (int i = 1; i <= 5; i++) {
                System.out.println("Numeros:" + i);
                
    }
        }
        
        System.out.println("-------------");
        
        int [] numeros = {1,2,3,4,5};
        for (int j=0 ; j < numeros.length; j ++){
        System.out.println("Elemento" + j + ": " + numeros[j]);
    }
        
        System.out.println("-----------");
        System.out.println("BUCLE WHILE");
        
        int contador = 1 ;
        while (contador <= 5){
            System.out.println("Numeros:" + contador);
            contador ++ ;
        }{
        System.out.println("----------");
        System.out.println("WHILE ARREGLO");
        
        
        
        
        
       
        while (contador < numeros.length) {
           System.out.println("Numeros: " + contador + ": " + numeros [contador]);
           contador++;
        }
        
    }
    
}
