package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		Robot linus = new Robot();
		linus.move(10);
		linus.moveTo(60, 60);
		System.out.println("Hello Linus");
	
		
		
	}
}
