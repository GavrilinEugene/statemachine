
package statemachine;

/**
 * Правило автомата, когда строка содержала чётное число нулей
 * @author gavrilin
 */
public class State00 implements State{

    StateMachineContains00Lasts11 stateMachine;
 
    /**
     * @param stateMachine конечный автомат
     */
    public State00(StateMachineContains00Lasts11 stateMachine){
        this.stateMachine = stateMachine;
    }
    
    @Override
    public void parseOne() {
        stateMachine.setCurrentState(stateMachine.getState1());
    }

    @Override
    public void parseZero() {
        stateMachine.setCurrentState(stateMachine.getStateN0());
    }
    
}
