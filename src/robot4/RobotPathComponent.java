/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robot4;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author udafk
 */
public class RobotPathComponent extends JComponent {
    private Robot robot;
    
    public RobotPathComponent(Robot robot){
        this.robot=robot;
    }
    @Override
    protected void paintComponent(Graphics g){
        //for (RobotLine rl:robot.getLines()){
          for (int i=0;i<robot.getSteps();){
            RobotLine rl=robot.getLines();
            int x1 = (int) Math.round(rl.getX1());
            int y1 = (int) Math.round(rl.getY1());
            int x2 = (int) Math.round(rl.getX2());
            int y2 = (int) Math.round(rl.getY2());
               g.drawLine(x1, y1, x2, y2);
               g.setColor(Color.magenta);
               
        }
    }
}
