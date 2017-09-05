/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robot4;

/**
 *
 * @author udafk
 */

public class RobotLine {
    private double x1=0;
    private double y1=0;
    private double x2=0;
    private double y2=0;
    
    public RobotLine(double x1,double y1,double x2,double y2 ){
        this.x1=x1;
        this.y1=y1;        
        this.x2=x2;
        this.y2=y2;
    }
    public double getX1(){
        return x1;
    }
    
    public double getY1(){
        return y1;
    }    
    public double getX2(){
        return x2;
    }
    
    public double getY2(){
        return y2;
    }    
}
