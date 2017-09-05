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
public class SimpleRobotListener implements RobotListener{

    @Override
    public void startMove(double x, double y) {
        System.out.println("Робот начал движение, координаты:" + x + "," + y);
    }

    @Override
    public void endMove(double x, double y) {
        System.out.println("Робот закончил движение, координаты:" + x + "," + y);
    }
    
}
