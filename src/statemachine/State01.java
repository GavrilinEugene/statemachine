
package statemachine;

/**
 * Состояние автомата с нечётным числом нулей и нечётным числом единиц
 * @author gavrilin
 */
public class State01 implements State{

    StateMachine stateMachine;

    /**
     * @param stateMachine конечный автомат
     */    
    public State01(StateMachine stateMachine){
        this.stateMachine = stateMachine;
    }
    
    @Override
    public void parseOne() {
        stateMachine.setCurrentState(stateMachine.getState0011());
    }

    @Override
    public void parseZero() {
        stateMachine.setCurrentState(stateMachine.getState001());
    }
    
}
