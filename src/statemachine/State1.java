
package statemachine;

/**
 * Правило автомата, когда строка содержала чётное число нулей, последняя единица
 * @author gavrilin
 */
public class State1 implements State{

    StateMachineContains00Lasts11 stateMachine;
 
    /**
     * @param stateMachine конечный автомат
     */
    public State1(StateMachineContains00Lasts11 stateMachine){
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
