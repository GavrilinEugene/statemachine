
package statemachine;

/**
 * Правило автомата, когда строка содержала чётное число нулей и заканчивалось на 11
 * @author gavrilin
 */
public class State11 implements State{

    StateMachineContains00Lasts11 stateMachine;
 
    /**
     * @param stateMachine конечный автомат
     */
    public State11(StateMachineContains00Lasts11 stateMachine){
        this.stateMachine = stateMachine;
    }
    
    @Override
    public void parseOne() {
        stateMachine.setCurrentState(stateMachine.getState11());
    }

    @Override
    public void parseZero() {
        stateMachine.setCurrentState(stateMachine.getStateN0());
    }
    
}
