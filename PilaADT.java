/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

/**
 *
 * @author Shanti
 */
public interface PilaADT<T> {
    public void push(T dato);//Agrega el dato en el tope de la pila
    public T pop();// Quita el elemento que esta en el tope y lo regresa
    public T peek();// Regresa el elemento que esta en el tope sin quitarlo
    public boolean isEmpty( );//Regresa TRUE si la pila no tiene elementos
    
}
