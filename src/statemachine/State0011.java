
package statemachine;

/**
 * Состояние автомата с чётным числом нулей и чётным числом единиц
 * @author gavrilin
 */
public class State0011 implements State {

    StateMachine stateMachine;
    
    /**
     * @param stateMachine конечный автомат
     */
    public State0011(StateMachine stateMachine){
        this.stateMachine = stateMachine;
    }
    
    @Override
    public void parseOne() {
        stateMachine.setCurrentState(stateMachine.getState001());
    }

    @Override
    public void parseZero() {
        stateMachine.setCurrentState(stateMachine.getState011());
    }
    
}
