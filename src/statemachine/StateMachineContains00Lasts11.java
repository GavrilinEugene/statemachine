
package statemachine;

import java.util.regex.Pattern;

/**
 * Конечный автомат, который распознаёт вход, содержащий чётное число нулей и заканчивающийся на две единицы
 * @author gavrilin
 */
public class StateMachineContains00Lasts11 extends StateMachineBase{
    State state00;                    // чётное число нулей
    State state1;                     // чётное число нулей, последняя 1
    State stateN0;                    // нечётное число нулей
    State state11;                    // чётное число нулей, последние 11
    
    /**
     */
    public StateMachineContains00Lasts11(){
        state00 = new State00(this);
        state1 = new State1(this);
        stateN0 = new StateN0(this);
        state11 = new State11(this);
        currentState = state00; 
        finalState = state11;
    }
       
    /**
     * @return правило, когда в строке чётное число нулей
     */
    public State getState00(){
        return state00;
    }
    
    /**
     * @return правило, когда в строке нечётное число нулей
     */
    public State getStateN0(){
        return stateN0;
    }

    /**
     * @return правило, когда в строке чётное число нулей, последняя 1
     */
    public State getState1(){
        return state1;
    }

    /**
     * @return правило, когда в строке  чётное число нулей, последние 11
     */
    public State getState11(){
        return state11;
    }    
}
