package proyectopila;

/**
 * Esta clase permite instanciar objetos con la funcionalidad de una pila
 * @author Jerusa Chavero González
 * @author Marian Shanti Sánchez Barbero
 * @author Regina Vázquez Santa María López
 * @author Damián Pérez Landeros
 */
public class PilaA <T> implements PilaADT<T>{
    private T[] coleccion;
    private int tope;//ultimo elemento de la pila
    private final int MAX = 20;

    /**
     * Constructor vacio. El tamano de la pila se determina en la clase
     */
    public PilaA() {
        coleccion = (T[])new Object[MAX];
        tope = -1;
    }
    
    /**
     * Constructor
     * @param max: tamano que se quiere para la pila 
     */
    public PilaA(int max) {
        coleccion = (T[])new Object[max];
        tope = -1;
    }
    
    /**
     * Incrementa la capacidad de la pila incrementando su tamano antiguo 20 veces
     */
    private void expandCapacity(){
        int i;
        T[] expandido;
        
        expandido = (T[])new Object[coleccion.length * 20];
        for(i = 0; i < coleccion.length; i++)
            expandido[i] = coleccion[i];
        coleccion = expandido;
    }
    
    /**
     * Anade un objeto a la pila
     * @param dato: objeto que se quiere agregar 
     */
    @Override
    public void push(T dato) {
        if (tope == coleccion.length - 1)
            expandCapacity();
        coleccion[tope + 1] = dato;
        tope++;         
    }

    /**
     * Quita el ultimo elemento que fue agregado a la pila
     * @return: El elemento que fue sacado de la pila 
     * @see isEmpty
     */
    @Override
    public T pop() {
        T popped;
        
        if(isEmpty())
            popped = null;
        else{
            popped = coleccion[tope];
            tope--;
        }
        return popped;
    }

    /**
     * Permite tener acceso al ultimo elemento que fue agregado a la pila
     * @return: Ultimo elemento de la pila 
     * @see isEmpty
     */
    @Override
    public T peek() {
        T element;
        
        element = null;
        if(!isEmpty())
            element = coleccion[tope];
        return element;
    }

    /**
     * Determina si la pila esta vacia
     * @return <ul>
     * <li>true: si la pila esta vacia</li>
     * <li>false: si la pila no esta vacia</li>
     * </ul>   
     */
    @Override
    public boolean isEmpty() {
        return tope == -1;
    }   
}

    
