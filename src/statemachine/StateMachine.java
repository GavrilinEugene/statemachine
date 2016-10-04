
package statemachine;

import java.util.regex.Pattern;

/**
 * Класс конченого автомата
 * @author gavrilin
 */
public class StateMachine {

    State state01;                      // 0-нечётно, 1 -нечётно
    State state011;                     // 0-нечётно, 1 -чётно
    State state001;                     // 0-чётно,   1 -нечётно
    State state0011;                    // 0-чётно,   1 -чётно
    
    State currentState;                 // текущее состояние
    State finalState;                   // заключительное состояние
    
    /**
     * Инициализация состояний автомата
     */
    public StateMachine(){
        state01 = new State01(this);
        state011 = new State011(this);
        state001 = new State001(this);
        state0011 = new State0011(this);
        currentState = state0011; 
        finalState = state001;
    }
    
    /**
     * Изменить текущее состояние
     * @param state новое текущее состояние
     */
    public void setCurrentState(State state){
        this.currentState = state;
    }
    
    /**
     * @return сосотояние 0-нечётно, 1 -нечётно
     */
    public State getState01(){
        return state01;
    }
    
    /**
     * @return сосотояние 0-нечётно, 1 -чётно
     */
    public State getState011(){
        return state011;
    }

    /**
     * @return сосотояние 0-чётно,   1 -нечётно
     */
    public State getState001(){
        return state001;
    }

    /**
     * @return сосотояние 0-чётно,   1 -чётно
     */
    public State getState0011(){
        return state0011;
    }    
    
    /**
     * Основной метод автомата. Определение - удовлетворяет строка условию
     * или нет
     * @param inputString вход конечного автомата
     */
    public void parseStringInput(String inputString){
        
        // проверка на отсутсвие неправильных символов
        if(!checkString(inputString))
            return;
        
        // бегаем по состояниям
        for(int i=0; i < inputString.length(); i++){
            char symbol = inputString.charAt(i);
            if(symbol == '0')
               currentState.parseZero();
            else
               currentState.parseOne(); 
        }
        
        // финальный результат
        giveTheAnswer();
    }
    
    /**
     * получить ответ
     */
    private void giveTheAnswer(){
        if(currentState == finalState)
            System.out.println("Yes");
        else
            System.out.println("No");          
    }
    
    /**
     * впроверка входа на корректность
     */
    private boolean checkString(String inputString){
        if(Pattern.matches("([0-1]*)", inputString))
            return true;
        System.out.println("StateMachine has found invailid symbols while parsing your imput string");
        return false;
    }
    
}
