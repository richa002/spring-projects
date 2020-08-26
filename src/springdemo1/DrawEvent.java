/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdemo1;

import org.springframework.context.ApplicationEvent;

/**
 *
 * @author Acer
 */
public class DrawEvent extends ApplicationEvent{
    
    public DrawEvent(Object source) {
        super(source);
    }
    public String toString(){
        return "Draw event ocurred";
    }
    
}
