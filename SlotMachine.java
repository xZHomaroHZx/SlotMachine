import java.util.ArrayList;

/**
 * Simulador de una máquina tragamonedas (Slot Machine).
 */
public class SlotMachine {
    
    private ArrayList<Wheel> wheels;
    private boolean ok;
    private boolean isVisible;

    /**
     * Constructor: Inicializa la máquina sin ruedas y en estado invisible.
     */
    public SlotMachine() {
    }

    // --- REQUISITO 2: Administrar Ruedas ---

    /** Adiciona una rueda en la posición indicada. */
    public void addWheel(int pos) {
    }

    /** Elimina la rueda en la posición indicada. */
    public void delWheel(int pos) {
    }

    // --- REQUISITO 3: Administrar Símbolos ---

    /** Adiciona un símbolo (color) a todas las ruedas en la posición indicada. */
    public void addSymbol(int pos, String color) {
    }

    /** Elimina un símbolo específico de todas las ruedas. */
    public void delSymbol(String symbol) {
    }

    // --- REQUISITO 4: Girar las Ruedas ---

    /** Fija un símbolo específico en una rueda determinada. */
    public void placeSymbol(int wheel, String symbol) {
    }

    /** Gira únicamente la rueda indicada. */
    public void spin(int wheel) {
    }

    /** Gira todas las ruedas de la máquina de forma aleatoria. */
    public void spin() {
    }

    // --- REQUISITO 5: Consultar Símbolos ---

    /** Retorna los colores de los símbolos en el orden de la rueda. */
    public String[] symbols() {
        return null;
    }

    /** Retorna la cantidad de símbolos distintos visibles actualmente. */
    public int distinctSymbols() {
        return 0;
    }

    /** Retorna los colores visibles ordenados de izquierda a derecha. */
    public String[] configuration() {
        return null; 
    }

    // --- REQUISITO 6: Consultar Estado Ganador ---

    /** Retorna true si todas las ruedas muestran el mismo símbolo. */
    public boolean isjackpot() {
        return false;
    }

    // --- REQUISITO 7: Visibilidad ---

    /** Hace visible el simulador en pantalla. */
    public void makeVisible() {
    }

    /** Oculta el simulador de la pantalla. */
    public void makeInvisible() {
    }

    // --- REQUISITO 8: Finalizar ---

    /** Termina la ejecución del simulador. */
    public void exit() {
    }

    // --- MÉTODO DE ESTADO ---

    /** Indica si se logró realizar la última operación solicitada. */
    public boolean ok() {
        return ok;
    }
}