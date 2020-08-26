/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdemo1;

import java.util.Locale;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Acer
 */
//@Controller---------------------specifies role of bean as well...along with being a component
//@Service
//@Repository
@Component
public class Circle implements Shape, ApplicationEventPublisherAware{
    private Point center;
    private ApplicationEventPublisher publisher; 
    
  @Autowired
    private MessageSource messageSource;
   //setter
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    public Point getCenter() {
        return center;
    }
    //@Required
  //  @Autowired
  //  @Qualifier("circlerelated")
    @Resource(name="point3")
    public void setCenter(Point center) {
        this.center = center;
    }
    public void draw(){
        System.out.println(this.messageSource.getMessage("drawing.circle",null,"Default messages",null));
        System.out.println(this.messageSource.getMessage("drawing.point",new Object[]{center.getX(),center.getY()},"Default messages",null));
        //System.out.println("Message from draw method of circle class "+this.messageSource.getMessage("greeting",null,"Default greeting",null));
       DrawEvent drawEvent=new DrawEvent(this);
        publisher.publishEvent(drawEvent);
    }
    @PostConstruct
     public void myinit(){
   //System.out.println("MyInit method of circle called");   
    }
     @PreDestroy
     public void cleanup(){
     //   System.out.println("mydesposable method of circle is called");
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher aep) {
    this.publisher=aep; 
    
    }

   
}
