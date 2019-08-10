/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Dani Camacho
 */
public class Extraclase_Daniel2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner scanner = new Scanner(System.in);
        int dato1;
        int dato2;
        int resultado;
        
        System.out.println("Introduzca 2 numeros para dividirlos ");
        
        
        try{ System.out.println("Digita el primer numero: ");
             dato1 = scanner.nextInt();
             System.out.println("Digita el segundo numero: ");
             dato2 = scanner.nextInt();
             resultado = dato1/dato2;
            
             System.out.println("La division entera resultante es: " + resultado);
            
        }catch(InputMismatchException e){
            System.out.println("Los Datos ingresados deben ser numeros enteros"); 
            
        }catch(ArithmeticException e){
            System.out.println("No se puede hacer una division entre 0");
            
        }finally{
            System.out.println("Gracias por la visita");
        }
    }
}

