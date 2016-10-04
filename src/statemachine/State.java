
package statemachine;

/**
 * Интерфейс состояния конечного автомата
 * для алфавита (0,1)
 * @author gavrilin
 */
public interface State {
    
    /**
     * Определение состояния, в случае, когда текущий символ входа 'единица'
     */
    public void parseOne();
 
    /**
     * Определение состояния, в случае, когда текущий символ входа 'ноль'
     */
    public void parseZero();
}
