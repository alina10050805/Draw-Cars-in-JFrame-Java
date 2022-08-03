/**
 * class Car
 * Assignment 2
 * @author Xiangyi Lin
 * draw four cars
 */

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
A car shape that can be positioned anywhere on the screen.
*/
public class Car 
{
	private int xLeft;
	private int yTop;
	private Color bodyColor;
	private boolean colorSeted = false;
	private int times = 1;
	
	/**
	 Constructs a car with a given top left corner.
	 @param x the x-coordinate of the top-left corner
	 @param y the y-coordinate of the top-left corner
	*/
	public Car(int x, int y)
	{
		xLeft = x;
		yTop = y;
	}
	
	/**
	 Constructs a car with a given top left corner.
	 @param x the x-coordinate of the top-left corner
	 @param y the y-coordinate of the top-left corner
	 @param color the body color of the car
	*/
	public Car(int x, int y, Color color)
	{
		xLeft = x;
		yTop = y;
		bodyColor = color;
		colorSeted = true;
	}
	
	/**
	 Constructs a car with a given top left corner.
	 @param x the x-coordinate of the top-left corner
	 @param y the y-coordinate of the top-left corner
	 @param carTimes the integer times of the car
	*/
	public Car(int x, int y, int carTimes)
	{
		xLeft = x;
		yTop = y;
		times = carTimes;
	}
	
	/**
	 Constructs a car with a given top left corner.
	 @param x the x-coordinate of the top-left corner
	 @param y the y-coordinate of the top-left corner
	 @param carTimes the integer times of the car
	 @param color the body color of the car
	*/
	public Car(int x, int y, int carTimes, Color color)
	{
		xLeft = x;
		yTop = y;
		times = carTimes;
		bodyColor = color;
		colorSeted = true;
	}
	
	/**
	 Draws the car.
	 @param g2 the graphics context
	*/
	public void draw(Graphics2D g2)
	{
		Rectangle body = new Rectangle(xLeft, yTop + 10*times, 60*times, 10*times);
		Ellipse2D.Double frontTire = new Ellipse2D.Double(xLeft + 10*times, yTop + 20*times, 10*times, 10*times);
		Ellipse2D.Double rearTire = new Ellipse2D.Double(xLeft + 40*times, yTop + 20*times, 10*times, 10*times);
		
		// The bottom of the front windshield
		Point2D.Double r1 = new Point2D.Double(xLeft + 10*times, yTop + 10*times);
		// The front of the roof
		Point2D.Double r2 = new Point2D.Double(xLeft + 20*times, yTop);
		// The rear of the roof
		Point2D.Double r3 = new Point2D.Double(xLeft + 40*times, yTop);
		// The bottom of the rear windshield
		Point2D.Double r4 = new Point2D.Double(xLeft + 50*times, yTop + 10*times);
		
		Line2D.Double frontWindshield = new Line2D.Double(r1, r2);
		Line2D.Double roofTop = new Line2D.Double(r2, r3);
		Line2D.Double rearWindshield = new Line2D.Double(r3, r4);
		
		if(colorSeted)
		{
			g2.setColor(bodyColor);
			g2.fill(body);
		}
		else
		{
			g2.draw(body);
		}
		g2.draw(frontWindshield); 
		g2.draw(roofTop); 
		g2.draw(rearWindshield); 
		
		g2.setColor(Color.BLACK);
		g2.fill(frontTire);
		g2.fill(rearTire);
	}
}
