
package statemachine;

import java.util.regex.Pattern;

/**
 * Базовый класс конечного автомата
 * реализует обход по строке, проверки и вывод
 * @author gavrilin
 */
public class StateMachineBase{
  
    protected State currentState;                 // текущее правило
    protected State finalState;                   // заключительное 
    
    /**
     * Изменить текущее состояние
     * @param state новое текущее состояние
     */
    public void setCurrentState(State state){
        this.currentState = state;
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
