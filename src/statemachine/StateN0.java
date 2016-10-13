
package statemachine;

/**
 * Правило автомата, когда строка содержала нечётное число нулей, заканичвается на ноль
 * @author gavrilin
 */
public class StateN0 implements State{

    StateMachineContains00Lasts11 stateMachine;
 
    /**
     * @param stateMachine конечный автомат
     */
    public StateN0(StateMachineContains00Lasts11 stateMachine){
        this.stateMachine = stateMachine;
    }
    
    @Override
    public void parseOne() {
        stateMachine.setCurrentState(stateMachine.getStateN0());
    }

    @Override
    public void parseZero() {
        stateMachine.setCurrentState(stateMachine.getState00());
    }
    
}
