package me.brunosantana.java_examples.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotExample {
	
	public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();
        while (true){
            robot.delay(25000);
            robot.keyPress(KeyEvent.VK_O);
            robot.keyPress(KeyEvent.VK_I);
            robot.keyPress(KeyEvent.VK_SPACE);
            robot.keyPress(KeyEvent.VK_M);
            robot.keyPress(KeyEvent.VK_U);
            robot.keyPress(KeyEvent.VK_N);
            robot.keyPress(KeyEvent.VK_D);
            robot.keyPress(KeyEvent.VK_O);
            robot.keyPress(KeyEvent.VK_ENTER);
        }
    }

}
