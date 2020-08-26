/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdemo1;

import java.util.List;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 *
 * @author Acer
 */
public class Triangle implements Shape {
  /*  private String type;
    private int height;
    public Triangle(String type,int height){
    this.type=type;
    this.height=height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
  public Triangle(String type){
  this.type=type;
  }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void draw(){
        System.out.println(getType()+ " Triangle  of height"+getHeight()+"cm is drawn");
    }*/
  //-------------------------------------------------------------------------  
    
    private Point point1;
    private Point point2;
    private Point point3;

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }
    public void draw(){
        System.out.println(point1);
        System.out.println(point2);
    System.out.println(point3);
    
    }

  /*  private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }
    public void draw(){
    for(Point p:points){
        System.out.println(p);
    }*/
/*
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Init method called");   
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("desposable method is called");}
*/
    public void myinit(){
   //  System.out.println("MyInit method called");   
    
    }
    public void cleanup(){
     //    System.out.println("mydesposable method is called");
    }

    }
    
    

