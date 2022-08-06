/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.formulacuadratica;

/**
 *
 * @author BELTRAN CH
 */
public class FormulaCuadratica {

    
    public static void main(String[] args) {
        FormulaCuadratica ecuacion= new FormulaCuadratica();
        
        ecuacion.sumar(1, 2);
        ecuacion.exponencial(2, 3);
        
                        
    }
    
    public double sumar(double x, double y ){
        double suma;
        
        suma= x + y;
        System.out.println("El resultado de la suma es: "+ suma);
        return suma;
    }
    
    public double resta(double x, double y ){
        
        return x-y;
    }
    
    public double division(double x, double y ){
        
        return x/y;
    }
    
    public double multiplicacion(double x, double y ){
        
        return x*y;
    }
    
    public double raiz(double x){
        
        return Math.sqrt(x);
    }
    
    public double exponencial(double x, double y){
        double resultado= Math.pow(x, y);
        System.out.println("El resultado es: "+ String.valueOf(resultado));
        return resultado;
    }
        
}
