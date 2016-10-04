
package statemachine;

/**
 * Состояние автомата с чётным числом нулей и нечётным числом единиц
 * @author gavrilin
 */
public class State001 implements State{

    StateMachine stateMachine;
 
    /**
     * @param stateMachine конечный автомат
     */
    public State001(StateMachine stateMachine){
        this.stateMachine = stateMachine;
    }
    
    @Override
    public void parseOne() {
        stateMachine.setCurrentState(stateMachine.getState0011());
    }

    @Override
    public void parseZero() {
        stateMachine.setCurrentState(stateMachine.getState01());
    }
    
}
