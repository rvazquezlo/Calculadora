package proyectopila;

/**
 * Esta interfaz define la fincionalidad de un pila
 * @author Jerusa Chavero González
 * @author Marian Shanti Sánchez Barbero
 * @author Regina Vázquez Santa María López
 * @author Damián Pérez Landeros
 */
public interface PilaADT <T> {
    void push(T dato);
    T pop();
    T peek();
    boolean isEmpty(); 
}

