/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robot4;

import java.util.ArrayList;
import queue.Queue;

/**
 *
 * @author udafk
 */
public class Robot {
    private double x=0;
    private double y=0;
    protected double course=0;
    //private ArrayList<RobotLine> lines = new ArrayList<RobotLine>();
    private Queue queue=new Queue();
    
    private RobotListener listener;
    
    public Robot(double x, double y){
        this.x=x;
        this.y=y;
    }
// Метод для установки реального слушателя.
    public void setListener(RobotListener listener) {
        this.listener = listener;
    }
    
    public void forward(double distance){
        if(listener!=null){
            listener.startMove(x, y);
        }
        
        
        final double xOld=x;
        final double yOld=y;
        
        x += distance * Math.cos(course / 180 * Math.PI);
        y -= distance * Math.sin(course / 180 * Math.PI);
        //lines.add(new RobotLine(xOld, yOld, x, y));
        
        if(listener!=null){
            listener.endMove(x, y);
        }
                
        queue.push(new RobotLine(xOld, yOld, x, y));
    }
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public double getCourse(){
        return course;
    }    
    
    public void setCourse(double course){
        this.course=course;
    }        
    public RobotLine getLines() {
        return (RobotLine)queue.pull();
    }
    public int getSteps() {
        return queue.getSize();
    }
    
}
