/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdemo2;

/**
 *
 * @author Acer
 */

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  
  
public class Springdemo2 {  
    public static void main(String[] args) {  
          
        Resource r=new ClassPathResource("Spring.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
        Employee e=(Employee)factory.getBean("obj");  
        e.display();  
          
    }  
}  
