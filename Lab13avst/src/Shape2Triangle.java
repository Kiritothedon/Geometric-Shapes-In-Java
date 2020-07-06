// Shape2Triangle.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape2Triangle implements Shape
{
	public Shape2Triangle () {
		// Just here to be here
	}
   public void drawShape(Graphics g)
   {
	   g.drawLine(500, 250, 700, 250);
	   g.drawLine(500, 250, 600, 100);
	   g.drawLine(600, 100, 700, 250);
	   int []xPoints = {500,700,500,600,600,700};
	   int []yPoints = {250,250,250,100,100,250};
	   int nPoints = 6;
	   g.fillPolygon(xPoints, yPoints, nPoints);
   }
   public void displayName(Graphics g)
   {
	g.drawString("Triangle", 420, 100);   
   }
   
   public void displayNumSides(Graphics g) {
	   g.drawString("A Triangle Has Three Sides", 520, 280);
   } 
   
   
}
