
package statemachine;

/**
 * Правило автомата, когда строка содержала нечётное число нулей и нечётное число единиц
 * @author gavrilin
 */
public class State01 implements State{

    StateMachineContainsEven0Odd1 stateMachine;

    /**
     * @param stateMachine конечный автомат
     */    
    public State01(StateMachineContainsEven0Odd1 stateMachine){
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
