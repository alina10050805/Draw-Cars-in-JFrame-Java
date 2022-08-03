/**
 * class CarComponent
 * Assignment 2
 * @author Xiangyi Lin
 * draw four cars
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
This component draws two car shapes.
*/
public class CarComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{ 
		int x;
		int y;
		
		Graphics2D g2 = (Graphics2D) g;
		
		x = 30;
		y = 100;
		Car car1 = new Car(x, y, Color.YELLOW);
		
		x = 100;
		y = 100;
		Car car2 = new Car(x, y, Color.RED);
		
		x = 170;
		y = 100;
		Car car3 = new Car(x, y, Color.WHITE);
		
		x = 80;
		y = 200;
		Car car4 = new Car(x, y, 2);
		
		car1.draw(g2);
		car2.draw(g2); 
		car3.draw(g2);
		car4.draw(g2);
	}
}
