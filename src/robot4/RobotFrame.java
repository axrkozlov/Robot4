/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robot4;

import javax.swing.JFrame;

/**
 *
 * @author udafk
 */
public class RobotFrame extends JFrame{
    public RobotFrame(Robot robot){
        setTitle("Robot Frame");
        
        add(new RobotPathComponent(robot));
        setBounds(100,100,1000,1000);
    }
}
