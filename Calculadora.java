/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import java.util.ArrayList;

/**
 *
 * @author Shanti
 */
public class Calculadora {
    private String expresion;
    private double resultado;

    public Calculadora() {
    }
    
    public Calculadora(String expresion) {
        this.expresion = expresion;
    }

    public void setExpresion(String expresion) {
        this.expresion = expresion;
    }

    public double getResultado() {
        return resultado;
    }
    
    /* Método auxiliar que permite separar -por medio del método split() de la clase String
     * de Java- la cadena dada y guarda cada uno de sus elementos (operadores, operandos 
     * y paréntesis) en un arreglo de cadenas.
     */ 
    private String[] separaCadena(){
      return expresion.split("");
    }
    
     /* Método prioridades de los operadores. Regresa 3,
     * el valor más grande, cuando el dato dado es un "(". Si es
     * el "(" , sólo se saca de la pila cuando se encuentre un ")".
     */
     private int priorityOfOperators(String dato){
        int resp = 3; // si es un paréntesis izquierdo
        
        if (dato.charAt(0)=='+' || dato.charAt(0)=='-'){
                resp = 2;
        }//if
            else
                  if(dato.charAt(0)=='*' || dato.charAt(0)=='/'){
                    resp = 1;
                  }
                           else
                                  if(dato.charAt(0)=='^')
                                      resp=0;
        return resp;
    }//priorityOfOperators
   
    /* Método que revisa al operador actual y al operador que ya esta en la pila.
     * Calcula la prioridad del operador actual, es decir, calcula el numero de prioridad del
     * operador que está en el tope. Si el operador actual tiene un numero de prioridad menor
     * que el el operador que está en el tope de la pila, significa que tiene mayor importancia,
     * entonces regresará true, de lo contrario regresa false.
     */
    
    public boolean checkPriority(String currentOperator, String topOperator){
        if(priorityOfOperators(currentOperator)<priorityOfOperators(topOperator))
            return true;
        else
            return false;
    }//checkPriority
    
    public boolean analisis(){
        boolean answer=false;
        PilaADT<Character> pila= new PilaA();
        int i=0,n=expresion.length();
        while(i<n && !answer){
            if(expresion.charAt(i)=='('){
                pila.push(expresion.charAt(i));
            }//if
            else{
                if(expresion.charAt(i)==')'){
                     if(!pila.isEmpty())
                        pila.pop();
                     else
                        answer=true;
                }//if
              }  //else
            i++;
        }
       return pila.isEmpty() && !answer;
    }
     
    public ArrayList<String> convierteAPostfija(){
        ArrayList<String> expresionPostfija= new ArrayList();
        PilaADT<String> miPila=new PilaA();
        int i=0,n=expresion.length();
        
        while(i<n){
            if()
        }//while
    }//method
    
}//class
