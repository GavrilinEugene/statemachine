/*
 * Copyright (C) 2016 gavrilin
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package statemachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * демо работы конечного автомата
 * @author gavrilin
 */
public class StateMachineDemo {
    
     public static void main(String[] args){
   
        System.out.println("Provide your input for StateMachine");
        String inputLineString = null;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        try{
           inputLineString = in.readLine(); 
        } catch(IOException ioe){
            System.err.println("IO error while trying to read your input");
        }
         
        StateMachine stateMachine = new StateMachine();
        stateMachine.parseStringInput(inputLineString);
    }
    
}
