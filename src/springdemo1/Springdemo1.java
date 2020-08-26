/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdemo1;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import java.util.Locale;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
//import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.FileSystemResource;

/**
 *
 * @author Acer
 */
public class Springdemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  //  Triangle  triangle =new Triangle();
  //BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml")); 
ApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
  
  //ApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
   //Spring3HelloWorld myBean= (Spring3HelloWorld) context.getBean("Spring3HelloWorldBean");
  //context.registerShutdownHook();
   Shape shape=(Shape)context.getBean("circle");
   //Triangle triangle=(Triangle)context.getBean("triangle-alias1");
  // Triangle triangle=(Triangle)context.getBean("triangle-alias1");
   
        shape.draw();    
       // System.out.println("main method going to end");
   //     System.out.println("Message printing from main method"+context.getMessage("greeting",null,"Default greeting",null));
    
    
    }
    
}
