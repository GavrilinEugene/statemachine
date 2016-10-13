
package statemachine;

/**
 * Правило автомата, когда строка содержала чётное число нулей и чётное число единиц
 * @author gavrilin
 */
public class State0011 implements State {

    StateMachineContainsEven0Odd1 stateMachine;
    
    /**
     * @param stateMachine конечный автомат
     */
    public State0011(StateMachineContainsEven0Odd1 stateMachine){
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
