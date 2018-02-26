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
public class PilaA<T> implements PilaADT<T> {
    private T colec[];// vamos a guardar las pilas coleccion de datos
    private int tope;
    private final int MAX=10;
    
    /*
    Se construye un arreglo de objetos y se lo convierte a tipo T
    Inicialmente la pila ESTA VACIA lo que se indica con tope=-1
    */
    public PilaA(){
        colec=(T[])(new Object[MAX]);// ->instanciamos 
        tope=-1; //indica pila vacia
    }
    
     /*
    Se construye un arreglo de objetos y se lo convierte a tipo T
    El espacio maximo reservado queda determinado por el parametro max
    Inicialmente la pila esta vacia, tope=-1
    */
    
    public PilaA(int max){
        colec=(T[])(new Object[max]);
        tope=-1;
    }
    
    /*
        Regresa true si la pila esta vacia
        */
    public boolean isEmpty(){
            return tope==-1;
        }
        /*
        Agrega el dato en el tope redefiniendo el valor de este. Si la pila esta llena
        se construye un arreglo de mayor capacidad y se copian los elementos de la pila a este.
        */
        public void push(T dato){
            if(tope==colec.length-1)
                expandCapacity();
            tope++;
            colec[tope]=dato;
        }
       //este agranda el tamanio del arreglo, es privado porque no queremos que todo el mundo agrande la pila
        private void expandCapacity(){
            T nuevo[]= (T[]) new Object[colec.length*2];//este por 2 depende de lo que sea que haga el problema
            for(int i=0;i<=tope;i++)//for(int i=0,i<colec.length;i++) 
                nuevo[i]=colec[i];
            colec=nuevo;
        }
        /*
        Elimina y regresa el elemento que esta en el tope de la pila, redefiniendo el valor
        del tope
        */
        public T pop(){//lo borra y te regresa el objeto que quitaste
            T resp= null;
            if(!isEmpty()){
                resp=colec[tope];
                colec[tope]=null;
                tope--;
            }
            return resp;
        }
        /*
        Regresa el elemento que esta en el tope.
        */
        public T peek(){// te da el OBJETO
            T resp;
            if(isEmpty())
                resp=null;
               else
                resp= colec[tope];
            return resp;
        }
        //Para probar las excepciones
        /*
        Elimina y regresa el elemento que esta en el tope de la pila, redefiniendo
        el valor del tope. Si la pila esta vacia lanza una excepcion
        */
        public T popException(){
            if(isEmpty())
               throw new ExceptionColeccionVacia("Pila vacia");
            else{
                T dato=colec[tope];
                tope--;
                return dato;
            }
        }
        /*
        Regresa el elemento que esta en el tope. Si la pila esta vacia
        lanza una excepcion
        */
        public T peekException(){
            T resp;
            if(isEmpty())
                throw new ExceptionColeccionVacia("Pila vacia");
            else
                resp=colec[tope];
            return resp;
        }
        public int size(){
            return colec.length;
        }
}//class
