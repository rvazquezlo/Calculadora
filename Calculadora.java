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
    
    //check whether the character that comes in the infix expression is either an 
    //operator or an operand
    public boolean isValid(){
        boolean resp;
        int i,n=expresion.length();
        
        while(i<n && )
    }
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
