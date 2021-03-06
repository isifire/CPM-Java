
package contactomaestro;

/**
 *
 * @author Isidro Benitez Zapico UO285039
 */
public interface ImportaciónInterface {
    void Run();
    void Start(); // Empezó 
    void Finish(); // Terminó 
    void ProportionExecuted(float p); // Me indica la proporción de su ejecución
    void Message(String M); // Me indica que muestre un mensaje (Nº iteraciones)
    boolean Stop(); // Si retorna verdadero la tarea debe terminar
}
