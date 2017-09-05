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
public class RobotManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Robot robot=new Robot(500.,300.);
        RobotListener srl=new SimpleRobotListener();
        robot.setListener(srl);
        robot.setCourse(0.);
        robot.forward(50);
        robot.setCourse(-45.);
        robot.forward(100);
        robot.setCourse(90.);
        robot.forward(150);
        System.out.println(robot.getX()+" : "+robot.getY());
        System.out.println("new branch");
        
        /*
                // Количество сторон многоугольника
        final int COUNT = 33;
        // Длина стороны
        final int SIDE = 50;
 
        Robot robot = new Robot(400, 50);
        // Создаем замкнутую фигуру с количеством углов COUNT
        for (int i = 0; i < COUNT; i++) {
            robot.forward(SIDE);
            robot.setCourse(robot.getCourse() + 360. / COUNT);
        }
        */
        RobotFrame rf=new RobotFrame(robot);
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rf.setVisible(true);
    }
    
}
