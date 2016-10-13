
package statemachine;

import java.util.regex.Pattern;

/**
 * Класс конечного автомата, распознающего строку с чётным числом нудей и нечётным числом единиц
 * @author gavrilin
 */
public class StateMachineContainsEven0Odd1 extends StateMachineBase {

    State state01;                      // 0-нечётно, 1 -нечётно
    State state011;                     // 0-нечётно, 1 -чётно
    State state001;                     // 0-чётно,   1 -нечётно
    State state0011;                    // 0-чётно,   1 -чётно
    
    
    /**
     */
    public StateMachineContainsEven0Odd1(){
        state01 = new State01(this);
        state011 = new State011(this);
        state001 = new State001(this);
        state0011 = new State0011(this);
        currentState = state0011; 
        finalState = state001;
    }

    /**
     * @return правило, когда в строке 0-нечётно, 1 -нечётно
     */
    public State getState01(){
        return state01;
    }
    
    /**
     * @return правило, когда в строке, когда в строке 0-нечётно, 1 -чётно
     */
    public State getState011(){
        return state011;
    }

    /**
     * @return правило, когда в строке 0-чётно,   1 -нечётно
     */
    public State getState001(){
        return state001;
    }

    /**
     * @return правило, когда в строке 0-чётно,   1 -чётно
     */
    public State getState0011(){
        return state0011;
    }    
    
}
