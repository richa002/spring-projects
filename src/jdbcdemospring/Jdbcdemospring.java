/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcdemospring;

import dao.HibernateDaoImpl;
import dao.JdbcDaoImpl;
//import dao.JdbcDaoimp;
import dao.SimpleJdbcDaoImpl;
import model.Circle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Acer
 */
public class Jdbcdemospring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
      // JdbcDaoImpl dao=(JdbcDaoImpl)context.getBean("jdbcDaoImpl");
        
   // Circle circle=dao.getCircle(1);
        //System.out.println(circle.getName());
         // System.out.println(dao.getCircelCount());  
         // System.out.println(dao.getCircleName(2));  
       // System.out.println(dao.getCircleforId(2).getName());
     // dao.insertCircle(new Circle(4,"fourth circle"));
       //  System.out.println(dao.getAllCircle().size());
      //dao.createTriangleTable();
      //JdbcDaoimp dao=(JdbcDaoimp)context.getBean("jdbcdaoimp");
   //   JdbcDaoimp dao=context.getBean("jdbcDaoimpl",JdbcDaoimp.class);  
     //  SimpleJdbcDaoImpl dao=(SimpleJdbcDaoImpl)context.getBean("simpleJdbcDaoImpl");
   HibernateDaoImpl dao=(HibernateDaoImpl)context.getBean("hibernateDaoImpl");
      
      System.out.println(dao.getCircelCount());
    }
}
