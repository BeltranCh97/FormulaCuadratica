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
    public static void main(String args[]) {
      double a=0;
      double b=-4;
      double c=2;

	//Se obtiene el resultado del divisor para saber si es mayor que 0
	//de ser menor o igual a sero la operacion no se efectua
      double x = divisor(a,b,c);
      if (x <= 0){
         System.out.println("No existe raizes"); 
      }else {          
          System.out.println("Resultado Primera Raiz: x1= " + div(divS(a, b, c),x));
          System.out.println("Resultado Segunda Raiz: x2= " + div(divR(a, b, c),x));
      }
    }  
	//Funcion Para obtener el resultado de una suma  
    public static double suma(double n, double n1){
        return n+n1;
    }
	//Funcion Para obtener el resultado de una resta
    public static double resta(double n, double n1){
        return n-n1;
    }
	//Funcion Para obtener el resultado de una multiplicacion
    public static double mul(double n, double n1){
        return n*n1;
    }
	//Funcion Para obtener el resultado de una divicion
    public static double div(double n, double n1){
        return n/n1;
    }
	//Funcion Para obtener el resultado de una raiz cuadrada
    public static double raiz(double n){
        return Math.sqrt(n);
    }
	//Funcion Para obtener el resultado de un exponente
    public static double exp(double n, double n1){
        return Math.pow(n,n1);
    }
	//Funcion que obtiene el resultado del dividendo 
	//de la funcion cuadratica con el signo suma 
    public static double divS(double a, double b, double c){
        double x1, x2, x3, x4, x5;
        //operacion 4*a*c
        x1 = mul(4,mul(a,c));
        //operacion b^2
        x2 = exp(b,2);
        // operacion (b^2) - (4*a*c)
        x3 = resta(x2,x1);
        //operacion raiz((b^2) - (4*a*c))
        x4 = raiz(x3);
        //operacion -1*b
        x5 = mul(-1,b);
        //operacion -b+raiz((b^2) - (4*a*c))
        return suma(x5,x4);
    }
	//Funcion que obtiene el resultado del dividendo 
	//de la funcion cuadratica con el signo resta
    public static double divR(double a, double b, double c){
        double x1, x2, x3, x4, x5;
        //operacion 4*a*c
        x1 = mul(4,mul(a,c));
        //operacion b^2
        x2 = exp(b,2);
        // operacion (b^2) - (4*a*c)
        x3 = resta(x2,x1);
        //operacion raiz((b^2) - (4*a*c))
        x4 = raiz(x3);
        //operacion -1*b
        x5 = mul(-1,b);
        //operacion -b-raiz((b^2) - (4*a*c))
        return resta(x5,x4);
    }
	//Funcion que obtiene el resultado del divisor de la funcion cuadratica
    public static double divisor(double a, double b, double c){
        return mul(2,a);
    }
}
