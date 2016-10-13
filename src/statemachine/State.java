package statemachine;

/**
 * Интерфейс правила конечного автомата
 * для алфавита (0,1)
 * @author gavrilin
 */
public interface State {
    
    /**
     * Определение правила, в случае, когда текущий символ входа 'единица'
     */
    public void parseOne();
 
    /**
     * Определение правила, в случае, когда текущий символ входа 'ноль'
     */
    public void parseZero();
}
