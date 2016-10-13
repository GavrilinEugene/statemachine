
package statemachine;

/**
 * Правило автомата, когда строка содержала чётное число нулей и нечётое число единиц
 * @author gavrilin
 */
public class State001 implements State{

    StateMachineContainsEven0Odd1 stateMachine;
 
    /**
     * @param stateMachine конечный автомат
     */
    public State001(StateMachineContainsEven0Odd1 stateMachine){
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
