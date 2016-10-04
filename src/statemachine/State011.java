
package statemachine;

/**
 * Состояние автомата с нечётным числом нулей и чётным числом единиц
 * @author gavrilin
 */
public class State011 implements State {

    StateMachine stateMachine;

    /**
     * @param stateMachine конечный автомат
     */    
    public State011(StateMachine stateMachine){
        this.stateMachine = stateMachine;
    }
    
    @Override
    public void parseOne() {
        stateMachine.setCurrentState(stateMachine.getState01());
    }

    @Override
    public void parseZero() {
        stateMachine.setCurrentState(stateMachine.getState0011());
    }
    
}
