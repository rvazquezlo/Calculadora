/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg10;

import java.util.ArrayList;

/**
 *
 * @author DPEREZLAN
 */
public class noOperadoresRepetidos {
    
    public boolean esOperador(char x){
        ArrayList<Character> op= new ArrayList<Character>();
        op.add('+');
        op.add('-');
        op.add('*');
        op.add('/');
        if(op.contains(x))
            return true;
        else
            return false;
    }

    public boolean operadoresRepetidos(String cadena){
      PilaA <Character>pila= new PilaA();
        int i=0;
        while(i<cadena.length() && !esOperador(cadena.charAt(i)))
            i++;
        if(i<cadena.length())
            if(esOperador(cadena.charAt(i+1)))
                return false;
            else
                return true;
        else
            return true;
    }
}
