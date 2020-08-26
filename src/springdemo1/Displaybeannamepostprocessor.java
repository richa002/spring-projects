/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdemo1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 *
 * @author Acer
 */
public class Displaybeannamepostprocessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object o, String name) throws BeansException {
   //  System.out.println("In before initialization bean name :"+name);
          
    return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String name) throws BeansException {
        
     //   System.out.println("In after initialization bean name :"+name);
        return o;
    }
    
}
